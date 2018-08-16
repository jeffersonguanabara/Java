package br.unipe.ED.aula_15_Arvore_De_Busca_Binária;

public class Principal {

	public static void main(String[] args) {

		NoArvore abb = new NoArvore();

		abb.insere(abb, 6);
		abb.insere(abb, 8);
		abb.insere(abb, 4);
		abb.insere(abb, 5);
		abb.insere(abb, 2);
		abb.insere(abb, 3);
		abb.insere(abb, 1);
		abb.insere(abb, 9);
		abb.insere(abb, 7);

		NoArvore resultado = abb.busca(abb, 10);

		if (resultado == null) {
			System.out.println("Não encontrei o nó");
		} else {
			System.out.println("Encontrei o nó: " + resultado.valor);
		}

		abb.imprime(abb);
		abb.remorer(abb, 5);
		abb.imprime(abb);
	}
}
