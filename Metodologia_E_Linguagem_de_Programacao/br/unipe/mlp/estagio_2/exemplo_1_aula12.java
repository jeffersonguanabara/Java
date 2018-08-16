package br.unipe.mlp.estagio_2;

import java.util.Scanner;

public class exemplo_1_aula12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idades[] = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite sua idade: ");
			idades[i] = teclado.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Idade na posição" + i + ": " + idades[i]);
		}
	}
}
