package br.unipe.mlpa.exercicioHeranca_2;

public class TestaEmpregado {

	public static void main(String[] args) {
		
		Empregado empregado = new Empregado();
		
		empregado.setNome("Paulo");
		empregado.setEndereco("Rua Providência");
		empregado.setTelefone("99987-5673");
		empregado.setCodigoSetor(21);
		empregado.setSalarioBase(2000.00f);
		empregado.setImposto(0.23f);
		
		System.out.println(empregado.getNome());
		System.out.println(empregado.getEndereco());
		System.out.println(empregado.getTelefone());
		System.out.println(empregado.getCodigoSetor());
		System.out.println(empregado.getSalarioBase());
		System.out.println(empregado.getImposto());
		System.out.println(empregado.calculaSalario());
		
		System.out.println(empregado);
	}
}
