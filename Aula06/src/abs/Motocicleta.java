package abs;

//Na locadora o aluguel de motocicleta tem desconto de X% na diária
public class Motocicleta extends Veiculo {
	//Atributos
	private float valorDiaria;
	private float valorDesconto;
	
	//Construtor
	public Motocicleta(String modelo, String placa,
			           float valorDiaria, float valorDesconto) {
		super(modelo, placa);
		this.valorDesconto = valorDesconto;
		this.valorDiaria = valorDiaria;
	}

	//Valor diaria 30, qte dias 3 em 10%:
	//30 * 3 - (30 * 3 * 10 / 100)	
	@Override
	public float calcularAluguel(int qteDias) {
		return this.valorDiaria * qteDias - 
			   (this.valorDiaria * qteDias * this.valorDesconto / 100);
	}
	
	
}
