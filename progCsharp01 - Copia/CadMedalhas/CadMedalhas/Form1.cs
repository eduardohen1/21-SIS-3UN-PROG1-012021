using CadMedalhas.controller;
using CadMedalhas.model;
using MySql.Data.MySqlClient;
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
        DadosConexao dadosConexaoMysql = new DadosConexao("localhost",
                                                          "root",
                                                          "123456",
                                                          "cadmedalhas");
        DadosConexao dadosConexaoMariaDB = new DadosConexao("192.168.12.107",
                                                          "root",
                                                          "123456",
                                                          "cadmedalhas",
                                                          3307);
        int qualBD = 1; //0 MySQL, 1 MariaDB
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void btnOk_Click(object sender, EventArgs e)
        {
            txtNome.Text = dadosConexaoMysql.ToString();
        }

        private void btnConectar_Click(object sender, EventArgs e)
        {
            InterfaceBD conexaoBD;
            switch (qualBD)
            {
                case 0:
                    conexaoBD = new ConexaoBDMySQL();
                    break;
                case 1:
                    conexaoBD = new ConexaoBDMariaDB();
                    break;
                default:
                    conexaoBD = new ConexaoBDMySQL();
                    break;
            }
            MySqlCommand comando = null;
            comando = new MySqlCommand("", conexaoBD.conexao());
            
        }
    }
}
