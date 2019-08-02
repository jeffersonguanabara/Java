package br.caelum.FJ11.Capitulo_3;
import java.util.Scanner;

public class Questao_7 {

	public static void main(String [] args) {
		
		// declarando uma instancia do tipo Scanner para entrada de dados pelo teclado
		Scanner teclado = new Scanner(System.in);
		
		// exibindo na tela o texto informativo para entrada de dados
		System.out.println("Digite um número inteiro");
		
		// Caso o valor informado seja um inteiro segue-se o que está no try
		// Caso contrario o catch com a mensagem é acionado.
		try {
			// atribuindo o valor informado a variável numero
			int numero = teclado.nextInt();
			// exibindo na tela o valor informado
			System.out.print(numero + " -> ");
			// enquanto essa valor for diferente de 1 as operações abaixo serão executadas
			while (numero != 1) {
				// se o numero informado dividido por dois tiver resto zero
				if (numero % 2 == 0) 
					numero = numero / 2;
				// caso contrario
				else
					numero = 3 * numero + 1;
				// se apos as operações acima numero for diferente de 1, então exiba:
				if (numero != 1)
					System.out.print(numero + " -> ");
				// caso contrário, exiba:
				else
					System.out.print(numero + ".");
			}
		} catch (Exception e) { 
			// mensagem de que o valor informado não é do tipo inteiro.
			System.out.print("Valor digitado não é inteiro");
		}
	}
}
