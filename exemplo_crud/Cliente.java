/* CRUD -> Create Read Update Delete
 * ORACLE SQL DEVELOPER
 * biblioteca externa - https://www.oracle.com/br/database/technologies/appdev/jdbc-downloads.html (Oracle JDBC driver)
 * -> Project -> Properties -> Java Build Path -> Libraries -> Add external JAR´s -> Apply and close
 */

package exemplo_crud;

public class Cliente {
	
	private int id;
	private String nome;
	private String sobrenome;
	
	public Cliente(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Cliente(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}
	
	
	
	
	
	

}
