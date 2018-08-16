package br.unipe.ED.aula_04_Lista_Sequencial;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista listaSequencial = new Lista();

		System.out.println("A lista está vazia? " + listaSequencial.isVazia());

		System.out.println("A lista está cheia? " + listaSequencial.isCheia());

		System.out.println("Tamanho da lista: " + listaSequencial.tamanho());

		Contato c1 = new Contato();
		c1.setNome("Goku");
		c1.setTelefone("98888-0000");
		Contato c2 = new Contato();
		c2.setNome("Vegita");
		c2.setTelefone("98888-0000");
		Contato c3 = new Contato();
		c3.setNome("Gohan");
		c3.setTelefone("98888-0000");
		Contato c4 = new Contato();
		c4.setNome("Piccolo");
		c4.setTelefone("98888-0000");

		listaSequencial.inserirEmUmaDeterminadaPosicao(0, c1);
		listaSequencial.inserirEmUmaDeterminadaPosicao(1, c2);
		listaSequencial.inserirEmUmaDeterminadaPosicao(2, c3);
		listaSequencial.inserirEmUmaDeterminadaPosicao(3, c4);
		listaSequencial.inserirEmUmaDeterminadaPosicao(2, c4);

		listaSequencial.removerUmDetermindadoElementoNaPosicao(0);

		System.out.println("Buscar elemento 2: " + listaSequencial.buscarElementoPosicaoI(2));

		System.out.println("Buscar elemento Gohan: " + listaSequencial.getPosicao(c3));

		System.out.println("A lista está vazia? " + listaSequencial.isVazia());

		listaSequencial.exibirLista();
	}

}
