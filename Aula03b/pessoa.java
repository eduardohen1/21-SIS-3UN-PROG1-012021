public class pessoa {
   //Atributos
   public String nome;
   public String telefone;
   public String email;
   
   private int id = 123123131;
   private String senha = "123mudar";
   private String numTelegram = "980809808";

   //Get Set
   public void setSenha(String s){
      this.senha = s;
   }
   public void setNumTelegram(String s){
      this.numTelegram = s;
   }

   public int getId(){
      return this.id;
   }
   public String getNumTelegram(){
      return this.numTelegram;
   }

   public int soma(int x, int y){
      return x + y;
   }

}
