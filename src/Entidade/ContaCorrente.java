package Entidade;

public class ContaCorrente extends Conta {

	private Double chequeEspecial;

	public ContaCorrente() {
	}

	public ContaCorrente(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public Double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	@Override
	public boolean Sacar(Double valor) {
		//Verifica o limite de saldo da conta + limite suficiente 
		if (valor <= (this.getSaldo() + this.getChequeEspecial())) {
			// Se o saque for maior que o saldo, desconta do limite 
			if (valor > this.getSaldo()) {
				this.setChequeEspecial(this.getSaldo() + this.getChequeEspecial() - valor);
			}

			//Atualiza o saldo principal (vai ficar negativo se usar o limite)
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque no valor de R$: " + valor);
			System.out.println("Saque realizado!!!");
			System.out.println();
			return true;

		} else {
			System.out.println("Saque não realizado por falta de saldo");
			System.out.println();
			return false;
		}
	}

	@Override
	public void Descricao() {
		System.out.println("Número de Conta: " + this.getNumConta());
		System.out.println("Saldo: R$ " + this.getSaldo());
		System.out.println("Cheque Especial: R$ " + this.getChequeEspecial());
		System.out.println();
	}

}