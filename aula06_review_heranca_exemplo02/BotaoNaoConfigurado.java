package aula06_review_heranca_exemplo02;


//. Null Object (Para botões que nem deveriam ter controle associado)
public class BotaoNaoConfigurado implements Comando {

	@Override
	public void executar() {
		System.out.println("[SISTEMA]: Este botão não faz nada!");
	}	
}
