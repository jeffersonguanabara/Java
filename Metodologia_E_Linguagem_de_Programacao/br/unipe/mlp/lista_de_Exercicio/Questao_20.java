package br.unipe.mlp.lista_de_Exercicio;

import java.util.Scanner;

public class Questao_20 {

	public static void main(String[] args) {
		
		int i, contadorHomens = 0, contadorMulheres = 0;
		String sexo = "";
		double maior = 0.0, altura = 0.0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			for(i = 0; i < 10; i++) {
				System.out.println("Digite o sexo da pessoa: (Masculino ou Feminino)");
				sexo = entrada.next();
				System.out.println("Digite a altura da pessoa: ");
				altura = entrada.nextDouble();
				
				if ((sexo.equals("M")) || (sexo.equals("Masculino")) || (sexo.equals("m") || (sexo.equals("masculino"))))
					contadorHomens++;
				if ((sexo.equals("F")) || (sexo.equals("Feminino")) || (sexo.equals("f") || (sexo.equals("feminino"))))
					contadorMulheres++;
				
				if(altura > maior) {
					maior = altura;
				}
				
				System.out.println("\n-------------------------------------------\n");
			}
		}while(i < 10);
		
		System.out.println("Altura da pessoa mais alta: " + maior);
		System.out.println("Número de homens: " + contadorHomens);
		System.out.println("Número de mulheres: " + contadorMulheres);
	}
}
