package lista_de_Exercicio;

import java.util.Scanner;

public class Questao_04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Chamada a entrada de dados
		System.out.println("Informe seu nome completo: ");
		String nome = teclado.nextLine();
		
		// Saída com os valores do primeiro e ultimo nome.
		System.out.println("O primeiro nome: " + nome.substring(0,nome.indexOf(" ")));
		System.out.println("O ultimo nome: " + nome.substring(nome.lastIndexOf(" ")));
	}
}
