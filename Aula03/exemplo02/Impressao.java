package exemplo02;

public class Impressao {
   public static void imprimirTexto(String texto){
      System.out.println("METODO STATIC: " + texto);
   }

   public static void somarDoisValores(int x, int y){
      int resposta = x + y;
      System.out.println("Nosso calculo: " + resposta);
   }

   public static void imprimirDocumento(Documento documento){
      
      String status = "";
      String assinatura = "";
      switch(documento.getStatus()){
         case 0:
            status = "Novo documento";
            break;
         case 1:
            status = "Em processamento";
            break;
         case 2:
            status = "Aguardando autorização";
            break;
         case 3:
            status = "Finalizado";
            break;
      }
      switch(documento.getAssinatura()){
         case 0:
            assinatura = "DIRETOR";
            break;
         case 1:
            assinatura = "SUPERVISOR";
            break;
         case 2:
            assinatura = "COORDENADOR";
            break;
         case 4:
            assinatura = "NÃO ASSINADO";
            break;
      }
      
      String resposta = "id: "       + documento.getId()         + "\n" +
                        "Nome: "     + documento.getNome()       + "\n" +
                        "Status: "   + status                    + "\n" + 
                        "Assinado: " + assinatura                + "\n" +
                        "------------------------------";
      System.out.println(resposta);
   }

}
