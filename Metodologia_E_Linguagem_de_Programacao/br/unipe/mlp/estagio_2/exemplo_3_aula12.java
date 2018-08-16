package br.unipe.mlp.estagio_2;

import java.util.Scanner;

public class exemplo_3_aula12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeros[] = new int[10];
		int cont = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe um número inteiro: ");
			numeros[i] = teclado.nextInt();

			if (numeros[i] > 5) {
				cont++;
			}
		}

		System.out.println("Quant. de números maiores que 5: " + cont);

	}
}
