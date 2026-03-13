package aula06_review_heranca_exemplo02;

import java.util.ArrayList;
import java.util.List; //interface

//Main - "mágica da troca dinâmica | Polimorfismo
public class AulaControleRemoto {
	public static void main(String[] args) {
		
		//1o Teste
		//1. criamos o controle (sem pilha)
		ControleReal meuControle = new ControleReal(" Ar condicionado");
		
		//2. Tentativa de uso (vai falhar)
		System.out.println("--- Tentativa 1 ---");
		meuControle.executar();
		
		//3. Adicionar uma pilha sem energia (vai falhar)
		System.out.println("--- Tentativa 2 ---");
		meuControle.setPilha(new Pilha("Genérica Velha", 0.05)); //Composição e injeção de dependência - Conceitos
		meuControle.executar();
		
		//4. Mudança Dinâmica: adicionar uma pilha nova
		System.out.println("--- Tentativa 3 ---");
		meuControle.setPilha(new Pilha("Duracell", 1.0));
		meuControle.executar(); // agora funciona sem ter que mudar nada na classe!
		
		//2o Teste - Exemplo com ArrayList
		System.out.println("\n=====================================");
		List<Comando> painelCentral = new ArrayList<Comando>();
		
		//Cenário A: Controle com uma pilha nova
		Pilha duracell = new Pilha("Duracell", 1.0); //nova pilha
		painelCentral.add(new ControleReal("Televisão"));
		painelCentral.add(new ControleReal("Ar condicionado"));
		painelCentral.add(new ControleReal("Portão Eletrônico"));
		painelCentral.add(new BotaoNaoConfigurado());
		
		System.out.println("--- Testando o Painel de controle ---");
		// for (Comando comando ou Comando c : )
		 for (Comando c : painelCentral) {
			 c.executar(); //polimorfismo
		 }
	}
}