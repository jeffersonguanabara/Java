package br.unipe.ED.aula_18_Algoritmos_De_Ordenacao;

public class Principal {

	public static void main(String[] args) {

		int[] lista_nao_ordenada_1 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] lista_nao_ordenada_2 = { 1, 5, 9, 7, 8, 8, 10, 20, 2, -1 };

		int[] lista_ordenada_1 = bubbleSort(lista_nao_ordenada_1);
		int[] lista_ordenada_2 = bubbleSort(lista_nao_ordenada_2);

		System.out.println("Exibindo lista ordenada 1");
		for (int i : lista_ordenada_1) {
			System.out.print(i + " | ");
		}
		System.out.println("Exibindo lista ordenada 2");
		for (int i : lista_ordenada_2) {
			System.out.print(i + " | ");
		}
	}

	private static int[] bubbleSort(int[] lista) {
		int n = lista.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (lista[j] > lista[j + 1]) {
					int aux = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = aux;
				}
			}
		}
		return lista;
	}
}
