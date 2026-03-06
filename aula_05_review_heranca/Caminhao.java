package aula_05_review_heranca;

public class Caminhao extends Veiculo{

	public Caminhao(String id) {
		super(id);
	}

	@Override
	public void abastecer() {
		System.out.println("Caminhão " + getId() + "está abastecendo com Diesel no Posto");		
		}
}

