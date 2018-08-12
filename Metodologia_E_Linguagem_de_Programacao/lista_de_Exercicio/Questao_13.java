package lista_de_Exercicio;

import java.util.Scanner;

public class Questao_13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int quantPessoas = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe a idade da pessoa: ");
			int idade = teclado.nextInt();
			if ((idade >= 0) && (idade <= 12))
				quantPessoas++;
		}
		System.out.println("A quantidade de pessoas com idades entre 0 e 12 anos é de: " + quantPessoas);
	}
}
