package aula07_Array_list;

import java.util.ArrayList;

/** Exemplo POC ( manipulação de dados atraves dos métodos -- ArrayList)
 * ArrayList
 * 	-- Array dinâminco
 * 	-- Pode ser alterado em tempo de execução
 * 	-- Implementa a Interface List
 * 	-- Pertence ao Framework Collection
 * 	-- java.util
 * 
 */

public class Exemplo01 {
	
	public static void main(String[] args) {
		
		// criando (instanciar) um objeto de ArrayList
		ArrayList<String> carros = new ArrayList<String>();
		
		//imprimindo a lista "vazia"
		System.out.println(carros);
		
		//adicionando elementos no ArrayList - método add()
		carros.add("BMW");
		carros.add("Ferrari");
		carros.add("Audi");
		carros.add("Celta");
		carros.add("Corsa");
		carros.add("Uno");
		
		System.out.println(carros);
		
		// acessar um elemento específico np ArrayList - método get()
		System.out.println("Carro: " + carros.get(1));
		
		// alterando o conteúdo de uma posição específica
		carros.set(1, "Corcel");
		System.out.println(carros);
		
		// acesso a uma posição que nao existe - lançamento de Exception (Erro)
		// carros.set(10, "Jeep");
		
		// obter o tamanho de uma lista (ArrayList) - método size()
		System.out.println("Tamanho da lista: " + carros.size());
		
		// removendo um elemento da Lista
		carros.remove(0);
		System.out.println(carros);
		System.out.println("Tamanho da lista: " + carros.size());
		
		// Apagar a lista inteira
		// carros.clear();
		// System.out.println(carros);
		// System.out.println("Tamanho da lista: " + carros.size());
		
		
		System.out.println("========================================");
		
		// Percorrer a lista com for tradicional
		for (int i=0; i<carros.size(); i++) {
			System.out.printf("%d - %s \n", i+1, carros.get(i));
			}
		
		System.out.println("========================================");
		
		// Percorrer a lista com foreach
		int i=0; // var local
		for (String carro : carros) {
			System.out.printf("%d - %s \n", i, carro);
			i+=1;
		}
		
		System.out.println("==============================================");
		
		
		// obtendo a posição (índice) de um elemento específico - método indexOf
		System.out.println("Índice: " + carros.indexOf("HB20"));
		
		if(carros.indexOf("HB20") == -1) {
			System.out.println("Veículo não encontrado!");
		}else {
			System.out.println("Veículo encontrado!  (" + carros.indexOf("Corcel")+ ")");
		}
		
		// verificar ocorrências de um elemento específico - método contains()
		System.out.println("Contém: " + carros.contains("HB20"));
		
		//Operador Ternário
		// var teste ? verdadeiro : falso
		System.out.println("Contém: " + (carros.contains("Audi") ? "sim" : "não"));
		
		System.out.println("===========================================================");
		
		//ArrayList - Integer (int)
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//preencher a lista - método add()
		numeros.add(4);
		numeros.add(-2);
		numeros.add(10);
		numeros.add(-7);
		numeros.add(-20);
		
		System.out.println(numeros);
		
		//iterando a lista de números
		int cont=0;
		for (Integer n : numeros) {
			System.out.println("Número: " + n);
			
			if(n < 0) {
				cont++;				
			}
		}
		System.out.println("Negativos: " + cont);
		
		
	}

}
