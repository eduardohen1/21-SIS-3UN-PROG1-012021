package montadora;
import java.util.Scanner;

public class Fabrica {
   //Método main para iniciar o programa:
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      Carro carroDoJao = new Carro("cor","marca","modelo",4,250,"Jao",50,1000);
      System.out.println("----------------------------");
      System.out.println(carroDoJao.toString());
      System.out.println("----------------------------");

      Carro carroDoTiao = new Carro("cor","marca","modelo",2,250,"Tiao",50);
      System.out.println("----------------------------");
      System.out.println(carroDoTiao.toString());
      System.out.println("----------------------------");
      
      //instanciar o carro do Zé
      System.out.print("Cor do carro do Zé: ");      
      String cor = input.nextLine();
      System.out.print("Marca do carro do Zé: ");      
      String marca = input.nextLine();
      System.out.print("Modelo do carro do Zé: ");      
      String modelo = input.nextLine();
      
      int numeroPortas;
      int velocidadeMaxima;
      String nome;
      int litrosCombustivel;
      int kmRodado;

      System.out.print("Número de portas do carro do Zé: ");
      numeroPortas = Integer.parseInt(input.nextLine());
      System.out.print("Velocidade máxima do carro do Zé: ");
      velocidadeMaxima = Integer.parseInt(input.nextLine());
      System.out.print("Nome do proprietário do carro do Zé: ");
      nome = input.nextLine();
      System.out.print("Qte de Litros de combustível do carro do Zé: ");
      litrosCombustivel = Integer.parseInt(input.nextLine());
      System.out.print("Quilometragem rodada do carro do Zé: ");
      kmRodado = Integer.parseInt(input.nextLine());

      Carro carroDoZe = new Carro(cor, marca, modelo, numeroPortas, velocidadeMaxima, nome, litrosCombustivel, kmRodado);
      System.out.println("----------------------------");
      System.out.println(carroDoZe.toString());
      System.out.println("----------------------------");
      
      /*
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
      //System.out.println(carroDoZe.toString());
      //System.out.println("----------------------------");

      /*
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
      */
      
      /*
      //Carro do Tiao
      System.out.println("----------------------------");
      Carro carroDoTiao = new Carro();
      carroDoTiao.setCor("cor");
      carroDoTiao.setMarca("marca");
      carroDoTiao.setModelo("modelo");
      carroDoTiao.setNumeroPortas(4);
      carroDoTiao.setVelocidadeMaxima(250);
      carroDoTiao.setNomeProprietario("Tiao");
      carroDoTiao.setKmRodados(1000);
      carroDoTiao.setLitrosCombustivel(50);
      System.out.println(carroDoTiao.toString());

      //criar uma viagem:
      //Saí de Passos e fui para Franca .. andei 90km // gastei 1/4 tanque
      carroDoTiao.atualizaKmRodados(90);
      carroDoTiao.atualizaTanqueCombustivel(12);
      System.out.println("----------------------------");
      System.out.println("DEPOIS DA VIAGEM:");
      System.out.println(carroDoTiao.toString());
      System.out.println("CONSUMO DE COMBUSTÍVEL: " + carroDoTiao.consumoCombustivel(90,12) + "km/l");
      System.out.println("----------------------------");
      */
   }

}
