package tarefa;

public class Conversao {

   //atributos
   private static final double POLEGADAS =  2.54;
   private static final double PES       = 30.48;
   private static final double MILHAS    = 1.609;
   
   public static double polegadasEmCentimetros(int polegadas){
      double resposta = polegadas * POLEGADAS;      
      return resposta;
   }
   public static double pesEmCentimetros(int pes){
      double resposta = pes * PES;
      return resposta;
   }
   public static double milhasEmQuilometros(int milhas){
      double resposta = milhas * MILHAS;
      return resposta;
   }

}
