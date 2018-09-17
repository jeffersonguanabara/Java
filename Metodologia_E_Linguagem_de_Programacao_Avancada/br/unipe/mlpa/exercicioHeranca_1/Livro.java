package br.unipe.mlpa.exercicioHeranca_1;

public class Livro extends Produto {

	private String autor;

	public Livro() {
		// TODO Auto-generated constructor stub
	}
	
	public Livro(String nome, double preco, String codigoDeBarras, String autor) {
		super(nome, preco, codigoDeBarras);
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "Produto:\nLivro ["+ super.toString() + ", autor=" + autor + "]\n";
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
