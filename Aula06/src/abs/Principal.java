package abs;

public class Principal {

	public static void main(String[] args) {
		/*
		Carro c1 = new Carro("Onix","UUU1111",50);
		Motocicleta m1 = new Motocicleta("Honda", "MMM2222", 40, 10);
		
		System.out.println("Veículo: " + c1.getModelo() +
						   " Aluguel R$" + c1.calcularAluguel(5)
				);
		
		System.out.println("Veículo: " + m1.getModelo() +
				   " Aluguel R$" + m1.calcularAluguel(5)
		);	
		*/	
		Veiculo estoque[];//vetor de veículos		
		estoque = new Veiculo[5];
		
		estoque[0] = new Carro("Onix", "aaaaa",50);
		estoque[1] = new Carro("Ka","bbbb",45);
		estoque[2] = new Motocicleta("Yamaha","cccc",40,15);
		estoque[3] = new Caminhonete("Fiat", "eeee", 200, 100);
		estoque[4] = new Motocicleta("Honda","fffff",50,20);
		
		/*
		for(int i=0; i<5;i++) {
			Veiculo v = estoque[i];
			String x = v.getModelo();
		}
		*/		
		for(Veiculo v : estoque) {
			System.out.println(
					"Veículo: " + v.getModelo() +
					" Valor diária R$" + v.calcularAluguel(3)
					);
		}
		
		//Simulando Interfaces:
		ConexaoSQLServer con = new ConexaoSQLServer();
		con.conectar("servidor");
		con.executar("SELECIONE * DA TABELA_X");
		con.desconectar("servidor");
		System.out.println("************************");
		
		int qualBD = 1; //0 = MySQL; 1 = SQL Server
		InterfaceBD conexaoBD;
		if(qualBD == 0) {
			conexaoBD = new ConexaoMySQL();
		}else {
			conexaoBD = new ConexaoSQLServer();
		}
		conexaoBD.conectar("servidor");
		conexaoBD.executar("SELECT * FROM TABELA_A");
		conexaoBD.desconectar("servidor");
		
	}

}
