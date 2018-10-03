package br.unipe.mlpa.exercicioHeranca_2;

public class TestaVendedor {

public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor();
		
		vendedor.setNome("João");
		vendedor.setEndereco("Rua Barão");
		vendedor.setTelefone("98633-5294");
		vendedor.setCodigoSetor(01);
		vendedor.setSalarioBase(3000.00f);
		vendedor.setImposto(0.01f);
		vendedor.setValorVendas(15000.00f);
		vendedor.setComissao(0.03f);
		
		System.out.println(vendedor.getNome());
		System.out.println(vendedor.getEndereco());
		System.out.println(vendedor.getTelefone());
		System.out.println(vendedor.getCodigoSetor());
		System.out.println(vendedor.getSalarioBase());
		System.out.println(vendedor.getImposto());
		System.out.println(vendedor.getValorVendas());
		System.out.println(vendedor.getComissao());
		System.out.println(vendedor.calculaSalario());
		
		System.out.println(vendedor);
	}
}
