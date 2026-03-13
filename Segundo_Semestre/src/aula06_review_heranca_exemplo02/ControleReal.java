package aula06_review_heranca_exemplo02;

// O objeto composto (O Controle)

public class ControleReal implements Comando {

	private String nomeDispositivo;
	private Pilha pilha; // Composição
		
	
	public ControleReal(String nomeDispositivo) {
		this.nomeDispositivo = nomeDispositivo;
	}
	
	// O "Compartimento de Pilha" - Método de Troca Dinâmica
	public void setPilha(Pilha novaPilha) {
		this.pilha = novaPilha;
		
		//Operador ternário (teste ? verdadeiro : falso)
		System.out.println("[" + nomeDispositivo + "]: Pilha " + (novaPilha != null ? novaPilha.getMarca() : "removida") + " inserida.");
	}


	@Override
	public void executar() {
		if(pilha != null && pilha.temEnergia()) {
			System.out.println(nomeDispositivo + ": Comando enviado! (Sinal Forte)");
		}else
			System.out.println(nomeDispositivo + ": [Silêncio] Falha no sinal - verifique as pilhas!");
	}
	
}
