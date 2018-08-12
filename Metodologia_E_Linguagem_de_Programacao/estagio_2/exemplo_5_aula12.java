package estagio_2;

import java.util.Scanner;

public class exemplo_5_aula12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetor[] = new int[10];
		int cont = 0;
		
		while (cont < 10) {
			System.out.println("Informe um valor inteiro: ");
			vetor[cont] = entrada.nextInt();
			
			if (vetor[cont] < 0) {
				vetor[cont] = 0;
			}
			
			cont++;
		}
		
		while (cont < 10) {
			System.out.println(vetor[cont]);
		}
		
		
	}
}
