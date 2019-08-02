package br.caelum.FJ11.Capitulo_3;

public class Questao_5_2 {

	public static void main(String [] args) {
		 
		int numero = 0;
		int fatorial = 0;
		while (numero <= 30) {
			if(numero == 0)
				fatorial += 1;
			else
				fatorial = numero * fatorial;
			System.out.println("Fatorial de " + numero + " é " + fatorial);
			numero++;
		}
	}
}
