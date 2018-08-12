package lista_de_Exercicio;

import java.util.Scanner;

public class Questao_16 {
	public static void main(String[] args) {
		boolean condicao = true;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Informe a distância percorrida pelo atleta: ");
			double distancia = teclado.nextDouble();
			System.out.println("Informe o tempo que o atleta levou para percorrer a distância(em segundos): ");
			int tempo = teclado.nextInt();
			
			double velocidade = distancia / tempo;
			
			System.out.println("Deseja continuar a executar o programa: (Sim ou Não)");
			String resposta = teclado.next();
			
			if((resposta.equals("Sim")) || (resposta.equals("SIM")) || (resposta.equals("sim")) || (resposta.equals("s")))
				condicao = true;	
			else
				condicao = false;
		}while(condicao);
		
		
	}
}
