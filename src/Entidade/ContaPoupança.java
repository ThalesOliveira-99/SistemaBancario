package Entidade;

public class ContaPoupança extends Conta {

	public ContaPoupança() {
	}
	
	public void renderJuros() {
		
		this.setSaldo((this.getSaldo() +  (this.getSaldo() * 5 / 100)));
	}
}
