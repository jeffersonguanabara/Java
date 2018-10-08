package br.unipe.mlpa.projeto.estagio_1;

/*
 * Alunos: Aline Myrtes
 * 		   Jefferson Guanabara
 */

public class Pessoa {

	protected String nome;
	protected float rendaPessoa;
	protected int situacaoPessoa;
	protected Endereco endereco;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, float rendaPessoa, int situacaoPessoa, Endereco endereco) {
		super();
		this.nome = nome;
		this.rendaPessoa = rendaPessoa;
		this.situacaoPessoa = situacaoPessoa;
		this.endereco = endereco;
	}
		
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rendaPessoa=" + rendaPessoa + ", situacaoPessoa=" + situacaoPessoa
				+ ", endereco=" + endereco + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getRendaPessoa() {
		return rendaPessoa;
	}

	public void setRendaPessoa(float rendaPessoa) {
		this.rendaPessoa = rendaPessoa;
	}

	public int getSituacaoPessoa() {
		return situacaoPessoa;
	}

	public void setSituacaoPessoa(int situacaoPessoa) {
		this.situacaoPessoa = situacaoPessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
}
