package EstudandoHeranca;

public class Professor extends Pessoa { // O extends gera a heran�a da classe Pessoa para a classe Professor.
	
	private String especialidade;
	private float salario;
	
	public void receberAumento(float aumento) {
		this.salario += aumento;
		System.out.println("Voc� receberer� um aumento de sal�rio.");
	}
		
	// M�todo gest e set de especialidade
		public String getespecialidade() {
			return especialidade;
		}
		public void setEspecialidade(String especialidade) {
			this.especialidade = especialidade;
		}
		
		// M�todo gest e set de salario
		public float getNomeCurso() {
			return salario;
		}
		public void setSalario(float salario) {
			this.salario = salario;
		}
	}
