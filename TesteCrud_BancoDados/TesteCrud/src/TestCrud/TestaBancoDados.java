package TestCrud;

import java.sql.SQLException;

public class TestaBancoDados {
	
	public static void main(String[] args) throws SQLException   {
		
		//criando um gerenciador de cliente
		GerenciadorClientes gc = new GerenciadorClientes();
		
		//criando um objeto Cliente
		//Cliente cliente = new Cliente(998, "Vinícius", "Oliveira");
		
		//System.out.println(gc.inserir(cliente) ? "Cliente adicionado!" : "Cliente NÃO adicionado!");
		
		gc.excluir(998);
		
		//Cliente cliente = new Cliente(3, "Mariana", "Fernandes");
				//gc.atualizar(cliente);
				
				
				//System.out.println("Objeto: " + gc.listar());
	}	
}