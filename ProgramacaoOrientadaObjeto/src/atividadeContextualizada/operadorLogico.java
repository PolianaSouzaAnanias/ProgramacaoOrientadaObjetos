package atividadeContextualizada;

public class operadorLogico {
		public static void main(String args[]) {
		        int resultado1 = 15 + 12;
		        int resultado2 = 22 + 33;

		        if (resultado1 == 27 && resultado2 == 55) {
		            System.out.println("As condições foram atendidas");
		        } else {
		            System.out.println("As condições não foram atendidas");
		        }
		        
		        if (resultado1 > 27 || resultado2 == 55) {
		            System.out.println("Uma ou outra condição foi atendida");
		        } else {
		            System.out.println("Nenhuma das condições foi atendida");
		        }
		    }
		}
