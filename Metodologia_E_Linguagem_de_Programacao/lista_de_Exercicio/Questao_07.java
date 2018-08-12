package lista_de_Exercicio;

import java.util.Scanner;

public class Questao_07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dia = "";
		
		System.out.println("Informe um valor inteiro: ");
		int opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			dia = "Domingo!";
			break;
		case 2:
			dia = "Segunda!";
			break;
		case 3:
			dia = "Terça!";
			break;
		case 4:
			dia = "Quarta!";
			break;
		case 5: 
			dia = "Quinta!";
			break;
		case 6:
			dia = "Sexta!";
			break;
		case 7:
			dia = "Sábado!";
			break;
		default:
			dia = "Não existe dia da semana correspondente ao número informado!";
			break;
		}
		
		System.out.println(dia);
	}
}
