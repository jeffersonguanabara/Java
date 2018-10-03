package br.unipe.mlpa.exercicioHeranca_2;

public class Fornecedor extends Pessoa {

	private float valorCredito;
	private float valorDivida;
	
	public Fornecedor() {
		super();
	}

	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	@Override
	public String toString() {
		return "Fornecedor ["+ super.toString() +", valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + "]";
	}

	public float obterSaldo() {
		return getValorCredito() - getValorDivida();
	}
	
	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}

}
