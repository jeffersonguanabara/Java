package br.unipe.mlpa.exercicioHeranca_2;

public class Operario extends Empregado {

	private float valorProducao;
	private float comissao;
	
	public Operario() {
		super();
	}

	public Operario(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto, float valorProducao, float comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Operario [" + super.toString() + ",valorProducao=" + valorProducao + ", comissao=" + comissao + "]";
	}
	
	@Override
	public float calculaSalario() {
		return super.calculaSalario() + (getValorProducao() * getComissao());
	}
	public float getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

}
