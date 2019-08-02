package br.caelum.FJ11.Capitulo_3;

public class Questao_5_3 {

	public static void main(String [] args) {
		 
		int numero = 0;
		long fatorial = 0;
		while (numero <= 40) {
			if(numero == 0)
				fatorial += 1;
			else
				fatorial = numero * fatorial;
			System.out.println("Fatorial de " + numero + " é " + fatorial);
			numero++;
		}
	}
}
