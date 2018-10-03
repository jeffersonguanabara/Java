package br.unipe.mlpa.exercicioHeranca_2;

public class TestaFornecedor {

	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor();
		
		fornecedor.setNome("BR7");
		fornecedor.setEndereco("Av. Brasil");
		fornecedor.setTelefone("4040-1234");
		fornecedor.setValorCredito(100000.00f);
		fornecedor.setValorDivida(58345.54f);
		
		System.out.println(fornecedor.getNome());
		System.out.println(fornecedor.getEndereco());
		System.out.println(fornecedor.getTelefone());
		System.out.println(fornecedor.getValorCredito());
		System.out.println(fornecedor.getValorDivida());
		System.out.println(fornecedor.obterSaldo());
		
		System.out.println(fornecedor);
	}
}
