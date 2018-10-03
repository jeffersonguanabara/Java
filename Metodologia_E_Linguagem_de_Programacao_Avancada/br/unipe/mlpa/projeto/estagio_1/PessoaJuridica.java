package br.unipe.mlpa.projeto.estagio_1;

/*
 * Alunos: Aline Myrtes
 * 		   Jefferson Guanabara
 */


public class PessoaJuridica extends Pessoa{

	private long cnpj;

	
	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}
	
	public PessoaJuridica(String nome, float rendaPessoa, int situacaoPessoa, Endereco endereco, long cnpj) {
		super(nome, rendaPessoa, situacaoPessoa, endereco);
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + "]";
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
