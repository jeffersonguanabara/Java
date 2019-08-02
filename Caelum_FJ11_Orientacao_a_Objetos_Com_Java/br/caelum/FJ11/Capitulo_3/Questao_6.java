package br.caelum.FJ11.Capitulo_3;

//fibonacci
public class Questao_6 {

	public static void main(String [] args) {
		int numero = 1;
		int fibonacci = 0;
		while (fibonacci <= 100) {
			if (fibonacci == 0) {
				System.out.print(fibonacci + ", ");
				System.out.print(numero + ", ");
				fibonacci = numero;
			} else {
				int aux = 0;
				System.out.print(fibonacci + ", ");
				aux = fibonacci;
				fibonacci = fibonacci + numero;
				numero = aux;
				if (fibonacci > 100)
					System.out.print(fibonacci + ".");
			}		
		}
	}
}
