package aula07_Array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo03_exercicio {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Double> listaNotas = new ArrayList<Double>();
		
		System.out.println("Exercício de Notas (ADS)");
		
		System.out.println("Digite as notas (ou qualquer letra para encerrar)");
		
		while(input.hasNextDouble()) {
			System.out.println("Nota: ");
			double nota = input.nextDouble();
			listaNotas.add(nota);
		}
		
		System.out.println(" --- Resultado final --- ");
		for (Double nota : listaNotas) {
			String status = (nota >= 6.0) ? "Aprovado" : "Reprovado";
			
			System.out.printf("Nota: %.1f | Status: %s\n", nota, status);			
		}
		input.close();
	}

}