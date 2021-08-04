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
    public class ConexaoBD
    {
        //Atributos
        public MySqlConnection conexao = new MySqlConnection();
        DadosConexao dadosConexao = null;

        //Construtor:
        public ConexaoBD(DadosConexao dadosConexao)
        {
            this.dadosConexao = dadosConexao;
        }

        //métodos:
        public bool conectar()
        {
            //testar se o objeto dadosConexao é diferente de null
            if(dadosConexao != null)
            {
                try
                {
                    string sql = "Server="   + dadosConexao.host     + ";" + 
                                 "Database=" + dadosConexao.dataBase + ";" +
                                 "Uid="      + dadosConexao.usuario  + ";" +
                                 "Pwd="      + dadosConexao.senha    + ";" +
                                 "Connection Timeout=900;" +
                                 "Port="     + dadosConexao.porta.ToString();
                    conexao = new MySqlConnection(sql);
                    conexao.Open();
                    return true;
                }catch(Exception ex)
                {
                    MessageBox.Show("Erro ao conectar no banco de dados: " + ex.ToString());
                    return false;
                }
            }
            else
            {
                return false;
            }
        }

    }
}
