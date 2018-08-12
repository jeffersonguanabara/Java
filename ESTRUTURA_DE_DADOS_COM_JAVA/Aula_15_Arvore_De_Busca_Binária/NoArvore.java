package Aula_15_Arvore_De_Busca_Binária;

public class NoArvore {

	int valor;
	NoArvore direita;
	NoArvore esqueda;

	public NoArvore insere(NoArvore arvore, int valorInserido) {
		//caso a árvore não tenha filhos, ou seja, nula
		if (arvore == null) {
			arvore = new NoArvore();
			arvore.valor = valorInserido;
			arvore.esqueda = arvore.direita = null;
		}
		//inserir na árvore esqueda
		else if (valorInserido < arvore.valor)
			arvore.esqueda = insere(arvore.esqueda, valorInserido);
		//inserir na árvore direita
		else 
			arvore.direita = insere(arvore.direita, valorInserido);
		
		//Caso a árvore seja nula, o retorno do método é o nó que foi inserido.
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
		if(arvore != null) {
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
			//1 - Se o nó não tem filhos, ele será eliminado...
			if ((arvore.esqueda == null) && (arvore.direita == null))
				arvore = null;	
			//2 - Se o nó tem filho apenas a direita...
			else if (arvore.esqueda == null) { 
				NoArvore auxiliar = arvore;
				arvore = arvore.direita;
			}
			//3 - Se o nó tem filho apenas a esqueda...
			else if (arvore.direita == null) {
				NoArvore auxiliar = arvore;
				arvore = arvore.esqueda;
			}
			//4 - Se o nó tem os dois filhos...
			else {
				NoArvore subesqueda = arvore.esqueda;
				while (subesqueda.direita != null) {
					//capturar o maior nó da subárvore esquerda
					subesqueda = subesqueda.direita;
				}
				//subesquerda.valor é o maior no da subárvore esquerda
				arvore.valor = subesqueda.valor; //troca as informações
				subesqueda.valor = valorRemovido;
				arvore.esqueda = remorer(arvore.esqueda, valorRemovido);
			}
		}
		return arvore;
	}
	
}
