package aula_05_review_heranca;

public abstract class Veiculo {
	
	private String id;
	
	//construtor (Mesmo nome que a classe)
	public Veiculo(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	//método obrigatorio para todos que herdarem de Veiculo
	public abstract void abastecer();
	
	//Método concreto da classe veiculo
	public void mover() {
		
		System.out.println(id + " está se movendo...");
	}
	
}