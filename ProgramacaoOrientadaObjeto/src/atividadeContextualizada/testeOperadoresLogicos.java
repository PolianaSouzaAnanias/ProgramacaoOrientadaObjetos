package atividadeContextualizada;

public class testeOperadoresLogicos {
	public static void main(String args[]) {
		System.out.println("COMPARANDO N�MEROS");
		System.out.println("..........................");
        int numeroComparado = 18;
        
        if (15 == numeroComparado) {
            System.out.println("Os n�meros 15 e 18 s�o iguais");
        } else {
            System.out.println("Os n�meros 15 e 18 s�o diferentes");
        }
        
        if (21 != numeroComparado) {
            System.out.println("Os n�meros 21 e 18 s�o diferentes");
        } else {
            System.out.println("Os n�meros 21 e 18 s�o iguais");
        }
        
        if (33 > numeroComparado) {
            System.out.println("O n�mero 33 � maior que o n�mero comparado");
        } else {
            System.out.println("O n�mero 33 � menor que o n�mero comparado");
        }
        
        if (19 < numeroComparado) {
            System.out.println("O n�mero 19 � menor que o n�mero comprado");
        } else {
            System.out.println("O n�mero 19 � menor que o n�mero comprado");
        }
        
        if ( 18 >= numeroComparado) {
            System.out.println("O n�mero 18 � maior ou igual ao n�mero comparado");
        } else {
            System.out.println("O n�mero 18 � menor que o n�mero comparado");
        }
        
        if (18 <= numeroComparado) {
            System.out.println("O n�mero 18 � menor ou igual ao n�mero comparado");
        } else {
            System.out.println("O n�mero 18 � maior que o n�mero comparado");
        }
    }
}
