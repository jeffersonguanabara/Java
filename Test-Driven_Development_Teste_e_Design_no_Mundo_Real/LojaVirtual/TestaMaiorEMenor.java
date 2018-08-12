package LojaVirtual;

import org.junit.Test;

import junit.framework.Assert;

public class TestaMaiorEMenor {

	@Test
	public void ordemDecrescente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		carrinho.adiciona(new Produto("Liquificador", 250.0));
		carrinho.adiciona(new Produto("Jogo de pratos", 70.0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);

		Assert.assertEquals("Jogo de pratos", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());

	}

	@Test
	public void ordemCrescente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
		carrinho.adiciona(new Produto("Liquidificador", 250.0));
		carrinho.adiciona(new Produto("Geladeira", 450.0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);

		Assert.assertEquals("Jogo de pratos", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());
	}

	@Test
	public void ordemVariada1() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		carrinho.adiciona(new Produto("Liquidificador", 250.0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);

		Assert.assertEquals("Jogo de pratos", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());
	}

	@Test
	public void ordemVariada2() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
		carrinho.adiciona(new Produto("Liquidificador", 250.0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);

		Assert.assertEquals("Jogo de pratos", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());
	}

	@Test
	public void ordemVariada3() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Liquidificador", 250.0));
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		carrinho.adiciona(new Produto("Jogo de pratos", 70.0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);

		Assert.assertEquals("Jogo de pratos", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());
	}

	@Test
	public void ordemVariada4() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Liquidificador", 250.0));
		carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
		carrinho.adiciona(new Produto("Geladeira", 450.0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);

		Assert.assertEquals("Jogo de pratos", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());
	}

	@Test
	public void apenasUmProduto() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Liquidificador", 250.0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);

		Assert.assertEquals("Liquidificador", algoritmo.getMenor().getNome());
		Assert.assertEquals("Liquidificador", algoritmo.getMaior().getNome());
	}

	@Test
	public void apenasUmProduto1() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Jogo de pratos", 70.0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);

		Assert.assertEquals("Jogo de pratos", algoritmo.getMenor().getNome());
		Assert.assertEquals("Jogo de pratos", algoritmo.getMaior().getNome());
	}

	@Test
	public void apenasUmProduto2() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 450.0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);

		Assert.assertEquals("Geladeira", algoritmo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());
	}
}
