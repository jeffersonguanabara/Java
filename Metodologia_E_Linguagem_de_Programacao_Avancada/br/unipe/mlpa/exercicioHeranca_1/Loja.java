package br.unipe.mlpa.exercicioHeranca_1;

import java.util.ArrayList;
import java.util.List;

public class Loja {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		
		Produto produto_1 = new Livro("Mil e Uma Noites", 32.90, "123", "Machado de Assis");
		Produto produto_2 = new CD("Humanos", 19.90, "321", 14);
		Produto produto_3 = new CD("O que na verdade somos", 22.9, "234", 12);
		Produto produto_4 = new DVD("Avengers", 50.00, "432", "196 min");
		Produto produto_5 = new DVD("Calipso", 9.99, "555", "165 min");
		
		produtos.add(produto_1);
		produtos.add(produto_2);
		produtos.add(produto_3);
		produtos.add(produto_4);
		produtos.add(produto_5);
		
		System.out.println(produtos);
		
		
		Produto teste_1 = new Livro("Mil e Uma Noites", 32.90, "123", "Machado de Assis");
		Produto teste_2 = new Livro("Mil e Uma Noites", 32.90, "223", "Machado de Assis");
		
		int resultado_1 = Loja.buscarProduto(teste_1, produtos); 
		int resultado_2 = Loja.buscarProduto(teste_2, produtos);
		
		System.out.println("-----Teste 1 ------");
		if(resultado_1 != -1) {
			System.out.println("Produto encontrado na posição " + resultado_1 + " da lista.");
		} else {
			System.out.println("Produto não encontrado!");
		}
		
		System.out.println("-----Teste 2 ------");
		if(resultado_2 != -1) {
			System.out.println("Produto encontrado na posição " + resultado_2 + " da lista.");
		} else {
			System.out.println("Produto não encontrado!");
		}
		
		
	}
	
	public static int buscarProduto(Produto produto, List<Produto> produtos) {
		int teste = -1;
		for (Produto produto2 : produtos) { 
			if(produto.equals(produto2))
				 teste = produtos.indexOf(produto);
		}
		return teste;
	}
}
