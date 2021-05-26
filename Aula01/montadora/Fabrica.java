package montadora;
import java.util.Scanner;

public class Fabrica {
   //Método main para iniciar o programa:
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      Carro carroDoJao = new Carro(); //carroDoJao é um objeto
      System.out.println("CARRO DO JÃO:");
      carroDoJao.andar();
      carroDoJao.parar();
      System.out.println("----------------------------");

      //instanciar o carro do Zé
      Carro carroDoZe = new Carro();
      System.out.println("CARRO DO ZÉ:");
      //setar variáveis:
      carroDoZe.setCor("Vermelho");
      carroDoZe.setMarca("VW");
      carroDoZe.setModelo("Calhambeque");
      System.out.println("----------------------------");
      //recuperar variáveis:
      /*
      System.out.println("Cor: " + carroDoZe.getCor());
      System.out.println("Marca: " + carroDoZe.getMarca());
      System.out.println("Modelo: " + carroDoZe.getModelo());
      */
      /*
      String resposta;
      resposta = "Cor: "    + carroDoZe.getCor()   + "\n" +
                 "Marca: "  + carroDoZe.getMarca() + "\n" +
                 "Modelo: " + carroDoZe.getModelo();
      System.out.println(resposta);
      */
      System.out.println(carroDoZe.toString());
      System.out.println("----------------------------");

      //inserir as informações do carro do jão:
      System.out.print("Cor do carro do Jão: ");
      String cor = input.nextLine();
      
      System.out.print("Marca do carro do Jão: ");
      String marca = input.nextLine();
      System.out.print("Modelo do carro do Jão: ");
      String modelo = input.nextLine();

      //novos campos: numeroPortas; velocidadeMaxima; nomeProprietario
      System.out.print("Num. portas do carro do Jão: ");
      int numeroPortas = Integer.parseInt(input.nextLine()); //convertendo String para Integer

      System.out.print("Velocidade maxima do carro do Jão: ");
      int velocidadeMaxima = Integer.parseInt(input.nextLine()); //convertendo String para Integer

      System.out.print("Nome do proprietário do carro do Jão: ");
      String nomeProprietario = input.nextLine();

      System.out.println("----------------------------");
      carroDoJao.setCor(cor);
      carroDoJao.setMarca(marca);
      carroDoJao.setModelo(modelo);
      carroDoJao.setNumeroPortas(numeroPortas);
      carroDoJao.setVelocidadeMaxima(velocidadeMaxima);
      carroDoJao.setNomeProprietario(nomeProprietario);

      
      System.out.println(carroDoJao.toString());
      System.out.println("----------------------------");
   }

}
