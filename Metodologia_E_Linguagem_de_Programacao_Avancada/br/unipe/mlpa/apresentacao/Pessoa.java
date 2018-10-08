package br.unipe.mlpa.apresentacao;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	private Endereco endereco;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade, String cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public String toString() {
		String s = "";
		s = "[Pessoa] \n" +
				"Nome: " + this.nome + "\n" +
				"Idade: " + this.idade + "\n" +
				"CPF: " + this.cpf + "\n" +
				this.endereco;
		return s;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
}
