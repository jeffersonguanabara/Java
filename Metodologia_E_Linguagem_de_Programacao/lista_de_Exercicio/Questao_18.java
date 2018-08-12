package lista_de_Exercicio;

import java.util.Scanner;

public class Questao_18 {
	public static void main(String[] args) {
		double nota_1, nota_2, nota_3;
		int peso_1, peso_2, peso_3;
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		do {
			// Chamado ao método exibirMenu()
			exibirMenu();
			// Atribuindo valor a variável opcao
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Média Aritmática");
				System.out.println("Informe a 1ª nota: ");
				nota_1 = teclado.nextDouble();
				System.out.println("Informe a 2ª nota: ");
				nota_2 = teclado.nextDouble();
				
				System.out.println("Média Aritmética: " + mediaAritmetica(nota_1, nota_2));
				break;
			case 2:
				System.out.println("Média Ponderada: ");
				System.out.println("Informe a 1ª nota:");
				nota_1 = teclado.nextDouble();
				System.out.println("Informe o peso correspondente a nota");
				peso_1 = teclado.nextInt();
				System.out.println("Informe a 2ª nota: ");
				nota_2 = teclado.nextDouble();
				System.out.println("Informe o peso correspondente a nota");
				peso_2 = teclado.nextInt();
				System.out.println("Informe a 3ª nota: ");
				nota_3 = teclado.nextDouble();
				System.out.println("Informe o peso correspondente a nota");
				peso_3 = teclado.nextInt();
				
				System.out.println("Média Ponderada: " + mediaPonderada(nota_1, peso_1, nota_2, peso_2, nota_3, peso_3));
				break;
			case 3: 
				System.out.println("Programa Encerrado!");
				break;
			default:
				System.out.println("Opção inválida, tente novamente!");
				break;
			}
			System.out.println();
		}while(opcao != 3);
	}
	
	public static void exibirMenu() {
		System.out.println("Menu de opções: " +
				"\n1. Média Aritmética" + 
				"\n2. Média Ponderada" +
				"\n3. Sair"+
				"\n------------------------------" +
				"\nDigite a opção desejada: ");
	}
	
	public static double mediaAritmetica(double nota_1, double nota_2) {
		return (nota_1 + nota_2)/2;
	}
	
	public static double mediaPonderada(double nota_1, double peso_1, double nota_2, double peso_2, double nota_3, double peso_3) {
		return ((nota_1 * peso_1) + (nota_2 * peso_2) + (nota_3 * peso_3)) / (peso_1 + peso_2 + peso_3);
	}
}
