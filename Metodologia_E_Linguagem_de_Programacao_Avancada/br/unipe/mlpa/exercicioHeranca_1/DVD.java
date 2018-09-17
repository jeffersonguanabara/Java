package br.unipe.mlpa.exercicioHeranca_1;

public class DVD extends Produto {
	
	private String duracao;
	
	public DVD() {
		// TODO Auto-generated constructor stub
	}

	public DVD(String nome, double preco, String codigoDeBarras, String duracao) {
		super(nome, preco, codigoDeBarras);
		this.duracao = duracao;
	}
	
	@Override
	public double valorDesconto() {
		return this.preco * (50/100);
	}
	
	@Override
	public String toString() {
		return "DVD ["+ super.toString() + "duracao=" + duracao + "]\n";
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	
}
