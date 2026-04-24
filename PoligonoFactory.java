package aula20_Factory;

public class PoligonoFactory {

	// método estático para retornar um objeto do tipo Poligono (Super Classe)
	public static Poligono getPoligono(int numLados) {
		if(numLados == 3) {
			return new Triangulo();
		}else if(numLados == 4) {
			return new Quadrado();
		}else if(numLados == 5) {
			return new Pentagono();
		}else {
			return null;
		}
	}
	
}