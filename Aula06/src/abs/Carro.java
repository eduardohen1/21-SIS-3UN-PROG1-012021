package abs;

public class Carro extends Veiculo {
	
	//atributos
	private float valorDiaria;
	
	//Construtor
	public Carro(String modelo, String placa, float valorDiaria) {
		super(modelo, placa);
		this.valorDiaria = valorDiaria;
	}

	@Override
	public float calcularAluguel(int qteDias) {
		return this.valorDiaria * qteDias;
	}

}
