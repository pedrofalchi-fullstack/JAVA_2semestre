package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo4 {
	
	public float calculaQuociente(int numerador, int denominador) {
		return numerador/denominador;		
	}
	
	
	// testando o método calculaQuociente
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Exemplo4 cQ = new Exemplo4(); //objeto de teste
		
		boolean continua = true; //flag booleana
		
		
		do {
			try {
				System.out.println("Númerador: ");
				int numerador = input.nextInt();
				
				System.out.println("Denominador: ");
				int denominador = input.nextInt();
				
				float resultado = cQ.calculaQuociente(numerador, denominador);
				System.out.println("Resultado: " + resultado);
			}catch (ArithmeticException e) {
				System.err.println("Divisão por Zero! " + e.getMessage());
			}catch (InputMismatchException e) {
				System.err.println("Entrada de dados inválida! \n" + e.getMessage());
				input.next();
				System.out.println("Limpando buffer do Scanner...");
			}catch (NullPointerException e) {
				System.out.println("Objeto NULO!");
			}catch (Exception e) {
					System.out.println("Erro Genérico!");
				}finally {
				System.out.println("Bloco FINALLY!");
				
				
				
				System.out.println("Continuar? true ou false");
				continua = input.nextBoolean();
			}
		}while(continua == true);
		
}
}
