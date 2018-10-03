package br.unipe.mlpa.exercicioHeranca_2;

public class Empregado extends Pessoa {

	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado() {
		super();
	}

	public Empregado(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	@Override
	public String toString() {
		return "Empregado ["+ super.toString() +", codigoSetor=" + codigoSetor + ", salarioBase=" + salarioBase + ", imposto=" + imposto + "]";
	}
	
	public float calculaSalario() {
		return getSalarioBase() - (getSalarioBase() * getImposto());
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
		
}
