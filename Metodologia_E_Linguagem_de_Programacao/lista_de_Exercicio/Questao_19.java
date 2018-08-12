package lista_de_Exercicio;

import java.util.Scanner;

public class Questao_19 {
	static int idade, contadorDePessoas;
	static double altura, media;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
				
		do {
			System.out.println("Informe a idade: ");
			idade = Integer.parseInt(teclado.next());
			if (idade != 0) {
				System.out.println("Informe a altura: ");
				altura = teclado.nextDouble();
			
				if (idade > 50) {
					mediaAltura(altura);
					contadorDePessoas++;
				}
			}
			System.out.println("\n-----------------------------------\n");
		}while((idade != 0) && (idade > 0));
		
		System.out.println("A altura média das pessoas acimas dos 50 anos é de: " + getMedia());
	}
	
	public static void mediaAltura(double altura) {
		media += altura;
	}
	
	public static double getMedia() {
		return (media / contadorDePessoas);
	}
}
