using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using CadMedalhas.model;
using MySql.Data.MySqlClient;

namespace CadMedalhas.controller
{
    public class ConexaoBDMySQL : InterfaceBD
    {
        //Atributos:
        MySqlConnection conexaoMySQL = new MySqlConnection();//objeto conexão (tomada)

        //Métodos
        public bool conectar(DadosConexao dadosConexao)
        {
            //testar se o objeto dadosConexao é diferente de null
            if (dadosConexao != null)
            {
                try
                {
                    string sql = "Server=" + dadosConexao.host + ";" +
                                 "Database=" + dadosConexao.dataBase + ";" +
                                 "Uid=" + dadosConexao.usuario + ";" +
                                 "Pwd=" + dadosConexao.senha + ";" +
                                 "Connection Timeout=900;" +
                                 "Port=" + dadosConexao.porta.ToString();
                    conexaoMySQL = new MySqlConnection(sql);
                    conexaoMySQL.Open();
                    return true;
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Erro ao conectar no banco de dados:\n" + 
                                    ex.ToString(),
                                    "Título do app - MySQL",
                                    MessageBoxButtons.OK,
                                    MessageBoxIcon.Error);
                    return false;
                }
            }
            else
            {
                return false;
            }
        }

        public MySqlConnection getConexao()
        {
            return conexaoMySQL;
        }

        public bool desconectar()
        {
            try
            {
                if (conexaoMySQL.State == System.Data.ConnectionState.Open)
                    conexaoMySQL.Close();
                return true;
            }catch(Exception ex)
            {
                MessageBox.Show("Erro ao desconectar do banco de dados:\n" +
                                ex.ToString(),
                                "Título do app - MySQL",
                                MessageBoxButtons.OK,
                                MessageBoxIcon.Error);
                return false;
            }
        }
    }
}
