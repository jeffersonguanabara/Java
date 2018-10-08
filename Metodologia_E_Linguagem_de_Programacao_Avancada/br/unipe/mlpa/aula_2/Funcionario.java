package br.unipe.mlpa.aula_2;

public class Funcionario {

	protected String nome;
	protected double salario;
	
	public double calculaBonificacao() {
		return this.getSalario() * 10/100;
	}

	@Override
	public String toString() {
		String s = "";
		s = "Nome: " + this.getNome() + "\n" +
				"Salário: " + this.getSalario() + "\n";
		return s;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
