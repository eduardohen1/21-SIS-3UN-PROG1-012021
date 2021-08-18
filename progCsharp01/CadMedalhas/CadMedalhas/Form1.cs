using CadMedalhas.controller;
using CadMedalhas.model;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CadMedalhas
{
    public partial class Form1 : Form
    {
        //Atributo
        DadosConexao dadosConexaoMySQL = new DadosConexao("192.168.12.112",
                                                          "aula",
                                                          "123456",
                                                          "cadmedalhas",
                                                          3306);
        DadosConexao dadosConexaoMariaDB = new DadosConexao("192.168.12.112",
                                                            "aula",
                                                            "123456",
                                                            "cadmedalhas",
                                                            3307);
        /// <summary>
        /// 0 - MySQL
        /// 1 - MariaDB
        /// </summary>
        int qualBD;
        public InterfaceBD conexaoBD { get; set; }

        public Form1()
        {
            InitializeComponent();
            qualBD = 0;
            if (qualBD == 0)
                conexaoBD = new ConexaoBDMySQL(dadosConexaoMySQL); //mysql
            else
                conexaoBD = new ConexaoBDMariaBD(dadosConexaoMariaDB); //mariadb
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void novoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form2 form2 = new Form2(this);
            form2.Show();
        }

        /*private void btnOk_Click(object sender, EventArgs e)
        {
            txtNome.Text = dadosConexaoMySQL.ToString();
        }

        private void btnConectar_Click(object sender, EventArgs e)
        {
            bool conectou = false;
            InterfaceBD conexaoBD;
            if(qualBD == 0)
            {
                //Mysql
                conexaoBD = new ConexaoBDMySQL();
                conectou = conexaoBD.conectar(dadosConexaoMySQL);
            }
            else
            {
                //MariaDB
                conexaoBD = new ConexaoBDMariaBD();
                conectou = conexaoBD.conectar(dadosConexaoMariaDB);
            }
            if (conectou)
            {
                MessageBox.Show("Conectou!");
                conexaoBD.desconectar();
            }
            else
            {
                MessageBox.Show("Não conectou!");
            }

        }
        */
    }
}
