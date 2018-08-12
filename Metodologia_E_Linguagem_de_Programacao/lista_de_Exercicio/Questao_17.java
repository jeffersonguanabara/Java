package lista_de_Exercicio;

import java.util.Scanner;

public class Questao_17 {
	public static void main(String[] args) {
		double total = 0;
		Scanner teclado = new Scanner(System.in);
		int codigo = 0;
		do {
			System.out.println("Informe o código do produto:\n1 - Caderno\n2 - Régua\n3 - Borracha\n4 - Mochila\n0 - Sair");
			System.out.println("-----------------------------------------------------------");
			codigo = teclado.nextInt();
			
			if(codigo == 0)
				break;
			
			System.out.println("Digite a quantidade adquirida: ");
			int quantidade = teclado.nextInt();
			
			if(codigo == 1) 
				total += (12.00 * quantidade);
			else if(codigo == 2)
				total += (2.50 * quantidade);
			else if(codigo == 3)
				total += (0.25 * quantidade);
			else if(codigo == 4)
				total += (50.00 * quantidade);
			else
				System.out.println("Código Inválido!");
		}while(codigo != 0);
		
		if (codigo != 0)
			System.out.println("Valor Total a ser Pago: " + total);
	}
}
