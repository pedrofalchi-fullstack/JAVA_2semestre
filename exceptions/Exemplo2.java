package exceptions;

import java.util.Random;

public class Exemplo2 {
	
	public static void main(String[] args) {
		
		int a=0, b=0;
		float resp = 0;
		Random r = new Random(); // gerar números aleatórios/randômicos
		
		for(int i=1; i<=100; i++) {
			System.out.println("i: " + i);
			
			try {
				a = r.nextInt(100);
				b = r.nextInt(10);
				
				System.out.printf("a: %d | b: %d \n", a,b);
				
				resp = 1234 / (a/b);
				System.out.println("Resultado: " + resp);
			}catch(ArithmeticException e) {
				System.err.println("Erro: " + e.getMessage());
				e.printStackTrace();
			}
			
			
			
		}
		
	}

}
