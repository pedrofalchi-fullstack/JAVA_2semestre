package aula22_mvc.main;

import aula22_mvc.controller.PedidoController;
import aula22_mvc.view.PedidoView;

public class Main {
	public static void main(String[] args) {
		
		//criando um objeto PedidoView
		PedidoView view = new PedidoView();
		PedidoController controller = new PedidoController(view);
		
		controller.executar();
		
	}
}
