package aula22_mvc.model.bo;

import aula22_mvc.model.dao.PedidoDAO;
import aula22_mvc.model.vo.Pedido;

public class PedidoBO {
	
	PedidoDAO dao = new PedidoDAO();
	
	public void cadastar(Pedido pedido) {
		// futuramente: regras de negócio aqui
		dao.salvar(pedido);
		
	}

}
