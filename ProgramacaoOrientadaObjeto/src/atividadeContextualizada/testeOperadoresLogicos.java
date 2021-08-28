package atividadeContextualizada;

public class testeOperadoresLogicos {
	public static void main(String args[]) {
		System.out.println("COMPARANDO NÚMEROS");
		System.out.println("..........................");
        int numeroComparado = 18;
        
        if (15 == numeroComparado) {
            System.out.println("Os números 15 e 18 são iguais");
        } else {
            System.out.println("Os números 15 e 18 são diferentes");
        }
        
        if (21 != numeroComparado) {
            System.out.println("Os números 21 e 18 são diferentes");
        } else {
            System.out.println("Os números 21 e 18 são iguais");
        }
        
        if (33 > numeroComparado) {
            System.out.println("O número 33 é maior que o número comparado");
        } else {
            System.out.println("O número 33 é menor que o número comparado");
        }
        
        if (19 < numeroComparado) {
            System.out.println("O número 19 é menor que o número comprado");
        } else {
            System.out.println("O número 19 é menor que o número comprado");
        }
        
        if ( 18 >= numeroComparado) {
            System.out.println("O número 18 é maior ou igual ao número comparado");
        } else {
            System.out.println("O número 18 é menor que o número comparado");
        }
        
        if (18 <= numeroComparado) {
            System.out.println("O número 18 é menor ou igual ao número comparado");
        } else {
            System.out.println("O número 18 é maior que o número comparado");
        }
    }
}
