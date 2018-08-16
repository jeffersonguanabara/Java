package br.unipe.mlp.estagio_2;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class exemplo_6_aula12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetorX[] = new int[5];
		int vetorY[] = new int[5];
		int cont = 0;

		while (cont < 5) {
			System.out.println("Informe um valor inteiro: ");
			vetorX[cont] = entrada.nextInt();
			vetorY[cont] = vetorX[cont] / 2;
		}

		while (cont < 5) {
			System.out.print("vetorX: posição " + cont + ": " + vetorX[cont]);
			System.out.print("vetorY: posição " + cont + ": " + vetorY[cont]);
		}

	}
}
