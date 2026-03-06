package exceptions;

public class Exemplo1 {
	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			
			float resultado = a/b;
			
			System.out.println("Resultado: " + resultado);
		}catch(ArithmeticException e) {
			System.out.println("Não é possível dividir por ZERO!" + e.getMessage());
			}
		
		System.out.println("Programa continua executando...");
		
		
		
	

}
}
