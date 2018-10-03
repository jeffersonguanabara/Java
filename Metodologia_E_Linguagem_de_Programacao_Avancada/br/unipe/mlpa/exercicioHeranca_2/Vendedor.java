package br.unipe.mlpa.exercicioHeranca_2;

public class Vendedor extends Empregado {
	
	private float valorVendas;
	private float comissao;
	
	public Vendedor() {
		super();
	}

	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto, float valorVendas, float comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Vendedor [" + super.toString() + ", valorVendas=" + valorVendas + ", comissao=" + comissao + "]";
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public float calculaSalario() {
		return super.calculaSalario() + (getValorVendas() * getComissao());
	}	
	
}
