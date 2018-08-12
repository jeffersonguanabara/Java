package lista_de_Exercicio;

import java.util.Scanner;

public class Questao_18 {
	public static void main(String[] args) {
		double nota_1, nota_2, nota_3;
		int peso_1, peso_2, peso_3;
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		do {
			// Chamado ao m�todo exibirMenu()
			exibirMenu();
			// Atribuindo valor a vari�vel opcao
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("M�dia Aritm�tica");
				System.out.println("Informe a 1� nota: ");
				nota_1 = teclado.nextDouble();
				System.out.println("Informe a 2� nota: ");
				nota_2 = teclado.nextDouble();
				
				System.out.println("M�dia Aritm�tica: " + mediaAritmetica(nota_1, nota_2));
				break;
			case 2:
				System.out.println("M�dia Ponderada: ");
				System.out.println("Informe a 1� nota:");
				nota_1 = teclado.nextDouble();
				System.out.println("Informe o peso correspondente a nota");
				peso_1 = teclado.nextInt();
				System.out.println("Informe a 2� nota: ");
				nota_2 = teclado.nextDouble();
				System.out.println("Informe o peso correspondente a nota");
				peso_2 = teclado.nextInt();
				System.out.println("Informe a 3� nota: ");
				nota_3 = teclado.nextDouble();
				System.out.println("Informe o peso correspondente a nota");
				peso_3 = teclado.nextInt();
				
				System.out.println("M�dia Ponderada: " + mediaPonderada(nota_1, peso_1, nota_2, peso_2, nota_3, peso_3));
				break;
			case 3: 
				System.out.println("Programa Encerrado!");
				break;
			default:
				System.out.println("Op��o inv�lida, tente novamente!");
				break;
			}
			System.out.println();
		}while(opcao != 3);
	}
	
	public static void exibirMenu() {
		System.out.println("Menu de op��es: " +
				"\n1. M�dia Aritm�tica" + 
				"\n2. M�dia Ponderada" +
				"\n3. Sair"+
				"\n------------------------------" +
				"\nDigite a op��o desejada: ");
	}
	
	public static double mediaAritmetica(double nota_1, double nota_2) {
		return (nota_1 + nota_2)/2;
	}
	
	public static double mediaPonderada(double nota_1, double peso_1, double nota_2, double peso_2, double nota_3, double peso_3) {
		return ((nota_1 * peso_1) + (nota_2 * peso_2) + (nota_3 * peso_3)) / (peso_1 + peso_2 + peso_3);
	}
}
