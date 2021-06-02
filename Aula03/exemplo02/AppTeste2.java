package exemplo02;

public class AppTeste2 {
   public static void main(String args[]){
      Documento d1, d2, d3;

      d1 = new Documento(1, "Teste1");
      d2 = new Documento(2, "Teste2");
      d3 = new Documento(3, "Teste3");

      d1.exibirDados("d1");
      d1.setStatus(Documento.AGUARDANDO_AUTORIZACAO); //utilizando minha constante pela Classe
      d1.setAssinatura(Assinatura.DIRETOR);
      //d2.exibirDados("d2");
      d1.exibirDados("d1");

      Impressao.imprimirTexto("Nosso texto na tela!");
      Impressao.somarDoisValores(10, 8);
      Impressao.imprimirDocumento(d3);
      Impressao.imprimirDocumento(d1);

      System.out.println("x");

   }
}
