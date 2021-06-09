package tarefa;
import java.util.Scanner;

public class App {
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int opcao = 0;
      int polegadas, pes, milhas;
      double resposta = 0;
      /*
         opção:
         1 - polegadas para cm
         2 - pes para cm
         3 - milhas para km
         4 - sair
         X - sair
      */
      do{
         System.out.println(":: MENU ::::::::::::::::::::::::::::");
         System.out.println(":: 1 - Polegadas para centímetros ::");
         System.out.println(":: 2 - Pés para centímetros       ::");
         System.out.println(":: 3 - Milhas para quilômetros    ::");
         System.out.println(":: 4 - Sair                       ::");
         System.out.println("::::::::::::::::::::::::::::::::::::");
         System.out.print("Opção: ");
         opcao = Integer.parseInt(input.nextLine());
         switch(opcao){
            case 1:
               System.out.print("Digite polegadas: ");
               polegadas = Integer.parseInt(input.nextLine());
               resposta = Conversao.polegadasEmCentimetros(polegadas);
               System.out.println("Convertendo " + polegadas + " polegadas: " + resposta + "cm.");
               System.out.println("----------------------------------");
               System.out.println("");
               break;
            case 2:
               System.out.print("Digite pés: ");
               pes = Integer.parseInt(input.nextLine());
               resposta = Conversao.pesEmCentimetros(pes);
               System.out.println("Convertendo " + pes + " pés: " + resposta + "cm.");
               System.out.println("----------------------------------");
               System.out.println("");
               break;
            case 3:
               System.out.print("Digite milhas: ");
               milhas = Integer.parseInt(input.nextLine());
               resposta = Conversao.milhasEmQuilometros(milhas);
               System.out.println("Convertendo " + milhas + " milhas: " + resposta + "km.");
               System.out.println("----------------------------------");
               System.out.println("");
               break;
            case 4:
               System.out.println("Bye!!");
               System.out.println("----------------------------------");
               System.out.println("");
               break;
            default:
               /*   
               System.out.println("Bye!!");
               System.out.println("----------------------------------");
               System.out.println("");
               */
               System.out.println("Opção inválida!!");
               System.out.println("");
               opcao = 1;
               break;
         }
      }while(opcao > 0 && opcao < 4);
   }
}
