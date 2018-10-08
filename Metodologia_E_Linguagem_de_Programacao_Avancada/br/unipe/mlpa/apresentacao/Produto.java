package br.unipe.mlpa.apresentacao;

public class Produto {

	private int codigo;
	private String nome;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public Produto(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String toString() {
		String s = "";
		s = "[Produto] \n" +
				"Código: " + this.codigo + "\n" +
				"Nome: " + this.nome + "\n";
		return s;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
