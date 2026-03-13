package aula_05_2semestre;

public class Veiculo {
	private String id;
	private Motorizacao motor; //composição
	private FonteDeEnergia energia; //composição
	
	
	//construtor
	public Veiculo(String id, Motorizacao motor, FonteDeEnergia energia) {
		super();
		this.id = id;
		this.motor = motor;
		this.energia = energia;
	}
	
	public void operar() {
		System.out.println("\n --- Operando: " + id + " --- ");
		motor.propulsionar();
		energia.prover();
	}
}
