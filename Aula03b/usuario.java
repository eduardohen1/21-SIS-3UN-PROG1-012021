public class usuario {
   //Argumentos:
   private String login;
   private String senha;
   private String dicaSenha;
   private int nivelAcesso;
   private String dataCadastro;

   public static final int ADMINISTRADOR = 0;
   public static final int OPERADOR = 1;
   public static final int USER = 2;

   //Métodos construtores:
   public usuario(String login, String senha, String dicaSenha){
      this.login = login;
      this.senha = senha;
      this.dicaSenha = dicaSenha;
      this.nivelAcesso = 1;
      this.dataCadastro = "15/06/2021";
   }
   //Método construtor com sobrecarga:
   public usuario(String login){
      this.login = login;
      this.senha = "123mudar";
      this.dicaSenha = "123mudar";
      this.nivelAcesso = 2;
      this.dataCadastro = "15/06/2021";
   }

   //Métodos Get/Sets
   public String getDataCadastro(){
      return this.dataCadastro;
   }
   public int getNivelAcesso(){
      return this.nivelAcesso;
   }
   public void setDicaSenha(String dicaSenha){
      this.dicaSenha = dicaSenha;
   }
   public void setNivelAcesso(int nivel){
      this.nivelAcesso = nivel;
   }

}
