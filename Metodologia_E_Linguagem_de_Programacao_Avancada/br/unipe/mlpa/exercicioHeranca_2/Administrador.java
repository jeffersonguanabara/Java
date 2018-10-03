package br.unipe.mlpa.exercicioHeranca_2;

public class Administrador extends Empregado {

	private float ajudaDeCusto;
	
	public Administrador() {
		super();
	}

	public Administrador(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto, float ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public String toString() {
		return "Administrador ["+ super.toString() +", ajudaDeCusto=" + ajudaDeCusto + "]";
	}

	@Override
	public float calculaSalario() {
		return super.calculaSalario() + getAjudaDeCusto();
	}
	
	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	
	
}
