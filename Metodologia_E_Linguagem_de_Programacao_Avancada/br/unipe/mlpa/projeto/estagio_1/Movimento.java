package br.unipe.mlpa.projeto.estagio_1;

import java.util.Date;

public class Movimento {

	private int tipo;
	private Date dataMovimentacao;
	private Date horaMovimentacao;
	private float valMovimento;
	
	public Movimento() {
		// TODO Auto-generated constructor stub
	}

	public Movimento(int tipo, Date dataMovimentacao, Date horaMovimentacao, float valMovimento) {
		super();
		this.tipo = tipo;
		this.dataMovimentacao = dataMovimentacao;
		this.horaMovimentacao = horaMovimentacao;
		this.valMovimento = valMovimento;
	}

	@Override
	public String toString() {
		return "Movimento [tipo=" + tipo + ", dataMovimentacao=" + dataMovimentacao + ", horaMovimentacao="
				+ horaMovimentacao + ", valMovimento=" + valMovimento + "]";
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public Date getHoraMovimentacao() {
		return horaMovimentacao;
	}

	public void setHoraMovimentacao(Date horaMovimentacao) {
		this.horaMovimentacao = horaMovimentacao;
	}

	public float getValMovimento() {
		return valMovimento;
	}

	public void setValMovimento(float valMovimento) {
		this.valMovimento = valMovimento;
	}	
}
