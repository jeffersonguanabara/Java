package lista_de_Exercicio;

import java.util.Scanner;

public class Questao_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero, quantidade = 0;
		
		do {
			System.out.println("Informe um número inteiro: ");
			numero = teclado.nextInt();
			
			if (numero == 2)
				quantidade++;
		} while(numero != 0);
		
		System.out.println("A quantidade de números 2 digitados foram: " + quantidade);
	}

}
