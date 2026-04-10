package aula_singleton;

/**
 * Padrao de projeto Singleton
 * - Amplamente utilizado em POO
 * - Garante que uma classe tenha apenas uma instancia e fornece um ponto global de acesso a ela
 * - Fornece acesso global a um objeto, mas controla a criação do mesmo, garantindo que haja apenas uma instância
 * 
 * Passos:
 * 1. Construtor privado: para impedir a criação de objetos fora da classe
 * 2. Instância estática: para armazenar a única instância da classe
 * 3. Método público estático: para fornecer acesso à instância, criando-a se ainda não existir
 */

public class Singleton {
	// (2)
	private static Singleton instancia; // neste momento é null
	
	/**
	 * Construtor PRIVADO *regra* (1)
	 * Para impedir que outras classes criem instâncias diretamente
	 * através do operador new
	 */
	
	private Singleton() {}

	// (3)
	// método publico
	public static Singleton getInstancia() {
		//método responsável por criar ua instância do tipo Singleton
		// SOMENTE SE ELA AINDA NÂO EXISTIR
		
		if(instancia == null) {
			instancia = new Singleton();
			System.out.println("Objeto Singleton foi criado!");
		}else {
			System.out.println("Já existe um objeto Singleton criado!");
		}
		return instancia;
	}
	
	
}