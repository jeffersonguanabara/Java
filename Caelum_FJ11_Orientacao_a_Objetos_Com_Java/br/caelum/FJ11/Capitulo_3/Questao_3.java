package br.caelum.FJ11.Capitulo_3;

public class Questao_3 {

	public static void main(String [] args) {
		
		int numero = 0;
		int multiplo = 0;
		while (multiplo <= 100) {
			multiplo = numero * 3;
			if (multiplo > 100)
				continue;
			else
				System.out.println(numero + " x 3 = " + multiplo);
			numero++;
		}
		
	}
}
