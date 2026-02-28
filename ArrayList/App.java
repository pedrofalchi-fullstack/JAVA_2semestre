package ArrayList;

public class App {

	public static void main(String[] args) {
		
		// criar uma agenda
		Agenda agenda = new Agenda();
		
		// criando contatos
		Contato c1 = new Contato("Pedro");
		c1.setTelefone("5432-1234");
		
		//adicionando c1 na lista
		agenda.adicionar(c1);
		
		Contato c2 = new Contato("Jõao", "Rua do Manifesto", "1234-5678", "joao@jhonny.com");
		agenda.adicionar(c2);
		
		//listando os contatos
		agenda.listar();
		
		Contato c3 = new Contato("Gustavo", "Rua Augusta", "gustavo@gustavo.com.br", "1234-4321");
		agenda.adicionar(c3);
		
		//listando os contatos
		System.out.println("Primeira listagem...");
		agenda.listar();
		System.out.println("----------------------------");
		
		
		//atualizar
		agenda.atualizar(0, new Contato("Marcos", "Av Paulista", "marcos@tubaina.com", "5678-9108"));
		
		//listando os Contatos
		System.out.println(">>> Segunda Listagem...");
		agenda.listar();
		
		//remover
		agenda.remover(0);
		
		//listando os contatos
		System.out.println(">>> Terceira Listagem...");
		agenda.listar();	
		}
}