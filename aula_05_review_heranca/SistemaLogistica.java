package aula_05_review_heranca;

public class SistemaLogistica {
	public static void main(String[] args) {
		
		//Criando o primeiro veiculo da frota
		Caminhao meuCaminhao = new Caminhao("ABC-1234");
		
		System.out.println("--- Início de Operação----");
		meuCaminhao.abastecer();
		meuCaminhao.mover();
		
		Carro meuCarro = new Carro("CBA-4321");
		meuCarro.abastecer();
		meuCarro.mover();
	
	
		Bicicleta minhaBicicleta = new Bicicleta("Caloi");
		minhaBicicleta.abastecer();
		minhaBicicleta.mover();

	}
}
