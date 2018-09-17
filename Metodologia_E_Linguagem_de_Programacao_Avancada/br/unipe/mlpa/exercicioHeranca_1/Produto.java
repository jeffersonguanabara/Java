package br.unipe.mlpa.exercicioHeranca_1;

public class Produto {
	
	protected String nome;
	protected double preco;
	protected String codigoDeBarras;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public Produto(String nome, double preco, String codigoDeBarras) {
		this.nome = nome;
		this.preco = preco;
		this.codigoDeBarras = codigoDeBarras;
	}
	
	public double valorDesconto() {
		return preco * (20/100);
	}
	
	@Override
	public String toString() {
		return "nome=" + this.nome + ", preco=" + this.preco;
	}
	
	@Override
	public boolean equals(Object produto) {
		if (this.codigoDeBarras.equals(((Produto) produto).getCodigoDeBarras()))
			return true;
		else
			return false;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
		
}
