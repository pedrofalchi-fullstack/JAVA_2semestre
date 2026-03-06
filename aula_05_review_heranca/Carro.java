package aula_05_review_heranca;

public class Carro extends Veiculo{

	public Carro(String id) {
		super(id);
	}

	@Override
	public void abastecer() {
		System.out.println("Carro " + getId() + " está abastecendo com Gasolina no Posto");
	}

}
