package aula_05_2semestre;

import java.util.ArrayList;

public class AulaLogistica {
	public static void main(String[] args) {
		ArrayList<Veiculo> frota = new ArrayList<Veiculo>();
		frota.add(new Carro("HB-20", null, null));
		frota.add(new Caminhao("ABC-123", null, null));
		frota.add(new Bicicleta("Pedal", null, null));
		
		//Polimorfismo
		for (Veiculo v : frota) {
			v.operar();
		}
		
		
	}
}