package br.unipe.mlpa.projeto.estagio_1;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

	private long numero;
	private List<Conta> contas;
	private Endereco endereco;
	
	public Agencia() {
		// TODO Auto-generated constructor stub
	}
	
	public Agencia(long numero, List<Conta> contas, Endereco endereco) {
		super();
		this.numero = numero;
		this.contas = new ArrayList<Conta>();
		this.endereco = endereco;
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
}
