package ArrayList;

public class Contato {
	
		
		private String nome;
		private String endereco;
		private String telefone;
		private String email;
		
		// construtor com um parâmetro
		public Contato(String nome) {
			this.nome = nome;
			}
		
		//contrutor parametrizado
			public Contato(String nome, String endereco, String telefone, String email) {
			super();
			this.nome = nome;
			this.endereco = endereco;
			this.telefone = telefone;
			this.email = email;
		}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public String getEndereco() {
				return endereco;
			}

			public void setEndereco(String endereco) {
				this.endereco = endereco;
			}

			public String getTelefone() {
				return telefone;
			}

			public void setTelefone(String telefone) {
				this.telefone = telefone;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			@Override
			public String toString() {
				return "Contato [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email="
						+ email + "]";
			}

		
}





