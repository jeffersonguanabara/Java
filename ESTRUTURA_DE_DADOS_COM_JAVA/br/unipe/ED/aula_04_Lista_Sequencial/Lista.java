package br.unipe.ED.aula_04_Lista_Sequencial;

public class Lista {
	Contato[] contatos = new Contato[100];
	int n = 0;

	public boolean isVazia() {
		return (n == 0);
	}

	public boolean isCheia() {
		return (n == contatos.length);
	}

	public int tamanho() {
		return n;
	}

	public Contato buscarElementoPosicaoI(int posicao) {
		if ((posicao >= n) || (posicao < 0))
			return null;

		return contatos[posicao];
	}

	public boolean compara(Contato contato_1, Contato contato_2) {
		return (contato_1.getNome().equals(contato_2.getNome()))
				&& (contato_1.getTelefone().equals(contato_2.getTelefone()));
	}

	public int getPosicao(Contato contato) {
		// for(Contato c: contatos){
		for (int i = 0; i < n; i++)
			if (compara(contatos[i], contato))
				return i;

		return -1;
	}

	public void deslocaDireita(int posicao) {
		for (int i = n; i > posicao; i--)
			contatos[i] = contatos[i - 1];
	}

	public boolean inserirEmUmaDeterminadaPosicao(int posicao, Contato contato) {
		if (isCheia() || (posicao > n) || posicao < 0)
			return false;

		deslocaDireita(posicao);
		contatos[posicao] = contato;
		n++;
		return true;
	}

	public void deslocaEsquerda(int posicao) {
		for (int i = posicao; i < n - 1; i++)
			contatos[i] = contatos[i + 1];
	}

	public boolean removerUmDetermindadoElementoNaPosicao(int posicao) {
		if (posicao > n || posicao < 0)
			return false;

		deslocaEsquerda(posicao);
		n--;
		return true;
	}

	public String exibirLista() {
		// for(Contato c: contatos){ ou for(int i = 0; i < contatos.length; i++){
		String s = "";
		for (int i = 0; i < n; i++) {

			s += "Contato " + (i + 1) + "\nNome: " + contatos[i].getNome() + "\nTelefone: " + contatos[i].getTelefone()
					+ "\n";
		}
		return s;
	}
}
