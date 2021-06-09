public class app {
   public static void main(String args[]){
      pessoa p = new pessoa();
      //gravando novo usuario:
      p.nome = "Eduardo";
      p.email = "email@email.com";
      p.telefone = "3599999999";
      p.setNumTelegram("asdfasdfasdf");

      //qual o meu id?
      int i = p.getId();
      String n = p.getNumTelegram();
      
      System.out.print("Programa java");


      p.setSenha("novasenha");
      
      int resposta = p.soma(10, 10);      

   }
}