package aula_05_review_heranca;

public class Bicicleta extends Veiculo{

	public Bicicleta(String id) {
		super(id);
	}

	@Override
	public void abastecer() {
		//Poderia lançar uma exception
		System.out.println("Bicicletas não usam combustível!");
	}
	
}
