package br.unipe.mlpa.apresentacao;

public class Compra {

	private Produto produto;
	private Pessoa pessoa;
	
	public Compra() {
		// TODO Auto-generated constructor stub
	}
	
	public Compra(Produto produto, Pessoa pessoa) {
		super();
		this.produto = produto;
		this.pessoa = pessoa;
	}
	
	@Override
	public String toString() {
		String s = "";
		s = this.pessoa + "\n" + this.produto;
		return s;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
