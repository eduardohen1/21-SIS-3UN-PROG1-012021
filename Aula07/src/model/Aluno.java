package model;

public class Aluno extends Pessoa {
	//Atributos
	public String matricula;
	
	//Construtor
	public Aluno(String nome, String email, Integer idade, String matricula) {
		super(nome, email, idade);		
		this.matricula = matricula;
	}
	
	//Get Set
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * Rotina para verificar se o aluno é de maior com tratamento de exceção throws
	 * @return Verdadeiro ou Falso
	 * @throws Exception exceção da nossa aplicação
	 */
	public boolean alunoDeMaior() throws Exception {
		boolean resposta = false;
		if(super.getIdade() >= 18)
			resposta = true;
		return resposta;
	}
	
}
