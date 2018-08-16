package br.unipe.mlp.lista_de_Exercicio;

import java.util.Scanner;

public class Questao_03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome, menorNome = "";
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um nome: ");
			nome = teclado.nextLine();
			if(i == 0)
				menorNome = nome;
			else {
				int valor = nome.compareTo(menorNome);
				if (valor < 0)
					menorNome = nome;
			}		
		}
		System.out.println("O menor nome informado foi: " + menorNome);
	}
}
