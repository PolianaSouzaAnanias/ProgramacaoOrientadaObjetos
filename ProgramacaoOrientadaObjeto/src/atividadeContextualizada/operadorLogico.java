package atividadeContextualizada;

public class operadorLogico {
		public static void main(String args[]) {
		        int resultado1 = 15 + 12;
		        int resultado2 = 22 + 33;

		        if (resultado1 == 27 && resultado2 == 55) {
		            System.out.println("As condi��es foram atendidas");
		        } else {
		            System.out.println("As condi��es n�o foram atendidas");
		        }
		        
		        if (resultado1 > 27 || resultado2 == 55) {
		            System.out.println("Uma ou outra condi��o foi atendida");
		        } else {
		            System.out.println("Nenhuma das condi��es foi atendida");
		        }
		    }
		}
