package lista_de_Exercicio;

import java.util.Scanner;

public class Questao_06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String timeVencedor = "";
		
		System.out.println("Informe o n�mero de gols marcados pelo Sport: ");
		int golsSport = teclado.nextInt();
		
		System.out.println("Informe o n�mero de gols marcados pelo N�utico: ");
		int golsNautico = teclado.nextInt();
		
		if (golsSport > golsNautico)
			timeVencedor = "Sport";
		else if (golsSport < golsNautico)
			timeVencedor = "N�utico";
		else
			timeVencedor = "Empate";
		
		if (timeVencedor.equals("Empate"))
			System.out.println("O resultado do jogo foi: " + timeVencedor);
		else
			System.out.println("O time vencedor do Jogo foi: " + timeVencedor);
	}
}
