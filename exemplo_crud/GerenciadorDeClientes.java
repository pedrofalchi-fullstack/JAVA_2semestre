package exemplo_crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class GerenciadorDeClientes {
	
	//url: jdbc:oracle:thin:@localhost:port:xe 
	
	private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
	private Connection conexao;
	
	public GerenciadorDeClientes() throws SQLException {
		OracleDataSource ods = new OracleDataSource(); // criando objeto
		
		// configurar a URL
		ods.setURL(url);
		// configurando usuário
		ods.setUser(Credenciais.user);
		// configurando a senha
		ods.setPassword(Credenciais.pwd);
		//obtendo uma conexao com o sgbd oracle
		conexao = ods.getConnection();
		
		System.out.println("Conectado!");
	}
	
	// método inserir()
	public void inserir(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO JavaCliente VALUES(?,?,?)";
		
		// preparando o statement
		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setInt(1, cliente.getId());
		ps.setString(2, cliente.getNome());
		ps.setString(3, cliente.getSobrenome());
		ps.execute();
	}
	
}
