package aula_singleton;

public class TesteSingleton {
	
	public static void main(String[] args) {
		
		//Singleton s1 = new Singleton();
		
		Singleton s1 = Singleton.getInstancia();
		Singleton s2 = Singleton.getInstancia();
		Singleton s3 = Singleton.getInstancia();
		
		System.out.println("Objeto <s1>:" + s1);
		System.out.println("Objeto <s2>:" + s2);
		System.out.println("Objeto <s3>:" + s3);
		
	}

}
