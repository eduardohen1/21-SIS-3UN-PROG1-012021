using CadMedalhas.model;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CadMedalhas.controller
{
    public interface InterfaceBD
    {
        public MySqlConnection conexao();
        public bool conectar(DadosConexao dadosConexao);
        public bool desconectar();

    }
}
