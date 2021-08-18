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

        //Atributos
        public MySqlConnection conexaoMySQL = new MySqlConnection();

        //Métodos:
        public MySqlConnection conexao()
        {
            return conexaoMySQL;
        }

        public bool conectar(DadosConexao dadosConexao)
        {
            bool resposta = false;
            try
            {
                //testar se a variável de conexão está aberta
                if (conexaoMySQL.State == System.Data.ConnectionState.Open)
                    desconectar();
                if(dadosConexao != null)
                {
                    string sql = "Server=" + dadosConexao.host + ";" +
                                 "Database=" + dadosConexao.dataBase + ";" +
                                 "Uid=" + dadosConexao.usuario + ";" +
                                 "Pwd=" + dadosConexao.senha + ";" +
                                 "Connection Timeout=900;" +
                                 "Port=" + dadosConexao.porta.ToString();
                    conexaoMySQL = new MySqlConnection(sql);
                    conexaoMySQL.Open();
                    resposta = true;
                }
            }catch(Exception ex)
            {
                MessageBox.Show("Erro ao conectar com o banco de dados:\n" + ex.ToString(),
                                "Aplicação",
                                MessageBoxButtons.OK,
                                MessageBoxIcon.Error);
            }
            return resposta;
        }
                
        public bool desconectar()
        {
            bool resposta = false;
            try
            {
                if (conexaoMySQL.State == System.Data.ConnectionState.Open)
                    conexaoMySQL.Close();
                resposta = true;
            }catch(Exception ex)
            {
                MessageBox.Show("Erro ao conectar com o banco de dados:\n" + ex.ToString(),
                                "Aplicação",
                                MessageBoxButtons.OK,
                                MessageBoxIcon.Error);
            }
            return resposta;
        }
    }
}
