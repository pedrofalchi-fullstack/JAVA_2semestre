package aula_singleton;

public class Singleton2 {
	
	//(2)
	private static Singleton2 instancia = new Singleton2();
	
	//(1)
	private Singleton2() {
		System.out.println("Objeto Singleton criado!");
	}
	
	//(3)
	public static Singleton2 getInstancia() {
		return instancia;
	}
		

}
