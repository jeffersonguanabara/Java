package br.unipe.mlpa.projeto.estagio_1;

import java.util.ArrayList;
import java.util.List;

/*
 * Alunos: Aline Myrtes
 * 		   Jefferson Guanabara
 */

public class Agencia {

	private long numero;
	private List<Conta> contas;
	private Endereco endereco;
	
	public Agencia() {
		// TODO Auto-generated constructor stub
		this.contas = new ArrayList<Conta>();
	}
	
	public Agencia(long numero, Endereco endereco) {
		super();
		this.numero = numero;
		this.contas = new ArrayList<Conta>();
		this.endereco = endereco;
	}
	
	public Agencia(long numero, List<Conta> contas, Endereco endereco) {
		super();
		this.numero = numero;
		this.contas = new ArrayList<Conta>();
		this.endereco = endereco;
	}
	
	public Conta acessarConta(int numeroDeConta) {
		Conta auxiliar = new Conta();
		for (Conta conta : contas) {
			if (conta.getNumeroConta() == numeroDeConta) {
				auxiliar = conta;
			} else {
				auxiliar = null;
			}
		}
		return auxiliar;
	}

	@Override
	public String toString() {
		return "Agencia [numero=" + numero + ", contas=" + contas + ", endereco=" + endereco + "]";
	}
	
	public void cadastrarConta(Conta conta) {
		contas.add(conta);
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public long numeroDaContaNaAgencia () {
		//System.out.println(contas.size());
		return contas.size() + 1;
	}

}
