package br.unipe.ED.aula_11_Fila_Sequencial;

public class Principal {

	public static void main(String[] args) {

		FilaSequencial fila = new FilaSequencial();

		fila.inserir("Ana");
		fila.inserir("Bruno");
		fila.inserir("Carla");
		fila.inserir("Daniel");
		fila.inserir("Eduardo");
		System.out.println(fila.exibirFila());

		fila.remover();
		fila.remover();
		fila.remover();
		System.out.println(fila.exibirFila());

		fila.inserir("Fábio");
		fila.inserir("Gustavo");
		System.out.println(fila.exibirFila());

		fila.esvaziarFila();
		System.out.println(fila.exibirFila());
	}
}
