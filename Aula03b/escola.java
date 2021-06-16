public class escola {
   //atributos - encapsulando
   private String nome;
   private String endereco;
   private String telefone;
   private String email;

   //Métodos Get/Set
   public String getNome(){
      return this.nome;
   }
   public String getEndereco(){
      return this.endereco;
   }
   public String getTelefone(){
      return this.telefone;
   }
   public String getEmail(){
      return this.email;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   public void setTelefone(String telefone){
      this.telefone = telefone;
   }
}
