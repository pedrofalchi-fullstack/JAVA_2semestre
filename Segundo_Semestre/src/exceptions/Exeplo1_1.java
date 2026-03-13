package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

// exemplo com input
public class Exeplo1_1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
		System.out.println("Número: ");
		int n = input.nextInt();
		
		System.out.println("Número digitado: " + n);
		}catch(InputMismatchException e) {
			System.out.println("Valor inválido! Digite apenas números");
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}

