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
			dia = "Ter�a!";
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
			dia = "S�bado!";
			break;
		default:
			dia = "N�o existe dia da semana correspondente ao n�mero informado!";
			break;
		}
		
		System.out.println(dia);
	}
}
