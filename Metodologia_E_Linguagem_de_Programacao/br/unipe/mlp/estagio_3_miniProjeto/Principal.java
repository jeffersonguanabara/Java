package br.unipe.mlp.estagio_3_miniProjeto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class Principal {
	
	private static String nomeArquivo;
	private static FileWriter arquivo;
	private static PrintWriter file;
	
	public static void main(String[] args) throws IOException {
		
		Scanner teclado = new Scanner(System.in);
		menu();
		nomeArquivo = teclado.nextLine() + ".txt";
		arquivo = new FileWriter(nomeArquivo);
		escritor(nomeArquivo);
		
		try {
			int opcao = 0;
			do {
				menu_2();
				opcao = teclado.nextInt();
				switch (opcao) {
				case 1: escritor(nomeArquivo);
						break;
				case 2: leitor(nomeArquivo);
						break;
				case 3: 
						file.close();
						arquivo.close();
						break;
				default:
					break;
				}
			} while (opcao != 3);
		} catch (Exception e) {
			System.out.println("Erro na execução, tente novamente!");
		} finally {
			System.out.println("Obrigado!");
			
		}
		
			
	}
	
	 private static void leitor(String path) throws IOException {
	        try {
				FileInputStream arq = new FileInputStream(path);
				InputStreamReader input = new InputStreamReader(arq);
				BufferedReader br = new BufferedReader(input);
			
				String linha;
				do {
					linha = br.readLine();
					if (linha != null) System.out.println(linha);
				
				}while(linha!=null);
			}catch(Exception f){
				System.out.println("Erro ao ler, provavelmente o arquivo não existe");
			}
	}
	
	private static void menu_2() {
		System.out.println("MENU" +
	"\n" + "---------------------------"
				+ "\n" + "Opções:" +
	"\n" + "Opção 1 - Deseja inserir outro nome?"
				+ "\n" + "Opção 2 - Exibir o conteúdo do arquivo?"
	+ "\n" + "Opção 3 - Sair?" + 
				"\n" + "-------------------------------------");
		
	}

	private static void escritor(String arquivo) throws IOException {
		try{
			Scanner entrada = new Scanner(System.in);
			FileOutputStream arq = new FileOutputStream(arquivo);
			PrintWriter pr = new PrintWriter(arq);
			System.out.println("O que desejas escrever no arquivo?");
			String escreverdentro = entrada.nextLine();
			pr.println(escreverdentro+"\n");
		} catch (Exception e) {
			System.out.println("Erro na escrita do arquivo!");
		}
		
    }
	
	
	private static void menu() {
		System.out.println("Qual nome você deseja dar ao arquivo?"); 
	}
}

