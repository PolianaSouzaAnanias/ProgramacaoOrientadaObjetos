package EstudandoClassesObjetosAtributos;

// https://www.youtube.com/watch?v=hOC461osYgk&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=11

public class ContaBranco {
	
	//Atributos
	public int numeroConta;
	protected String tipo;
	private String nomedono;
	private float saldo;
	private boolean status;
	
	// Métodos personalizados
	public void abrinConta(String t){
		
	}
	public void fecharConta(){
	}
	public void deposistar(){
	}
	public void pagar(){
	}
	public void pagarMensal(){
	}

	// Métodos especiais
	
	public void contaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	// Método gest e set
	// Numero Conta
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	// Tipo de conta
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	// Nome Dono da conta
	public String getNomedono() {
		return nomedono;
	}
	public void setNomedono(String nomedono) {
		this.nomedono = nomedono;
	}
	// Saldo
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	// Status
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean statua) {
		this.status = statua;
	}
	// Pagar Mensal
	public void getPagarMensal() {
		return pagarMensal;
	}
	public void setPagarMensal(vooid pagarMensal) {
		this.pagarMensal = pagarMensal;
	}
	
}
