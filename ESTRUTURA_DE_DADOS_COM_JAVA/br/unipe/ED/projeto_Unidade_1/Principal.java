package br.unipe.ED.projeto_Unidade_1;

import java.util.Scanner;

import br.unipe.ED.aula_04_Lista_Sequencial.*;
import br.unipe.ED.aula_05_Lista_Simplemente_Encadeada.*;

public class Principal {

	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);
		Lista listaSequencial = null;
		ListaSimplementeEncadeada listaSimplementeEncadeada = null;

		int opcao = 0;
		do {
			try {
				System.out.println(
						"Informe qual lista você quer usar: \n(1) Lista Sequencial\n(2) Lista Simplesmente Encadeada\n(0) Sair");
				opcao = teclado.nextInt();

				switch (opcao) {
				case 1:
					int op = 0;
					do {
						System.out.println(
								"Informe a operação:\n(1) Criar Lista\n(2) Inserir Elemento\n(3) Remover Elemento\n(4) Exibir Lista\n(5) Retornar ao menu anterior");
						op = teclado.nextInt();
						switch (op) {

						case 1:
							listaSequencial = new Lista();
							break;
						case 2:
							try {
								Contato contato = new Contato();
								System.out.println("Informe a posição qual que o elemento será inserido: ");
								int posicao = teclado.nextInt();
								System.out.println("Informe o nome do Contato: ");
								contato.setNome(teclado.next());
								System.out.println("Informe o telefone do Contato: ");
								contato.setTelefone(teclado.next());
								listaSequencial.inserirEmUmaDeterminadaPosicao(posicao, contato);
							} catch (Exception e) {
								System.out.println("Ainda não foi criada nenhuma lista!");
							}
							break;
						case 3:
							try {
								System.out.println("Informe a posição do elemento ao qual deseja remover");
								int posicao = teclado.nextInt();
								if (listaSequencial.removerUmDetermindadoElementoNaPosicao(posicao))
									System.out.println("Contato Removido!");
								else
									System.out.println("Contato não encontrado ou não existe!");
							} catch (Exception e) {
								System.out.println("Não existe uma lista ou não existe elemento na posição informada!");
							}
							break;
						case 4:
							try {
								System.out.println(listaSequencial.exibirLista());
							} catch (Exception e) {
								System.out.println("Não existe lista ou não existe nenhum elemento na lista");
							}
							break;
						case 5:
							break;
						default:
							System.out.println("Tente Novamente!");
							break;
						}

					} while (op != 5);
					break;

				case 2:
					int opc = 0;
					do {
						Aluno aluno = new Aluno();
						System.out.println(
								"Informe a operação:\n(1) Criar Lista\n(2) Inserir Elemento\n(3) Remover Elemento\n(4) Exibir Lista\n(5) Retornar ao menu anterior");
						opc = teclado.nextInt();
						switch (opc) {

						case 1:
							listaSimplementeEncadeada = new ListaSimplementeEncadeada();
							break;
						case 2:
							try {
								System.out.println("Informe o nome do aluno: ");
								aluno.setNome(teclado.next());
								System.out.println("Informe o idade do aluno: ");
								aluno.setIdade(teclado.nextInt());

								int opca;
								do {
									System.out.println("Para inserir no \n(1) No início\n(2) No Fim");
									opca = teclado.nextInt();
									switch (opca) {
									case 1:
										listaSimplementeEncadeada.inserirAlunoNoInicio(aluno);
										break;
									case 2:
										listaSimplementeEncadeada.inserirAlunoNoFim(aluno);
										break;
									default:
										System.out.println("Opção Errada, tente novamente!");
										break;
									}
									break;
								} while ((opca >= 1) && (opca <= 2));
							} catch (Exception e) {
								System.out.println("Ainda não foi criada nenhuma lista!");
							}
							break;
						case 3:
							try {
								System.out.println("Informe o nome do aluno");
								aluno.setNome(teclado.next());
								// teclado.nextLine();
								listaSimplementeEncadeada.removerAluno(aluno);
							} catch (Exception e) {
								System.out.println("Não existe uma lista ou não existe elemento na posição informada!");
							}
							break;
						case 4:
							try {
								listaSimplementeEncadeada.exibirLista();
							} catch (Exception e) {
								System.out.println("Não existe lista ou não existe nenhum elemento na lista");
							}
							break;
						case 5:
							break;
						default:
							System.out.println("Tente Novamente!");
							break;
						}

					} while (opc != 5);
					break;

				default:
					if (opcao != 0)
						System.out.println("Opção Inválida! Tente Novamente!\n");
					else
						System.out.println("Fim do Programa!");
					break;
				}
			} catch (Exception e) {
				System.out.println("Operação invalida!");
			}
		} while (opcao != 0);

	}

}
