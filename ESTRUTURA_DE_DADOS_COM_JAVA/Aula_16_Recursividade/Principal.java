package Aula_16_Recursividade;

import java.util.Scanner;

public class Principal {

	public static void main(String [] args) {
		/*System.out.println("Você quer descobrir o fatorial de qual número? ");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int resultado = calculadoFatorial(n);
		*/
		
		/*System.out.println("Informe o primeiro numero: ");
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		System.out.println("Informe o segundo numero: ");
		int b = teclado.nextInt();
		int resultado = calculafuncao(a, b);
		*/
		
		int resultado = calculaValor(4);
		
		System.out.println("O resultado é: " + resultado);
	}

	private static int calculaValor(int i) {
		if (i == 1)
			return 0;
		else if (i == 2)
			return 1;
		else
			return calculaValor(i - 1) + calculaValor(i - 2);
	}

	private static int calculafuncao(int a, int b) {
		if (b == 0)
			return a;
		else
			return calculafuncao(b, (a % b));
	}

	private static int calculadoFatorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * calculadoFatorial(n - 1);
	}
}
