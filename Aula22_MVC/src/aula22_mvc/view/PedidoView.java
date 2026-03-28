package aula22_mvc.view;

import java.util.Scanner;

/**
 * Responsabilidade:
 * - Entrada e saída
 * - Não tem regra de negócio
 */

public class PedidoView {
	
	Scanner input = new Scanner(System.in);
	
	public String lerCliente() {
		System.out.println("Cliente: ");
		return input.nextLine();
	}
	
	public double lerValor() {
		System.out.println("Valor R$: ");
		return input.nextDouble();
	}
	
	public void mostrarResumo(String resumo) {
		System.out.println("Resumo: " + resumo);
	}
	
	
}
