package Projeto_Unidade_2;

import javax.swing.JOptionPane;


import Aula_09_Pilha_Sequencial.PilhaSequencial;
import Aula_10_Pilha_Encadeada.PilhaEncadeada;
import Aula_11_Fila_Sequencial.FilaSequencial;
import Aula_12_Fila_Encadeada.FilaEncadeada;


public class Principal {
	
	static PilhaSequencial pilhaSequencial = new PilhaSequencial();
	static PilhaEncadeada pilhaEncadeada = new PilhaEncadeada();
	static FilaSequencial filaSequencial;
	static FilaEncadeada filaEncadeada;
	
	public static void main(String[] args) {
		menuRun();
	}
	
	public static void menuRun() {
		String menu = menuPrincipal();
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opcao) {
			case 1: menuPrincipalPilhaSequencial(); break;
			case 2: menuPrincipalPilhaEncadeada(); break;
			case 3: menuPrincipalFilaSequencial(); break;
			case 4: menuPrincipalFilaEncadeada(); break;
			case 5: System.exit(0); break;
			default: JOptionPane.showMessageDialog(null, "Opção Inválida!"); 
					menuRun(); break;
		}
	}
	
	public static String menuPrincipal() {
		String menu = "ESCOLHA O TIPO DE ESTRUTURA DE DADOS";
		menu += "\n----------------------------------------------\n" +
				"1. PILHA SEQUENCIAL\n" +
				"2. PILHA ENCADEADA\n" +
				"3. FILA SEQUENCIAL\n" +
				"4. FILA ENCADEADA\n" +
				"5. SAIR";
		return menu;
	}
	
	public static void menuPrincipalPilhaSequencial() {
		
		String menu = menuPilhaSequencial();
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				
		switch (opcao) {
			case 1: String nome = JOptionPane.showInputDialog("Informe o nome da pessoa a inserir na fila");
					System.out.println(pilhaSequencial.push(nome));
					break;
			case 2: JOptionPane.showMessageDialog(null, pilhaSequencial.pop()); break;
			case 3: JOptionPane.showMessageDialog(null, pilhaSequencial.elementoTopo()); break;
			case 4: JOptionPane.showMessageDialog(null, pilhaSequencial.exibirElementos()); break;
			case 5: menuRun(); break;
			default: JOptionPane.showMessageDialog(null, "Opção Inválida!"); 
					 break;
		}
		
		menuPrincipalPilhaSequencial();
	}
	
	public static String menuPilhaSequencial() {
		String menu = "PILHA SEQUENCIAL";
		menu += "\n----------------------------------------------\n" +
				"1. INSERIR UM ELEMENTO NA PILHA\n" +
				"2. REMOVER UM ELEMENTO DA PILHA\n" +
				"3. TOPO\n" +
				"4. EXIBIR A PILHA\n" +
				"5. SAIR";
		return menu;
	}
	
	
	public static void menuPrincipalPilhaEncadeada() {
		
		
		String menu = menuPilhaEncadeada();
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opcao) {
			 
			case 1: String nome = JOptionPane.showInputDialog("Informe o nome da pessoa a inserir na fila");
					pilhaEncadeada.push(nome);
					break;
			case 2: String temp = pilhaEncadeada.pop();
					JOptionPane.showMessageDialog(null, temp); break;
			case 3: JOptionPane.showMessageDialog(null, pilhaEncadeada.getTopo()); break;
			case 4: JOptionPane.showMessageDialog(null, pilhaEncadeada.exibirElementos()); break;
			case 5: menuRun(); break;
			default: JOptionPane.showMessageDialog(null, "Opção Inválida!"); break;
		}
		
		menuPrincipalPilhaEncadeada();
	}
	
	public static String menuPilhaEncadeada() {
		String menu = "PILHA ENCADEADA";
		menu += "\n----------------------------------------------\n" +
				"1. INSERIR UM ELEMENTO NA PILHA\n" +
				"2. REMOVER UM ELEMENTO DA PILHA\n" +
				"3. TOPO\n" +
				"4. EXIBIR A PILHA\n" +
				"5. SAIR";
		return menu;
	}
	
	public static void menuPrincipalFilaSequencial() {
		String menu = menuFilaSequencial();
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opcao) {
			case 1: filaSequencial = new FilaSequencial(); break;
			case 2: String nome = JOptionPane.showInputDialog("Informe o nome da pessoa a inserir na fila");
					JOptionPane.showMessageDialog(null, filaSequencial.inserir(nome));
					break;
			case 3: JOptionPane.showMessageDialog(null, filaSequencial.remover()); break;
			case 4: JOptionPane.showMessageDialog(null, filaSequencial.exibirFila()); break;
			case 5: menuRun(); break;
			default: JOptionPane.showMessageDialog(null, "Opção Inválida!"); break;
		}
		
		menuPrincipalFilaSequencial();
	}
	
	public static String menuFilaSequencial() {
		String menu = "FILA SEQUENCIAL";
		menu += "\n----------------------------------------------\n" +
				"1. CRIAR UMA FILA SEQUENCIAL\n" +
				"2. INSERIR UM ELEMENTO NA FILA\n" +
				"3. REMOVER UM ELEMENTO DA FILA\n" +
				"4. EXIBIR A FILA\n" +
				"5. SAIR";
		return menu;
	}
	
	
	public static void menuPrincipalFilaEncadeada() {
		String menu = menuFilaEncadeada();
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opcao) {
			case 1: filaEncadeada = new FilaEncadeada(); break;
			case 2: String nome = JOptionPane.showInputDialog("Informe o nome da pessoa a inserir na fila");
					JOptionPane.showMessageDialog(null, filaEncadeada.inserir(nome));
					break;
			case 3: JOptionPane.showMessageDialog(null, filaEncadeada.remover()); break;
			case 4: JOptionPane.showMessageDialog(null, filaEncadeada.exibirFila()); break;
			case 5: menuRun(); break;
			default: JOptionPane.showMessageDialog(null, "Opção Inválida!"); break;
		}
		
		menuPrincipalFilaEncadeada();
	}
	
	public static String menuFilaEncadeada() {
		String menu = "FILA ENCADEADA";
		menu += "\n----------------------------------------------\n" +
				"1. CRIAR UMA FILA ENCADEADA\n" +
				"2. INSERIR UM ELEMENTO NA FILA\n" +
				"3. REMOVER UM ELEMENTO DA FILA\n" +
				"4. EXIBIR A FILA\n" +
				"5. SAIR";
		return menu;
	}
}
