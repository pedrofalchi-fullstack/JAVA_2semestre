package aula22_mvc.controller;

import aula22_mvc.model.bo.PedidoBO;
import aula22_mvc.model.vo.Pedido;
import aula22_mvc.view.PedidoView;

public class PedidoController {

	private PedidoView view;
	private PedidoBO bo;

	public PedidoController(PedidoView view) {
		this.view = view;
		this.bo = new PedidoBO();
	}
	
	public void executar() {
		String cliente = view.lerCliente();
		double valor = view.lerValor();
		
		Pedido pedido = new Pedido(cliente, valor);
		
		bo.cadastar(pedido);
		
		view.mostrarResumo("Pedido salvo com sucesso!");
		
		//view.mostrarResumo(pedido.resumo());
	}
	
}
