using CadMedalhas.controller;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

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

        /// <summary>
        /// Rotina de busca de atletas no banco de dados
        /// </summary>
        /// <param name="conexaoBD">Objeto de conexão com o BD</param>
        /// <param name="codigo">Código presente no txtCodigo.Text</param>
        /// <param name="tipoBusca">0: próximo; 1: anterior</param>
        /// <returns></returns>
        public Atleta buscar(InterfaceBD conexaoBD, int codigo, int tipoBusca)
        {
            //zero o objeto
            this.Codigo = 0;
            this.Nome = "";
            this.Modalidade = "";
            this.Nacionalidade = "";
            try
            {
                MySqlCommand comando = null;
                MySqlDataReader dataReader = null;
                string sql;
                if (conexaoBD.conectar())
                {
                    sql = "SELECT * FROM atleta WHERE codigo ";
                    if (tipoBusca == 0)
                        sql += " > " + codigo + " ORDER BY codigo ASC LIMIT 1";
                    else
                        sql += " < " + codigo + " ORDER BY codigo DESC LIMIT 1";
                    comando = new MySqlCommand(sql, conexaoBD.getConexao());
                    /*Aplicando comando no banco de dados e o retorno será
                     * colocado no dataReader que funciona com um vetor */
                    dataReader = comando.ExecuteReader();
                    if (dataReader.HasRows)
                    {
                        while (dataReader.Read())
                        {
                            this.Codigo = int.Parse(dataReader["codigo"].ToString());
                            this.Nome = dataReader["nome"].ToString();
                            this.Modalidade = dataReader["modalidade"].ToString();
                            this.Nacionalidade = dataReader["nacionalidade"].ToString();
                        }
                    }
                    dataReader.Dispose();
                    dataReader.Close();
                    comando.Dispose();
                    conexaoBD.desconectar();
                }

            }catch(Exception ex)
            {
                MessageBox.Show("Erro: " + ex.Message);
            }
            return this;
        }

        public bool deletar(InterfaceBD conexaoBD)
        {
            bool resposta = false;
            try
            {
                MySqlCommand comando = null;
                string sql;
                if (conexaoBD.conectar())
                {
                    sql = "DELETE FROM atleta WHERE codigo = " + this.Codigo;
                    comando = new MySqlCommand(sql, conexaoBD.getConexao());
                    comando.ExecuteNonQuery();
                    comando.Dispose();
                    conexaoBD.desconectar();
                    resposta = true;
                }
            }catch(Exception ex)
            {
                MessageBox.Show("Erro: " + ex.Message);
            }
            return resposta;
        }

    }
}
