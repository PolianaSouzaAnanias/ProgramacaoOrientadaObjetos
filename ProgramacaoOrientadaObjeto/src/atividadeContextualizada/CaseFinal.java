package atividadeContextualizada;
public class CaseFinal {
	public static void main(String[] args) {
		
// Declara��o de vari�veis do tipo inteiro.
		int numero1 = 10;
		int numero2 = 20;
		int resultadoMetodoSoma = 0;
		int resultadoMetodoSubtracao = 0;
		int resultadoMetodomultiplicacao = 0;
        int resultadoMetododivisao = 0;
		 
		resultadoMetodoSoma = somar(numero1,numero2);
		resultadoMetodoSubtracao = subtrair(resultadoMetodoSoma,numero2);
		resultadoMetodomultiplicacao = multiplicar(resultadoMetodoSubtracao,numero2);
		resultadoMetododivisao = dividir(resultadoMetodomultiplicacao,numero2);
		System.out.print("Resultado: " + resultadoMetododivisao);
	}
// 1� m�todo.
	public static int somar(int valor1, int valor2) { 
		int resultadoSoma = valor1 + valor2;
		return resultadoSoma;
		}
//  2� m�todo.
	public static int subtrair(int valor1, int valor2) { 
		int resultadoSubtracao = valor1 - valor2;
		return resultadoSubtracao;
	}
// 3� m�todo.
	public static int multiplicar(int valor1, int valor2) { 
		int resultadomultiplicacao = valor1 * valor2;
		return resultadomultiplicacao;
	}
//  4� m�todo.
	public static int dividir(int valor1, int valor2) { 
		int resultadodivisao = valor1 / valor2;
		return resultadodivisao;
	}
}