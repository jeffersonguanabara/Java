package br.unipe.ED.aula_12_Fila_Encadeada;

public class FilaEncadeada {

	No inicio;
	No fim;
	int tamanho = 0;

	public boolean isVazia() {
		return (tamanho == 0);
	}

	public String inserir(String dado) {
		No novo = new No();
		novo.dado = dado;

		if (isVazia()) {
			inicio = novo;
			fim = novo;
		} else {
			fim.proximo = novo;
			fim = novo;
		}
		tamanho++;
		return "Inseriu!";
	}

	public String remover() {
		if (isVazia())
			return null;

		String valor = inicio.dado;

		if (tamanho == 1) {
			inicio = null;
			fim = null;
			tamanho = 0;
		} else {
			inicio = inicio.proximo;
			tamanho--;
		}
		return valor + " removido!";
	}

	public String exibirFila() {
		No aux = inicio;
		String s = "";
		if (isVazia()) {
			// System.out.println("Fila Vazia");
			s = "\nFila Vazia!";
			return s;
		}
		System.out.println("\nExibindo Fila Encadeada");
		for (int i = 0; i < tamanho; i++) {
			// System.out.println("Elemento " + (i + 1) + ": " + aux.dado);
			s += "Elemento " + (i + 1) + ": " + aux.dado + " | ";
			aux = aux.proximo;
		}
		return s;
	}

	public void esvaziarFila() {
		tamanho = 0;
		inicio = null;
		fim = null;
	}
}
