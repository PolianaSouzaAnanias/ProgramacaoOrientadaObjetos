package EstudandoHeranca;

public class Funcionario extends Pessoa{ // O extends gera a herança da classe Pessoa para a classe Funcionario.

	private String setor;
	private boolean trabalhando;
	
	public void mudaTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}
	
	// Método gest e set de setor
			public String getSetor() {
				return setor;
			}
			public void setSetor(String especialidade) {
				this.setor = setor;
			}
			
			// Método gest e set de trabalhando
			public boolean getTrabalhando() {
				return trabalhando;
			}
			public void setTrabalhando(boolean trabalhando) {
				this.trabalhando = trabalhando;
			}
}
