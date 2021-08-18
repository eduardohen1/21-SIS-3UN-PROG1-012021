using CadMedalhas.controller;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CadMedalhas.model
{
    public class Atleta
    {
        //Atributos
        public int Codigo { get; set; }
        public string Nome { get; set; }
        public string Modalidade { get; set; }
        public string Nacionalidade { get; set; }

        //Métodos:
        public Atleta() { }
        public Atleta(int Codigo,
                      string Nome,
                      string Modalidade,
                      string Nacionalidade)
        {
            this.Codigo = Codigo;
            this.Nome = Nome;
            this.Modalidade = Modalidade;
            this.Nacionalidade = Nacionalidade;
        }

        public bool Gravar(InterfaceBD conexaoBD)
        {
            bool resposta = true;
            MySqlCommand comando;
            string sql = "";
            try
            {
                if (conexaoBD.conectar())
                {
                    //gravar
                    if(this.Codigo == 0)
                    {
                        //insert
                        sql = "INSERT INTO atleta(nome, " +
                              "modalidade, nacionalidade) values" +
                              "('" + this.Nome + "', '" + this.Modalidade + "'," +
                              "'" + this.Nacionalidade + "')";
                        comando = new MySqlCommand(sql, conexaoBD.getConexao());
                        comando.ExecuteNonQuery();
                        comando.Dispose();
                        conexaoBD.desconectar();
                    }
                    else {
                        //update
                        sql = "UPDATE atleta SET " +
                              "nome = '" + this.Nome + "', " +
                              "modalidade = '" + this.Modalidade + "', " +
                              "nacionalidade = '" + this.Nacionalidade + "' " +
                              "WHERE codigo = " + this.Codigo;
                        comando = new MySqlCommand(sql, conexaoBD.getConexao());
                        comando.ExecuteNonQuery();
                        comando.Dispose();
                        conexaoBD.desconectar();
                    }                    
                }
                else
                {
                    resposta = false;
                }
            }catch(Exception ex)
            {
                resposta = false;
            }

            return resposta;
        }

    }
}
