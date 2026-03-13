package TestCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.pool.OracleDataSource;

/**
 * 
 * @author Fernando
 * - Driver JDBC - Java Database Connectivity
 * - Executar instruções SQL (Qualquer banco de dados relacional)
 * - Pacote java.sql (biblioteca Java)
 * - Classe DriverManager
 * - Interfaces (Driver, Connection, Statement, PreparedStatement, ResultSet
 *
 */

public class GerenciadorClientes{
	
	/*
	 * Connection URL: The connection URL for the oracle10G 
	 * database is jdbc:oracle:thin:@localhost:1521:xe where 
	 * jdbc is the API, oracle is the database, thin is the driver, 
	 * localhost is the server name on which oracle is running, 
	 * we may also use IP address, 1521 is the port number and XE 
	 * is the Oracle service name.
	 */
	
	private String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
	private Connection conn;
	
	
	public GerenciadorClientes() throws SQLException {
		
		OracleDataSource ods = new OracleDataSource();
		
		//configurando a URL
		ods.setURL(url);
		//configurando o usuário
		ods.setUser(Credenciais.user);
		//configurando a senha
		ods.setPassword(Credenciais.pwd);
		//obtendo uma conexão com o jdbc
		conn = ods.getConnection();
		
		System.out.println("Conectado!");	
	}
	
	//método inserir()
	public boolean inserir(Cliente cliente) {
		
		//persons é o nome da tabela
		String sql = "INSERT into persons VALUES(?, ?, ?)";
		
		//preparação do statement
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cliente.getId());
			ps.setString(2, cliente.getNome());
			ps.setString(3, cliente.getSobrenome());
			ps.execute();
		} catch (SQLException e) {
			if(conn == null) {
				System.err.println("Conexão nula!");
			}else {
				System.err.println("Erro no PreparedStatement!");
			}
			e.printStackTrace();
			return false;
		}finally {
			System.out.println("Fechando a conexão com o banco de dados!");
			try {
				conn.close();
			} catch (SQLException e) {
				System.err.println("Erro ao fechar a conexão!");
				e.printStackTrace();
			}
		}
		return true;
	}
	
	//método excluir()
	public boolean excluir(int id) {
		String sql = "DELETE FROM persons WHERE person_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			System.err.println("Erro ao remover o cliente!");
			e.printStackTrace();
			return false;
		}finally {
			System.out.println("Fechando a conexão com o banco de dados!");
			try {
				conn.close();
			} catch (SQLException e) {
				System.err.println("Não foi possível encerrar a conexão!");
				e.printStackTrace();
			}
		}
		return true;
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
		
}