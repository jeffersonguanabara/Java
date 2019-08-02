package br.caelum.FJ11.Capitulo_3;

public class Questao_2 {

	public static void main(String [] args) {
		int i = 1;
		int soma = 0;
		while(i <= 1000) {
			soma+=i;
			System.out.println(i + ", Soma: " + soma);
			i++;
		}
	}
}
