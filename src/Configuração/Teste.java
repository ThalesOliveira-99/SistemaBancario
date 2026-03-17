package Configuração;

import Entidade.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc1 = new ContaCorrente();
		
		cc1.setSaldo(100.0);
		cc1.setChequeEspecial(50.0);
		cc1.Sacar(120.0);
		cc1.Descricao();
	}

}
