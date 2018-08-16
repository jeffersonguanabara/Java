package br.unipe.ED.aula_09_Pilha_Sequencial;

public class PilhaSequencial {

	// vetor que armazena os elementos da Pilha
	String[] nomes = new String[10];
	// variavel que controla o topo da Pilha
	int topo = -1;

	public boolean isVazia() {
		return (topo == -1);
	}

	public boolean isCheia() {
		return (topo == nomes.length - 1);
	}

	public int quantidadeElementos() {
		return (topo + 1);
	}

	public String elementoTopo() {
		if (isVazia())
			return null;
		else
			return nomes[topo];
	}

	public boolean push(String valor) {
		if (isCheia()) {
			return false;
		} else {
			topo++;
			nomes[topo] = valor;
			return true;
		}
	}

	public String pop() {
		if (isVazia()) {
			return null;
		} else {
			String valor = nomes[topo];
			nomes[topo] = null;
			topo--;
			return valor + " removido!";
		}
	}

	public String exibirElementos() {
		String s = "";
		for (int i = topo; i >= 0; i--) {
			// System.out.println("Elemento " + i + ": " + nomes[i]);
			s += "Elemento " + i + ": " + nomes[i] + "\n";
		}
		return s;
	}

}
