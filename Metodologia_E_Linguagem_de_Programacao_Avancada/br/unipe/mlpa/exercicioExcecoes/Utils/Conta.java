package br.unipe.mlpa.exercicioExcecoes.Utils;

import br.unipe.mlpa.exercicioExcecoes.Exceptions.SaldoNegativoException;
import br.unipe.mlpa.exercicioExcecoes.Exceptions.ValorException;

public class Conta {

	private double saldo;
	private double limite;
	private int numero;
	
	public void sacar(double valor) {
		try {
			if (valor > this.saldo) 
				throw new SaldoNegativoException("Saldo menor que o valor informado!");
			else
				this.saldo -= valor;
		} catch (SaldoNegativoException sne) {
			System.out.println(sne.getMessage());
		}	
	}
	
	public void depositar(double valor) {
		try {
			if(valor <= 0)
				throw new ValorException("Valor impossível de depositar!");
			else
				this.saldo += valor;
		} catch (ValorException ve) {
			// TODO: handle exception
			System.out.println(ve.getMessage());
		}
	}
	
	public double obterSaldo() {
		return this.saldo;
	}
}
