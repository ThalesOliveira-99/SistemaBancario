package Entidade;

public class Conta {

	private Double saldo; 
	private Integer NumConta;
	
	public Conta() {
	}

	public Conta(Double saldo, Integer numConta) {
		this.saldo = saldo;
		NumConta = numConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumConta() {
		return NumConta;
	}

	public void setNumConta(Integer numConta) {
		NumConta = numConta;
	}
	
	public boolean Sacar(Double valor) {
		if(valor <= this.getSaldo()) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado");
			System.out.println("Saldo atualizado "+ this.saldo);
			return true;
			
		} else {
			System.out.println("Saque não realizado por falta de saldo");
			return false;
		}
	}
	
	public boolean Depositar(Double valor) {
		if( valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Deposito realizado!");
			System.out.println();
			return true;
		} else {
			System.out.println("Deposite um valor maior que RS 0,00");
			System.out.println();
			return false;
		}
	}
	
		public boolean Transferir(Double valor, Conta destino) {
			if(this.Sacar(valor)) {
				System.out.println("Digite o número da conta: ");
				destino.Depositar(valor);
				System.out.println("Transferência realizada com sucesso");
				return true;
			} else {
				System.out.println("Falha na transferência: saldo insuficiente!");
				return false;
			}
		}

		public void Descricao() {
			System.out.println("Número de Conta: "+ this.getNumConta());
			System.out.printf("Saldo: R$ %.2f%n"+ this.getSaldo());
		}


	
	
	
}
