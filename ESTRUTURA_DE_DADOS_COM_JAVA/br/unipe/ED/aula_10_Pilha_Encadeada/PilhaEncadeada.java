package br.unipe.ED.aula_10_Pilha_Encadeada;

public class PilhaEncadeada {
	Elemento topo;
	int n = 0;

	public boolean isVazia() {
		return (topo == null);
	}

	public int quantidadeElementos() {
		return n;
	}

	public String getTopo() {
		if (isVazia())
			return null;
		else {
			return topo.dado;
		}
	}

	public void push(String dado) {
		Elemento novo = new Elemento();
		novo.dado = dado;
		novo.proximo = topo;
		topo = novo;
		n++;
		System.out.println(novo);
	}

	public String pop() {
		if (isVazia())
			return null;
		String valor = topo.dado;
		topo = topo.proximo;
		n--;
		return valor + " removido!";
	}

	public String exibirElementos() {
		String s = "";
		Elemento auxiliar = topo;
		for (int i = n - 1; i >= 0; i--) {
			// System.out.println(auxiliar.dado);
			s += auxiliar.dado + "\n";
			auxiliar = auxiliar.proximo;
		}
		return s;
	}

	public String toString() {
		return "topo: " + this.topo;
	}
}
