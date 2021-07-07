package abs;

public class ConexaoMySQL implements InterfaceBD {

	@Override
	public void conectar(String servidor) {
		System.out.println("MySQL conectar: " + servidor);		
	}

	@Override
	public void executar(String SQL) {
		System.out.println("MySQL executar: " + SQL);
	}

	@Override
	public void desconectar(String servidor) {
		System.out.println("MySQL desconectar: " + servidor);
	}

}
