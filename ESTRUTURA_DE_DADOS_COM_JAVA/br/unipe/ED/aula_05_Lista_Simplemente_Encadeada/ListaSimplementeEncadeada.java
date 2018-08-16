package br.unipe.ED.aula_05_Lista_Simplemente_Encadeada;

public class ListaSimplementeEncadeada {
	Aluno primeiro = null;
	Aluno ultimo = null;
	int total = 0;

	public boolean isVazia() {
		if (total == 0) {
			return true;
		}
		return false;
	}

	public void inserirAlunoNoInicio(Aluno a) {
		if (isVazia()) {
			primeiro = ultimo = a;
		} else {
			a.proximo = primeiro;
			primeiro = a;
		}
		total++;
	}

	public void inserirAlunoNoFim(Aluno a) {
		if (isVazia()) {
			primeiro = ultimo = a;
		} else {
			ultimo.proximo = a;
			ultimo = a;
		}
		total++;
	}

	public void exibirLista() {
		Aluno temp = primeiro;
		if (isVazia() == false) {
			for (int i = 0; i < total; i++) {
				System.out.println("Aluno " + i + " | Nome: " + temp.getNome() + " | Idade: " + temp.getIdade());
				temp = temp.proximo;
			}
		}
	}

	public int tamanho() {
		return total;
	}

	public void removerAluno(Aluno a) {
		Aluno temp = primeiro;
		Aluno aux = null;
		if (total == 0) {
			System.out.println("Lista está vazia!");
			return;
		}
		if (total == 1) {
			primeiro = null;
			return;
		}
		for (int i = 0; i < total; i++) {
			if (a.getNome().equals(temp.getNome())) {
				aux.proximo = temp.proximo;
				total--;
				return;
			} else {
				System.out.println("Tô andando");
				aux = temp;
				temp = temp.proximo;
			}
		}
	}
}
