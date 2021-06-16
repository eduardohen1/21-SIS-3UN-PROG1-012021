import java.util.Scanner;

import javax.swing.text.Style;

public class app {
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      pessoa p = new pessoa();
      //gravando novo usuario:
      p.nome = "Eduardo";
      p.email = "email@email.com";
      p.telefone = "3599999999";

      p.setNumTelegram("asdfasdfasdf");

      //qual o meu id?
      int i = p.getId();
      String n = p.getNumTelegram();
      
      System.out.println("Programa java");


      p.setSenha("novasenha");
      
      int resposta = p.soma(10, 10);      
      //----------------------------------------------
      //Aula dia 15/06/2021
      //declarar uma variável do tipo Escola == Objeto
      escola e1 = new escola(); // <=== Crio objeto e1
      System.out.println("-----------------------");
      System.out.println(e1.getNome());
      e1.setNome("Mudando o nome da escola");
      System.out.println("-----------------------");
      System.out.println(e1.getNome());
      //pegando dado da console:
      System.out.print("Digite um novo nome: ");
      String novoNome = input.nextLine();
      e1.setNome(novoNome);
      System.out.println("-----------------------");
      System.out.println(e1.getNome());
      //-----------------
      System.out.print("Digite o telefone: ");  
      e1.setTelefone(input.nextLine());
      System.out.println("-----------------------");
      System.out.println(e1.getTelefone());
      //----------------------------------------------
      //Criando o objeto Carro c1:
      carro c1 = new carro();
      carro c2 = new carro("vermelho", 1950);
      carro c3 = new carro("Azul","Volks",2000);
      //----------------------------------------------
      //Criando o objeto Usuario
      usuario u1 = new usuario("usuario1","senha", "dicaSenha");
      usuario u2 = new usuario("usuario2","senha", "dicaSenha");
      usuario u3 = new usuario("usuario3");
      
      System.out.println("-----------------------");
      System.out.println(u3.getDataCadastro());
      //--------------------------------------
      //Utilizando métodos estáticos:
      double resposta1 = funcoes.polegadasEmCentimetros(15);
      System.out.println("15 polegadas = " + resposta1 + "cm");

      int resposta2 = funcoes.notaComPeso(7);
      System.out.println("Nota 7 com peso 10 = " + resposta2);

      int resposta3 = funcoes.soma(10,15,20);
      int resposta4 = funcoes.soma(1,2,3,4);

      System.out.println("Variação do meu programa: " + funcoes.VARIACAO);
      System.out.println("Versão do meu programa: " + funcoes.VERSAO);

      // vou mudar o nível de acesso o u3:
      u3.setNivelAcesso(usuario.ADMINISTRADOR);
   }
}