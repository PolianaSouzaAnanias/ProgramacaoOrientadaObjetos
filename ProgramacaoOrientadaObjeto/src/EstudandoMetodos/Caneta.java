package EstudandoMetodos;

public class Caneta {

	public String modelo;
	public	float ponta;
		
	// M�todo gest e set de Modelo
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public void statua() {
		System.out.println("Informa��es sobre a caneta: ");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
	}
		}
