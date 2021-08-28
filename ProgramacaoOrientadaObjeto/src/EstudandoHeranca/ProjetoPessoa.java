package EstudandoHeranca;

//Código principal.
public class ProjetoPessoa {
	
	System.out.println("CADASTRO - ESCOLA ABC");
	
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		// Nome
		p1.setNome("Poliana");
		p2.setNome("Léia");
		p3.setNome("Junio");
		p4.setNome("Thiago");
		
		//Sexo
		p1.setSexo("F");
		p2.setSexo("F");
		p3.setSexo("M");
		p4.setSexo("M");
		
		// Idade
		p1.setIdade("30");
		p2.setIdade("2");
		p3.setIdade("10");
		p4.setIdade("35");
		
		// Salario / Curso / Setor
		p2.setCurso("Robotica");
		p3.setSalario("2500,75f");
		p4.setSetor("Porteiro");
		
		System.out.println(p1.toSting());
		System.out.println(p2.toSting());
		System.out.println(p3.toSting());
		System.out.println(p4.toSting());
}
