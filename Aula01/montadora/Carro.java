package montadora;

public class Carro {
   //Atributos:
   private String cor;
   private String marca;
   private String modelo;
   //Métodos:
   protected void andar(){
      ligar();
      System.out.println("Carro andando");
   }
   protected void parar(){
      System.out.println("Carro parado");
   }
   private void ligar(){
      System.out.println("Carro ligado");
   }
   //Métodos GETs e SETs:
   //variável cor:
   public String getCor(){
      return this.cor;
   }
   public void setCor(String cor){
      this.cor = cor;
   }

   //variável marca
   public String getMarca(){
      return this.marca;
   }
   public void setMarca(String marca){
      this.marca = marca;
   }

   //varíavel modelo
   public String getModelo(){
      return this.modelo;
   }
   public void setModelo(String modelo){
      this.modelo = modelo;
   }

   //método de retorno dos textos:
   public String toString(){
      /*
      String resposta = "Cor: "    + cor   + "\n" +
                        "Marca: "  + marca + "\n" +
                        "Modelo: " + modelo;
      return resposta;
      */
      return "Cor: "    + cor   + "\n" +
             "Marca: "  + marca + "\n" +
             "Modelo: " + modelo;
   }

}
