package montadora;

public class Carro {
   //Atributos:
   private String cor;
   private String marca;
   private String modelo;
   private int numeroPortas;
   private int velocidadeMaxima;
   private String nomeProprietario;
   private int litrosCombustivel;
   private int kmRodados;

   //método construtor:
   public Carro(String cor, String marca, String modelo, int numeroPortas,
                int velocidadeMaxima, String nomeProprietario, 
                int litrosCombustivel, int kmRodados){
      this.cor = cor;
      this.marca = marca;
      this.modelo = modelo;
      this.numeroPortas = numeroPortas;
      this.velocidadeMaxima = velocidadeMaxima;
      this.nomeProprietario = nomeProprietario;
      this.litrosCombustivel = litrosCombustivel;
      this.kmRodados = kmRodados;
   }

   //método construtor com sobrecarga de métodos.
   public Carro(String cor, String marca, String modelo, int numeroPortas,
                int velocidadeMaxima, String nomeProprietario, 
                int litrosCombustivel){
      this.cor = cor;
      this.marca = marca;
      this.modelo = modelo;
      this.numeroPortas = numeroPortas;
      this.velocidadeMaxima = velocidadeMaxima;
      this.nomeProprietario = nomeProprietario;
      this.litrosCombustivel = litrosCombustivel;
      this.kmRodados = 0;
   }

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

   public int consumoCombustivel(int kmCalculo, int qteLitros){
      int resposta;
      resposta = kmCalculo / qteLitros;
      return resposta;
   }

   public void atualizaKmRodados(int km){
      this.kmRodados = this.kmRodados + km;
   }

   public void atualizaTanqueCombustivel(int qteLitros){
      this.litrosCombustivel = this.litrosCombustivel - qteLitros;
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

   //variáveis do exercício:
   public int getNumeroPortas(){ 
      return this.numeroPortas;
   }

   public void setNumeroPortas(int numeroPortas){
      this.numeroPortas = numeroPortas;
   }

   public int getVelocidadeMaxima(){ 
      return this.velocidadeMaxima;
   }

   public void setVelocidadeMaxima(int velocidadeMaxima){
      this.velocidadeMaxima = velocidadeMaxima;
   }

   public String getNomeProprietario(){
      return this.nomeProprietario;
   }

   public void setNomeProprietario(String nomeProprietario){
      this.nomeProprietario = nomeProprietario;
   }

   public void setLitrosCombustivel(int litrosCombustivel){
      this.litrosCombustivel = litrosCombustivel;
   }

   public int getLitrosCombustivel(){
      return this.litrosCombustivel;
   }

   public void setKmRodados(int kmRodados){
      this.kmRodados = kmRodados;
   }

   public int getkmRodados(){
      return this.kmRodados;
   }

   //método de retorno dos textos:
   public String toString(){
      /*
      String resposta = "Cor: "    + cor   + "\n" +
                        "Marca: "  + marca + "\n" +
                        "Modelo: " + modelo;
      return resposta;
      */
      return "Cor: "               + cor              + "\n" +
             "Marca: "             + marca            + "\n" +
             "Modelo: "            + modelo           + "\n" +
             "Num. portas: "       + numeroPortas     + "\n" +
             "Vel. máxima: "       + velocidadeMaxima + "\n" +
             "Nome proprietário: " + nomeProprietario + "\n" +
             "KmRodados: "         + kmRodados        + "\n" +
             "Litros combustível:" + litrosCombustivel;
   }

}
