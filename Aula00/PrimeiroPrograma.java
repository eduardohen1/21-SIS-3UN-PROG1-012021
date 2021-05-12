//primeira classe
public class PrimeiroPrograma{
   public static void main(String args[]){
      /*System.out.println(">>>> Olá mundo!");
         aqui é um grande comentário      
      */
      //declaração de variáveis
      int a = 5;
      a = 5 + 11;
      System.out.println("O valor de 'a' é: " + a);
      a = a * 2;

      //estrutura de decisão
      if(a < 10){
         System.out.println("'a' é menor que 10");
      }else{
         System.out.println("'a' é maior ou igual a 10");
      }
      for(int x = 0; x <10; x++){
         System.out.println("- x: " + x);
      }

      //array
      int[] vetor = new int[10];

      for(a = 0; a < vetor.length; a++){
         vetor[a] = a;
      }
      System.out.println("Array: " + vetor[1]);

      //array de array
      System.out.println("----------------------------------");
      int[][] matriz = new int[2][3];
      for(int i = 0; i < matriz.length; i++){
         System.out.println("Linha: " + i);
         for(int j = 0; j < matriz[i].length; j++){
            matriz[i][j] = i+1;
            System.out.println("Valores da coluna:");
            System.out.println(matriz[i][j]);
         }
      }

   }
}