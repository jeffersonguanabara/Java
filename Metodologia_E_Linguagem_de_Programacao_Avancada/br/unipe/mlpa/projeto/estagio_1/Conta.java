package br.unipe.mlpa.projeto.estagio_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.unipe.mlpa.exercicioExcecoes.Exceptions.SaldoNegativoException;
import br.unipe.mlpa.exercicioExcecoes.Exceptions.ValorException;

public class Conta {

	private long numeroConta;
	private Date dataAbertura;
	private Date dataFechamento;
	private int situacao;
	private String senha;
	private double saldo;
	private Pessoa pessoa;
	private Movimento transacao;
	private List<Movimento> movimentacao;
	
	public Conta() {
		// TODO Auto-generated constructor stub
		this.movimentacao = new ArrayList<Movimento>();
	}
	
	public Conta(long numeroConta, Date dataAbertura, Date dataFechamento, int situacao, String senha, double saldo, Pessoa pessoa) {
		super();
		this.numeroConta = numeroConta;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
		this.situacao = situacao;
		this.senha = senha;
		this.saldo = saldo;
		this.pessoa = pessoa;
		this.movimentacao = new ArrayList<Movimento>();
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", dataAbertura=" + dataAbertura + ", dataFechamento="
				+ dataFechamento + ", situacao=" + situacao + ", senha=" + senha + ", saldo=" + saldo + ", pessoa="
				+ pessoa + "]";
	}

	public void sacar(double valor) {
		try {
			if (valor > saldo) 
				throw new SaldoNegativoException("O valor do saldo � menor do que o valor informado!");
			else {
				transacao = new Movimento();
			
				transacao.setTipo(1);
				transacao.setDataHoraMovimentacao();
				transacao.setValMovimento(valor);
				
				this.saldo -= valor;
				this.movimentacao.add(transacao);
			}	
		} catch (SaldoNegativoException sne) {
			System.out.println(sne.getMessage());
		}
	}
	
	public void depositar(double valor) {
		try {
			if (valor <= 0) 
				throw new ValorException("N�o � poss�vel depositar o valor informado!");
			else {
				transacao = new Movimento();
			
				transacao.setTipo(2);
				transacao.setDataHoraMovimentacao();
				transacao.setValMovimento(valor);
			
				this.saldo += valor;
				this.movimentacao.add(transacao);
				
			}
		} catch (ValorException ve) {
			System.out.println(ve.getMessage());
		}
	}
	
	public void transferir(double valor, Conta conta) {
		try {
			if (valor > this.saldo) {
				throw new SaldoNegativoException("Saldo insulficiente para executar transfer�ncia!");
			} else {
				
				transacao = new Movimento();
				
				transacao.setTipo(1);
				transacao.setDataHoraMovimentacao();
				transacao.setValMovimento(valor);
				
				this.movimentacao.add(transacao);
				
				this.sacar(valor);
				conta.depositar(valor);
			}
		} catch (SaldoNegativoException sne) {
			System.out.println(sne.getMessage());
		}
	}
	
	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Movimento> getMovimentacao() {
		return movimentacao;
	}
	
	
		
}
