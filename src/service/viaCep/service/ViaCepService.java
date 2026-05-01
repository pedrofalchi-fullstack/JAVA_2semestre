package viaCep.service;

import java.net.URI;
import java.net.http.HttpClient;


public class ViaCepService {
	
	// url base da API
	private static final String URL = "https://viacep.com.br/ws/01001000/json/";

	public EnderecoDTO getEndereco(String cep) throws IOException, InterruptedException {
		//1. Formatar a URL final
		String urlFinal = URL + cep + "/json/";
		
		//2. Criar o cliente HTTP (o navegador do Java)
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(URI.create(urlFinal)).build();
		
		//3. Criar a requisição (o pedido)
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(urlFinal)) //definindo o endereço
				.GET() //define o método (padrão)
				build();
		
		//4. Enviar a requisição e receber a Resposta (response)
		HttpResponse<String> response = client
				.send(request, HttpResponse.BodyHandlers.ofString());
		
		//Ponto de verificação
		//System.out.println("Status Code: " + response.statusCode());
		//System.out.println("Response from server: " + responde.body());
		
		// 5. O pulo do gato: Desserialização (JSON String --> Objeto Java)
		Gson gson = new Gson();
		// Transformando o texto de 'response.body' em uma instância de 'EnderecoDTO'
		EnderecoDTO endereco = gson.fromJson(response.body(), EnderecoDTO.class);
		
		return null;
		
	}