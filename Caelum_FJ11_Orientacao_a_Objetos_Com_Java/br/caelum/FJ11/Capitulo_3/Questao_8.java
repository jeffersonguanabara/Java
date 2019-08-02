package br.caelum.FJ11.Capitulo_3;

import java.util.Scanner;

public class Questao_8 {

	public static void main(String [] args) {
		
		// definindo uma instancia para entrada de dados pelo teclado 
		Scanner teclado = new Scanner(System.in);
		
		// o comando try verifica se vai ocorrer uma exceção. 
		try {
			// mensagem informativa para entrada de dados
			System.out.println("Digite um número inteiro");
			// atribuindo a variável numero o valor digitado pelo usuário
			int numero = teclado.nextInt();
			
			// loops 
			for(int i = 1; i <= numero; i++) {
				for (int j = 1; j <= numero; j++) {
					// se o valor de i for igual a j, então:
					if (i == j)
						System.out.print(i * j + " ");
					// se o valor de i for menor que j, então: 
					if (i < j)
						System.out.print(" ");
					// se o valor de i for maior que j, então:
					if (i > j) {
						// se j for menor que 2, então:
						if (j < 2)
							System.out.print(i + " ");
						// se j for diferente de 1.
						else
							System.out.print(i * j + " ");
					}
				}
				// comando para pular uma linha
				System.out.println();
			}
		} catch (Exception e) {
			// mensagem caso o valor informado não seja um número inteiro.
			System.out.println("Valor digitado não é inteiro.");
		}
		
	}
}
