package br.unipe.mlpa.aula_2;

public class Telefonista extends Funcionario {
	
	private int codigoDeEstacaoDeTrabalho;

	@Override
	public String toString() {
		String s = "";
		s = super.toString() + 
				"Código de Estação de Trabalho: " + this.codigoDeEstacaoDeTrabalho + "\n";
		return s;
	}
	
	public int getCodigoDeEstacaoDeTrabalho() {
		return codigoDeEstacaoDeTrabalho;
	}

	public void setCodigoDeEstacaoDeTrabalho(int codigoDeEstacaoDeTrabalho) {
		this.codigoDeEstacaoDeTrabalho = codigoDeEstacaoDeTrabalho;
	}
	
}
