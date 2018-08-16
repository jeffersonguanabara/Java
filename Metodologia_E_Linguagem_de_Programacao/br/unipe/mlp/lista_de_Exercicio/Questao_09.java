package br.unipe.mlp.lista_de_Exercicio;

import java.util.Scanner;

public class Questao_09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a idade do atleta: ");
		int idade = teclado.nextInt();
		
		if ((idade >= 5) && (idade <= 10))
			System.out.println("Categoria Infantil.");
		else if ((idade >= 11) && (idade <= 15))
			System.out.println("Categoria Juvenil.");
		else if((idade >= 16) && (idade <= 20))
			System.out.println("Categoria Júnior.");
		else if((idade >= 20) && (idade <= 25))
			System.out.println("Categoria Profissional.");
		else
			System.out.println("Categoria não especificada.");
	}
}
