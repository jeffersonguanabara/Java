package lista_de_Exercicio;

import java.util.Scanner;

public class Questao_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro para A: ");
		a = teclado.nextInt();
		System.out.println("Informe um valor inteiro para B: ");
		b = teclado.nextInt();		
		System.out.println("Informe um valor inteiro para C: ");
		c = teclado.nextInt();
		
		if ((a + b) > c)
			System.out.println("A soma entre " + a + " e " + b + " é maior que " + c + ", então (A + B) > C");
		else if ((a + b) < c)
			System.out.println("A soma entre " + a + " e " + b + " é menor que " + c + ", então (A + B) < C");
		else
			System.out.println("A soma entre " + a + " e " + b + " é igual a " + c + ", então (A + B) = C");
	}

}
