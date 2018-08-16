package br.unipe.mlp.estagio_2;

import java.util.Scanner;

public class exemplo_4_aula12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeros[] = new int[10];
		int i = 0;

		while (i < 10) {
			System.out.println("Informe um valor inteiro: ");
			numeros[i] = entrada.nextInt();

			if (numeros[i] > 0) {
				System.out.println(numeros[i]);
			}
			i++;
		}
	}
}
