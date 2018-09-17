package br.unipe.mlpa.exercicioExcecoes.Utils;

import java.util.Scanner;

public class TestaIdade {
	
	public static void main(String[] args) {
		int idade = 0;
		
		Pessoa pessoa = new Pessoa();
		Scanner teclado = new Scanner(System.in);
		pessoa.setNome("Thiago");
		
		do {
			System.out.println("Informe sua idade");
			idade = teclado.nextInt();
			
			pessoa.setIdade(idade);
		} while (idade <= 0);
		
		System.out.println(pessoa);
	}

}
