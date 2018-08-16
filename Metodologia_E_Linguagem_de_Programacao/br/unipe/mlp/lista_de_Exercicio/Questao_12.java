package br.unipe.mlp.lista_de_Exercicio;

import java.util.Scanner;

public class Questao_12 {
	
	
	
	public static void main(String[] args) {
		
		double [] listaDeMedias = new double[10];
		double nota_1, nota_2, nota_3, media;
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Informe a 1ª nota do aluno " + i + ": ");
			nota_1 = teclado.nextDouble();
			System.out.println("Informe a 2ª nota do aluno " + i + ": ");
			nota_2 = teclado.nextDouble();
			System.out.println("Informe a 3ª nota do aluno " + i + ": ");
			nota_3 = teclado.nextDouble();
			
			media = (nota_1 + nota_2 + nota_3) / 3;
			
			listaDeMedias[i] = media;
			
			System.out.println("------------------------------------------------------");
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Média do aluno " + i + ": " + listaDeMedias[i]);
		}
	}
}
