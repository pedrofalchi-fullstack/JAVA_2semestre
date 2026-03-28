package aula22_mvc.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection getConnection(){
		String url = "jdbc:oracle:thin:@fiap.com.br:1521:orcl";
		String user = "rm566967";
		String password = "fiap26";
		
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		
	}
}
}
