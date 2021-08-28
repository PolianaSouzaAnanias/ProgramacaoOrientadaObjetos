package EstudandoHeranca;

public class Aluno extends Pessoa { // O extends gera a herança da classe Pessoa(mãe) para a classe Aluno(filha).

	private int matricula;
	private String nomecurso;
	
	public void cancelarMatrícula() {
		System.out.println("Matrícula será cancelada.");
	}
	
	
	// Método gest e set de Matrícula
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	// Método gest e set de nomeCurso
	public String getNomeCurso() {
		return nomecurso;
	}
	public void setMatricula(String nomecurso) {
		this.nomecurso = nomecurso;
	}
}
