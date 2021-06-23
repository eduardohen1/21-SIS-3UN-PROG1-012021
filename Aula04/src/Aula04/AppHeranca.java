package Aula04;

public class AppHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Nome1","email1@email.com");
		
		System.out.println(p.toString());
		
		Funcionario f = new Funcionario("Nome2","email2@email.com",7000);
		System.out.println(f.toString());
		f.setNome("Nome do funcionário");
		System.out.println(f.toString());	
		
		Funcionario f2 = new Funcionario("Nome3","email3@email.com",20,6500);
		System.out.println(f2.toString());
		
	}

}
