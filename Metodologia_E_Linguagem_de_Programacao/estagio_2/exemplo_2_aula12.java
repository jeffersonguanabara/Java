package estagio_2;

import java.util.Scanner;

public class exemplo_2_aula12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeros [] = new int [20];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe um valor inteiro: ");
			numeros[i] = teclado.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número na posição " + i + ": " + numeros[i]);
		}
	}
}
