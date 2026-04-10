package aula_singleton;

public class TesteDatabaseConection {

	public static void main(String[] args) {
		
		//obtendo uma instância de DatabaseConnection
		DatabaseConnection dbConnection = DatabaseConnection.getConexao();
		
		//conectando com o banco de dados
		dbConnection.conectar();
		
		//desconectando do banco de dados
		dbConnection.desconectar();
		
		//obtendo outro objeto
		DatabaseConnection dbConnection2 = DatabaseConnection.getConexao();
		
		//comparação do endereço de memoria (referência)
		if(dbConnection == dbConnection2) {
			System.out.println("Objetos iguais!");
		}else {
			System.out.println("Objetos diferentes!");
		}
	
	
	//comparando o conteudo do objeto
	if(dbConnection == dbConnection2) {
		System.out.println("Mesmo conteúdo!");
	}
}
}
