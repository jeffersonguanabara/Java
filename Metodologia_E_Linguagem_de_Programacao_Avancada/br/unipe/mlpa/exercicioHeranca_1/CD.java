package br.unipe.mlpa.exercicioHeranca_1;

public class CD extends Produto{
	
	private int numeroDeFaixas;

	public CD() {
		// TODO Auto-generated constructor stub
	}
	
	public CD(String nome, double preco, String codigoDeBarras, int numeroDeFaixas) {
		super(nome, preco, codigoDeBarras);
		this.numeroDeFaixas = numeroDeFaixas;
	}
	
	@Override
	public double valorDesconto() {
		return this.preco * (50/100);
	}
	
	@Override
	public String toString() {
		return "Produto:\nCD ["+ super.toString() +", numeroDeFaixas=" + numeroDeFaixas + "]\n";
	}

	public int getNumeroDeFaixas() {
		return numeroDeFaixas;
	}

	public void setNumeroDeFaixas(int numeroDeFaixas) {
		this.numeroDeFaixas = numeroDeFaixas;
	}
	
	
}
