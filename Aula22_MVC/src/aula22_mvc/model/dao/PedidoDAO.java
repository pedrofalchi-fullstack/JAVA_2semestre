package aula22_mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import aula22_mvc.model.vo.Pedido;

public class PedidoDAO {

	public void salvar(Pedido pedido) {
		
		String sql = "INSERT into PEDIDO (Cliente, Valor) VALUES (?,?)";
		
		Connection conn = Conexao.getConnection();
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, pedido.getCliente());
			stmt.setDouble(2, pedido.getValor());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
