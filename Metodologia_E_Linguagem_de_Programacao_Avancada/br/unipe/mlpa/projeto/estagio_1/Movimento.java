package br.unipe.mlpa.projeto.estagio_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Alunos: Aline Myrtes
 * 		   Jefferson Guanabara
 */

public class Movimento {

	private int tipo;
	private Date dataMovimentacao;
	private Date horaMovimentacao;
	private double valMovimento;
	
	public Movimento() {
		// TODO Auto-generated constructor stub
	}

	public Movimento(int tipo, Date dataMovimentacao, Date horaMovimentacao, double valMovimento) {
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

	public Date getHoraMovimentacao() {
		return horaMovimentacao;
	}

	public double getValMovimento() {
		return valMovimento;
	}

	public void setValMovimento(double valMovimento) {
		this.valMovimento = valMovimento;
	}
	
	public void setDataHoraMovimentacao() {
		Calendar calendar = Calendar.getInstance();//cria o obj calendar e atribui a hora e data do sistema
		Date data = calendar.getTime();//transforma o obj calendar em obj Date

		SimpleDateFormat sddia = new SimpleDateFormat("dd-MM-yyyy");//cria um obj de formatação de data
		SimpleDateFormat sdhora = new SimpleDateFormat("HH:mm:ss");//cria um obj de formatação de hora
		String dia = sddia.format(data);//gera a string final formatada no estilo "dd-MM-yyyy"
		String hora = sdhora.format(data);//gera a string final formatada no estilo "HH:mm:ss"
		
		try {
			this.dataMovimentacao = sddia.parse(dia);
			this.horaMovimentacao = sdhora.parse(hora);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
