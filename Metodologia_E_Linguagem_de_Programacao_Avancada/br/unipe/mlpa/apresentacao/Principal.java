package br.unipe.mlpa.apresentacao;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciando o objeto(Referência de) endereço e atribuindo valores as suas variáveis
		Endereco endereco = new Endereco();
		endereco.setRua("Rua Antonio Fonseca de Amorin");
		endereco.setNumero(108);
		endereco.setComplemento("Residência");
		endereco.setBairro("Mangabeira");
		endereco.setCidade("João Pessoa");
		endereco.setCep(58056561);
		
		//Instanciando o objeto (Referência de) pessoa e atribuindo valores as suas variáveis
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Paulo José");
		pessoa.setCpf("11111111111");
		pessoa.setIdade(17);
		pessoa.setEndereco(endereco);
		
		//Instanciando o objeto (Referência de) produto e atribuindo valores as suas variáveis
		Produto produto = new Produto();
		produto.setCodigo(170021562);
		produto.setNome("Wafer");
		
		//Instanciando o objeto (Referência de) compra e atribuindo valores as suas variáveis pelo construtor.
		Compra compra = new Compra(produto, pessoa);
		
		System.out.println("Compra realizada: \n" + compra);
		
		
	}
}
