package br.unipe.mlpa.projeto.estagio_1;

/*
 * Alunos: Aline Myrtes
 * 		   Jefferson Guanabara
 */


public class PessoaFisica extends Pessoa {

	private long cpf;
	private long rg;
	
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}
	
	public PessoaFisica(String nome, float rendaPessoa, int situacaoPessoa, Endereco endereco, long cpf, long rg) {
		super(nome, rendaPessoa, situacaoPessoa, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + "]";
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}
}
