package abs;

public class ConexaoSQLServer implements InterfaceBD {

	@Override
	public void conectar(String servidor) {
		System.out.println("SQL Server conectar: " + servidor);
	}

	@Override
	public void executar(String SQL) {
		System.out.println("SQL Server executar: " + SQL);
	}

	@Override
	public void desconectar(String servidor) {
		System.out.println("SQL Server desconectar: " + servidor);
	}
	
	
	
}
