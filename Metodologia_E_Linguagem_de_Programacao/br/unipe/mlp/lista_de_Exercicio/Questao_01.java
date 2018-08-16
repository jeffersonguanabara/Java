package br.unipe.mlp.lista_de_Exercicio;

import java.util.Scanner;

public class Questao_01 {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		System.out.println("Informe a sua altura: ");
		double altura = teclado.nextDouble();
		System.out.println("Informe o seu peso: ");
		double peso = teclado.nextDouble();
		
		double massaCorporea = (peso / (Math.pow(altura, 2)));
		
		if (massaCorporea < 18.5)
			System.out.println("Situação magro!");
		if ((massaCorporea >= 18.5) && (massaCorporea <= 24.9))
			System.out.println("Situação Normal!");
		if ((massaCorporea >= 25) && (massaCorporea <= 29.9))
			System.out.println("Situação Sobrepeso!");
		if ((massaCorporea >= 30) && (massaCorporea <= 34.9))
			System.out.println("Situação Obeso!");
		if ((massaCorporea >= 35) && (massaCorporea <= 39.9))
			System.out.println("Situação Obesidade Mórbida!");		
	}
}
