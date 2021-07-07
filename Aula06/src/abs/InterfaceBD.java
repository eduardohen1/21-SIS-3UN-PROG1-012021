package abs;

/*
 * Esta é uma classe que contêm apenas o 'CONTRATO' de criação de funções
 * que serão utilizadas por quem chamar esta. A classe que
 * utilizar esta interface estará 'comprometida' a utilizar/implementar
 * os métodos contidos nela.
 */
public interface InterfaceBD {
	public void conectar(String servidor);
	public void executar(String SQL);
	public void desconectar(String servidor);
}
