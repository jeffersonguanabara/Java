package br.unipe.mlp.lista_de_Exercicio;

import java.util.Scanner;

public class Questão_02 {
	
	private static Scanner teclado;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teclado = new Scanner(System.in);
		
		System.out.println("Informe uma senha: ");
		String senha = teclado.nextLine();
		
		System.out.println("Informe um valor inteiro: ");
		int numero_1 = teclado.nextInt();
		
		System.out.println("Informe outro valor inteiro: ");
		int numero_2 = teclado.nextInt();
		
		int divisao = numero_1 / numero_2;
		
		System.out.println("Informe novamente a senha: ");
		String senhaTeste = teclado.next();
		
		if (senhaTeste.equals(senha)) {
			System.out.println("O resultado da divisão entre " + numero_1 + " / " + numero_2 + " = " + divisao);
		}
		else
		{
			System.out.println("Senha errada!");
			System.exit(0);
		}
	}
}
