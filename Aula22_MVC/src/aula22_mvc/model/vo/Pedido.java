package aula22_mvc.model.vo;

/**
 * Camada Model
- Representa o conceito de negócio
- Não sabe nada de interface ou usuário

model:
 - vo (value object)
 	- Pedido
 	- Cliente
 	- Livro
 - bo (business object)
 	- PedidoBO
 	- ClienteBO
 	- LivroBO
 - dao (data access object)
 	- PedidoDAO
 	- ClienteDAO
 	- LivroDAO

 **/

public class Pedido {
	
	private String cliente;
	private double valor;
	
	
	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String resumo() {
		return "Pedido [cliente=" + cliente + ", valor=" + valor + "]";
	}
}
