package Configuração;

import Entidade.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc1 = new ContaCorrente(100.0);

		cc1.setNumConta(2);
		cc1.setSaldo(100.0);
		cc1.Descricao();

		cc1.Sacar(200.0);
		cc1.Descricao();

		cc1.Sacar(50.0);
		cc1.Descricao();
	}

}
