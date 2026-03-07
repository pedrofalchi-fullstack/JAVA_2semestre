package exemplo_crud;

import java.sql.SQLException;

public class TesteCRUD {
	
	public static void main(String[] args) throws SQLException {
		
		// criando um objeto de gerenciador de clientes
		GerenciadorDeClientes gc = new GerenciadorDeClientes();
		// criando um cliente
		Cliente cliente = new Cliente("Marcão", "Tubaína");
		
		gc.inserir(cliente);
		
	}

}
