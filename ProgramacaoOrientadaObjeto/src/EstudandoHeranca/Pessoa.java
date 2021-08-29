package EstudandoHeranca;

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	
	// Método FazeraAiversario.
	public void fazerAniversario() { 
		this.idade ++;
	}
		
		// Método gest e set de Nome
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		// Método gest e set de Idade
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
			
		// Método gest e set de Sexo
		public String getsexoe() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		@Override
		public String toString() {
			return Pessoa(+ "nome: " + nome + ", idade: " + idade ", sexo: " + sexo");
		}
}
