package br.unipe.ED.aula_17_Algoritmo_De_Busca;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int vetorDesodernado[] = { 88, 31, 96, 52, 45, 19, 68, 70, 29, 90 };
		int vetorOrdenado[] = { 19, 29, 31, 45, 52, 68, 70, 88, 90, 96 };

		System.out.println("Qual valor deseja buscar?");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();

		buscaLinear(n, vetorDesodernado);
		buscaBinaria(n, vetorOrdenado);
	}

	private static void buscaBinaria(int n, int[] vetorOrdenado) {
		int inicio = 0;
		int fim = vetorOrdenado.length;
		boolean encontrou = false;
		int posicaoMedia = -1;

		while (inicio <= fim) {
			posicaoMedia = (inicio + fim) / 2;
			if (posicaoMedia >= vetorOrdenado.length || posicaoMedia < 0)
				break;

			if (n == vetorOrdenado[posicaoMedia]) {
				encontrou = true;
				break;
			}

			if (n < vetorOrdenado[posicaoMedia])
				fim = posicaoMedia - 1;
			else
				inicio = posicaoMedia + 1;
		}

		if (encontrou)
			System.out.println("Encontrei o número " + n + " na posição " + posicaoMedia);
		else
			System.out.println("Não encontrei este número no vetor");

	}

	private static void buscaLinear(int n, int[] vetorDesodernado) {
		boolean encontrou = false;
		int posicao = -1;
		for (int i = 0; i < vetorDesodernado.length; i++) {
			if (n == vetorDesodernado[i]) {
				encontrou = true;
				posicao = i;
				break;
			}
		}
		if (encontrou)
			System.out.println("Encontrei o número " + n + " na posição " + posicao);
		else
			System.out.println("Não encontrei este número no vetor");
	}
}
