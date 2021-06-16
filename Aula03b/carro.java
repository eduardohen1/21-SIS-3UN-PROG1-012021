public class carro {
   
   //Atributos
   private String cor;
   private String marca;
   private int ano;

   //Método Construtor
   public carro(){
      this.cor = "Branca";
      this.marca = "Chery";
      this.ano = 2021;
   }

   //Método Construtor - com sobrecarga
   public carro(String cor, int ano){
      this.cor = cor;
      this.ano = ano;
   }

   //Método Construtor - com sobrecarga
   public carro(String cor, String marca, int ano){
      this.cor = cor;
      this.marca = marca;
      this.ano = ano;
   }

   //Métodos Get/Sets:
   public String getCor(){
      return this.cor;
   }
   public String getMarca(){
      return this.marca;
   }
   public int getAno(){
      return this.ano;
   }
   public void setCor(String cor){
      this.cor = cor;
   }
   public void setMarca(String marca){
      this.marca = marca;
   }
   public void setAno(int ano){
      this.ano = ano;
   }

}
