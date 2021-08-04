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
        DadosConexao dadosConexao = new DadosConexao("localhost",
                                                     "root",
                                                     "123456",
                                                     "cadmedalhas");

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void btnOk_Click(object sender, EventArgs e)
        {
            txtNome.Text = dadosConexao.ToString();
        }

        private void btnConectar_Click(object sender, EventArgs e)
        {
            ConexaoBD conexaoBD = new ConexaoBD(dadosConexao);
            if (conexaoBD.conectar())
                MessageBox.Show("Conectou no BD!!");
            else
                MessageBox.Show("Não conectou :(");
        }
    }
}
