package br.unipe.ED.aula_05_Lista_Simplemente_Encadeada;

public class Principal {

	public static void main(String[] args) {
		ListaSimplementeEncadeada listaSimplementeEncadeada = new ListaSimplementeEncadeada();

		Aluno a1 = new Aluno();
		a1.setNome("Jefferson");
		a1.setIdade(30);

		Aluno a2 = new Aluno();
		a2.setNome("Guanabara");
		a2.setIdade(65);

		Aluno a3 = new Aluno();
		a3.setNome("Azevedo");
		a3.setIdade(56);

		Aluno a4 = new Aluno();
		a4.setNome("Lemos");
		a4.setIdade(35);

		listaSimplementeEncadeada.inserirAlunoNoInicio(a1);
		listaSimplementeEncadeada.inserirAlunoNoInicio(a2);
		listaSimplementeEncadeada.inserirAlunoNoInicio(a3);
		listaSimplementeEncadeada.inserirAlunoNoFim(a4);
		listaSimplementeEncadeada.exibirLista();

		listaSimplementeEncadeada.removerAluno(a2);

		listaSimplementeEncadeada.exibirLista();

		System.out.println("A lista tem " + listaSimplementeEncadeada.tamanho() + " elementos!");
	}

}
