package viaCep.main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ViaCepService viaCepService = new ViaCepService();
		
		System.out.println("---Sistema de busca de CEP---");
		System.out.println("Digite o CEP (apenas numeros, 8 digitos): ");
		
		String cep = sc.nextLine();
		
		//1. Validação local
		if(!cep.matches("\\d{8}")) {
			System.err.println("Erro: CEP inválido! Deve conter 8 dígitos");
			return;
		}
		
		try {
			System.out.println(("Buscando dados na API via cep... \n"));
			//2. Chamada do Servico
			EnderecoDTO endereco = viaCepService.buscarEnderecoPorCep(cep);
		
			//3. Exibição (View)
			if(endereco.getCep() == null) {
				System.err.println("Erro: CEP não encontrado.");
			}else {
				System.out.println(endereco); // chama o toString() que 
			}
		catch (IOException e) {
			//erro de rede (exe. sem internet URL errada)
			System.err.println("Erro de conexão com a API: " + e.getMessage());
			Thread.currentThread().interrupt();
		}catch (InterruptedException e) {
			//erro se a thread for interrompida
			System.err.println("A Requisição foi interrompida!");
		}catch (Exception e) {
			//erro genérico (ex. erro no Gson
			System.err.println("Erro ao tentar buscar dados!");
		}finally {
			System.out.println("Desenvolvimento da API via CEP...");
		}
			sc.close();
		}
						
	}
	
}