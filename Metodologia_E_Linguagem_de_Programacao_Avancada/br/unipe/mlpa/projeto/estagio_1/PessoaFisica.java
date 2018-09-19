package br.unipe.mlpa.projeto.estagio_1;

public class PessoaFisica extends Pessoa {

	private long cpf;
	private long rg;
	
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}
	
	public PessoaFisica(long cpf, long rg) {
		super();
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
