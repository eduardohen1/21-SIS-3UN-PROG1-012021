package abs;

public class Caminhonete extends Veiculo {
	private float valorDiaria;
	private float fatorRisco;
	
	public Caminhonete(String modelo, String placa, 
				       float valorDiaria, float fatorRisco) {
		super(modelo, placa);
		this.valorDiaria = valorDiaria;
		this.fatorRisco = fatorRisco;
	}
	
	@Override
	public float calcularAluguel(int qteDias) {
		return this.valorDiaria * qteDias + fatorRisco;
	}	
	
}
