package br.unipe.ED.aula_05_Lista_Simplemente_Encadeada;

public class Aluno {
	private String nome;
	private int idade;
	Aluno proximo;

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

}
