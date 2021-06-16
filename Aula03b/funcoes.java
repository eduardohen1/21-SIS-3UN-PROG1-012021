public class funcoes {

   //Atributos estáticos - Constantes:
   public static final int PESO      = 10;
   public static final int VARIACAO  =  5;
   public static final String VERSAO = "3.0.123";
   
   public static final double POLEGADAS =  2.54;
   public static final double PES       = 30.48;
   public static final double MILHAS    = 1.609; 

   //métodos de cálculos:
   public static double polegadasEmCentimetros(int polegadas){
      double resposta = polegadas * POLEGADAS;
      return resposta;
   }

   public static int notaComPeso(int nota){
      return nota * PESO;
   }

   public static int soma(int x, int y, int z){
      return x + y + z;
   }

   public static int soma(int a, int b, int c, int d){
      return a + b + c + d;
   }

}
