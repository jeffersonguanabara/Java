package br.caelum.FJ11.Capitulo_3;

// fatorial
public class Questao_4 {

	public static void main(String [] args) {
		 
		int numero = 0;
		int fatorial = 0;
		while (numero <= 10) {
			if(numero == 0)
				fatorial += 1;
			else
				fatorial = numero * fatorial;
			System.out.println("Fatorial de " + numero + " é " + fatorial);
			numero++;
		}
	}
}
