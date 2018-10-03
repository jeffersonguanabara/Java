package br.unipe.mlpa.exercicioHeranca_2;

public class TestaOperario {

	public static void main(String[] args) {
		
		Operario operario = new Operario();
		
		operario.setNome("João");
		operario.setEndereco("Rua Barão");
		operario.setTelefone("98633-5294");
		operario.setCodigoSetor(01);
		operario.setSalarioBase(3000.00f);
		operario.setImposto(0.01f);
		operario.setValorProducao(15000.00f);
		operario.setComissao(0.03f);
		
		System.out.println(operario.getNome());
		System.out.println(operario.getEndereco());
		System.out.println(operario.getTelefone());
		System.out.println(operario.getCodigoSetor());
		System.out.println(operario.getSalarioBase());
		System.out.println(operario.getImposto());
		System.out.println(operario.getValorProducao());
		System.out.println(operario.getComissao());
		System.out.println(operario.calculaSalario());
		
		System.out.println(operario);
	}
}
