package aula06_review_heranca_exemplo02;

// A Peça - Classe Pilha
public class Pilha {

	private String marca;
	private double carga; // de 0.0 a 1.0
	
	public Pilha(String marca, double carga) {
		super();
		this.marca = marca;
		this.carga = carga;
	}
	
	public boolean temEnergia() {
		return carga > 0.1 && carga < 1.1;
		// if(this.carga > 0.1) {
		// return true;
		// }else
		// return false;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	
}
