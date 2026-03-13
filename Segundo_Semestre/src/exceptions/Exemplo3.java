package exceptions;

public class Exemplo3 {
	
	public static void main(String[] args) {
		
		int[] vetor = new int[3]; // Array com 3 elementos
		
		try {
		vetor[5] = 10;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida do vetor!\n" + e.getMessage());
		}finally {
			System.out.println("Fim da execução!");
		}
		
	}

}
