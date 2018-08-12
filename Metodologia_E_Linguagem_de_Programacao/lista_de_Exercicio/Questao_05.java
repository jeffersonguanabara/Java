package lista_de_Exercicio;

import java.util.Scanner;

public class Questao_05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String senhaPadrao = "123456";
		
		System.out.println("Informe sua senha: ");
		String senha = teclado.nextLine();
		
		if(senha.equals(senhaPadrao)) 
			System.out.println("Acesso Liberado!");
		else
			System.out.println("Acesso Negado!");
	}
}
