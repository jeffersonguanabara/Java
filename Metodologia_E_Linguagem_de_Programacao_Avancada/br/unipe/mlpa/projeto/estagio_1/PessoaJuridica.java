package br.unipe.mlpa.projeto.estagio_1;

public class PessoaJuridica {

	private long cnpj;

	
	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}
	
	public PessoaJuridica(long cnpj) {
		super();
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
