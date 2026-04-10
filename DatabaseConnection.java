package aula_singleton;

public class DatabaseConnection {

	//atributo privado do DatabaseConnection
	private static DatabaseConnection conexao; // null
	
	//construtor privado
	private DatabaseConnection() {
		//código de conexao com o banco de dados estara aqui...
		//driver...
		System.out.println("Conexão criada!");
	}
	
	public void conectar() {
		//simulando uma conexao com o banco
		//logica de conexao
		System.out.println("Conectando com o banco de dados...");
	}
	
	public void desconectar() {
		//simulando uma desconexao com o banco de dados
		//conexao.close()
		System.out.println("Desconectando do banco de dados");
	}
	
	public static DatabaseConnection getConexao() {
		if(conexao == null) {
			conexao = new DatabaseConnection();
			System.out.println("Objeto <conexao>: " + conexao + "conected");
		}
		return conexao;
	}
	
}
