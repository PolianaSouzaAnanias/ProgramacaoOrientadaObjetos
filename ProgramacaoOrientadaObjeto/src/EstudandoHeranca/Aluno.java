package EstudandoHeranca;

public class Aluno extends Pessoa { // O extends gera a heran�a da classe Pessoa(m�e) para a classe Aluno(filha).

	private int matricula;
	private String nomecurso;
	
	public void cancelarMatr�cula() {
		System.out.println("Matr�cula ser� cancelada.");
	}
	
	
	// M�todo gest e set de Matr�cula
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	// M�todo gest e set de nomeCurso
	public String getNomeCurso() {
		return nomecurso;
	}
	public void setMatricula(String nomecurso) {
		this.nomecurso = nomecurso;
	}
}
