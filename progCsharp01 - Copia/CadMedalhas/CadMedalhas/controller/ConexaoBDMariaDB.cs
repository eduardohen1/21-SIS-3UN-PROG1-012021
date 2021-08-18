using CadMedalhas.model;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CadMedalhas.controller
{
    public class ConexaoBDMariaDB : InterfaceBD
    {
        //Atributos
        public MySqlConnection conexaoMariaDB = new MySqlConnection();

        //Métodos:
        public MySqlConnection conexao()
        {
            return conexaoMariaDB;
        }
        public bool conectar(DadosConexao dadosConexao)
        {
            bool resposta = false;
            try
            {
                //testar se a variável de conexão está aberta
                if (conexaoMariaDB.State == System.Data.ConnectionState.Open)
                    desconectar();
                if (dadosConexao != null)
                {
                    string sql = "Server=" + dadosConexao.host + ";" +
                                 "Database=" + dadosConexao.dataBase + ";" +
                                 "Uid=" + dadosConexao.usuario + ";" +
                                 "Pwd=" + dadosConexao.senha + ";" +
                                 "Connection Timeout=900;" +
                                 "Port=" + dadosConexao.porta.ToString();
                    conexaoMariaDB = new MySqlConnection(sql);
                    conexaoMariaDB.Open();
                    resposta = true;
                }
            }
            catch (Exception ex)
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
                if (conexaoMariaDB.State == System.Data.ConnectionState.Open)
                    conexaoMariaDB.Close();
                resposta = true;
            }
            catch (Exception ex)
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
