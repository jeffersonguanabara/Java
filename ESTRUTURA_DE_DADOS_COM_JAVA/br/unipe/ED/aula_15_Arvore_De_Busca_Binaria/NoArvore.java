package br.unipe.ED.aula_15_Arvore_De_Busca_Binaria;

public class NoArvore {

	int valor;
	NoArvore direita;
	NoArvore esqueda;

	public NoArvore insere(NoArvore arvore, int valorInserido) {
		// caso a árvore não tenha filhos, ou seja, nula
		if (arvore == null) {
			arvore = new NoArvore();
			arvore.valor = valorInserido;
			arvore.esqueda = arvore.direita = null;
		}
		// inserir na árvore esqueda
		else if (valorInserido < arvore.valor)
			arvore.esqueda = insere(arvore.esqueda, valorInserido);
		// inserir na árvore direita
		else
			arvore.direita = insere(arvore.direita, valorInserido);

		// Caso a árvore seja nula, o retorno do método � o n� que foi inserido.
		return arvore;
	}

	public NoArvore busca(NoArvore raiz, int valorProcurado) {
		if (raiz == null)
			return null;
		else if (raiz.valor < valorProcurado)
			return busca(raiz.direita, valorProcurado);
		else if (raiz.valor > valorProcurado)
			return busca(raiz.esqueda, valorProcurado);
		else
			return raiz;
	}

	public void imprime(NoArvore arvore) {
		if (arvore != null) {
			// em-ordem (esquerda, raiz, direita)
			imprime(arvore.esqueda);
			System.out.println(arvore.valor);
			imprime(arvore.direita);
		}
	}

	public NoArvore remorer(NoArvore arvore, int valorRemovido) {
		if (arvore == null)
			return null;
		else if (arvore.valor > valorRemovido)
			arvore.esqueda = remorer(arvore.esqueda, valorRemovido);
		else if (arvore.valor < valorRemovido)
			arvore.direita = remorer(arvore.direita, valorRemovido);
		else {
			// 1 - Se o n� n�o tem filhos, ele ser� eliminado...
			if ((arvore.esqueda == null) && (arvore.direita == null))
				arvore = null;
			// 2 - Se o n� tem filho apenas a direita...
			else if (arvore.esqueda == null) {
				NoArvore auxiliar = arvore;
				arvore = arvore.direita;
			}
			// 3 - Se o n� tem filho apenas a esqueda...
			else if (arvore.direita == null) {
				NoArvore auxiliar = arvore;
				arvore = arvore.esqueda;
			}
			// 4 - Se o n� tem os dois filhos...
			else {
				NoArvore subesqueda = arvore.esqueda;
				while (subesqueda.direita != null) {
					// capturar o maior n� da sub�rvore esquerda
					subesqueda = subesqueda.direita;
				}
				// subesquerda.valor � o maior no da sub�rvore esquerda
				arvore.valor = subesqueda.valor; // troca as informa��es
				subesqueda.valor = valorRemovido;
				arvore.esqueda = remorer(arvore.esqueda, valorRemovido);
			}
		}
		return arvore;
	}

}
