package abs;

// Tipo genérico de classe
// todo método que herdar e veículo vai ter modelo e placa. <==herança
public abstract class Veiculo {
	//Atributos
	private String modelo;
	private String placa;
	
	//Construtor
	public Veiculo(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}

	//Gets Sets
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	//método:
	/*
	 * Este método não tem lógica de programação:
	 *  - Toda a classe que colocar para herdar essa classe será obrigado
	 *  que tenha um método chamado calcularAluguel com o parâmetro
	 *  qteDias int e criar a lógica (regra de negócio)
	 */
	public abstract float calcularAluguel(int qteDias);
	
}
