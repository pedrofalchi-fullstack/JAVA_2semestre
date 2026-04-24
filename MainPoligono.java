package aula20_Factory;

public class MainPoligono {
	
	public static void main(String[] args) {
		
		if(PoligonoFactory.getPoligono(0) == null) {
			System.out.println("Figura não existe!");
		}else {
			System.out.println(PoligonoFactory.getPoligono(3));
			System.out.println(PoligonoFactory.getPoligono(4));
			System.out.println(PoligonoFactory.getPoligono(5));
			System.out.println(PoligonoFactory.getPoligono(0));
		}
		
		
		
	}

}