package aula07_Array_list;

/**
 * Escreva um programa que receba uma lista de notas (números decimais), armazene-as em uma ArrayList <Double> 
 * Percorra a lista e, para cada nota, utilize o operador ternário para decidir se o aluno está "Aprovado"
 * (nota >= 6.0) ou "Reprovado". 
 * Imprima o resultado formatado.
 */

import java.util.ArrayList;

public class exemplo02_exercicio {
	
	public static void main(String[] args) {
	
		ArrayList<Double> nota = new ArrayList<Double>();
		
		nota.add(9.0);
		nota.add(8.0);
		nota.add(6.5);
		
		double cont=0;
		for (Double n : nota) {
			System.out.println("Resultado: " + (n >= 6 ? "Aprovado" : "Reprovado"));		
	}
		System.out.println("=============================================================");
		System.out.println("Você passou de ano!");

}
}