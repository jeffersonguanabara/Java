package br.unipe.mlp.lista_de_Exercicio;

public class Questão_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 6; i++) {
			int numero = (int)(Math.random() * 100);
			if(numero < 60)
				System.out.println(numero);
			else
				i--;
		}
	}

}