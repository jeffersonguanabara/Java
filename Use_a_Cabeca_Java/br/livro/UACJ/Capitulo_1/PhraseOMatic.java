package br.livro.UACJ.Capitulo_1;

public class PhraseOMatic {
	public static void main(String[] args) {
		String[] wordListOne = { "24/7", "várias camadas", "30.000 pães", "B-to-B", "todos ganham", "front-end",
				"baseado na web", "difundido", "inteligente", "seis sigma", "caminho crítico", "dinâmico" };

		String[] wordListTwo = { "habilitado", "adesivo", "valor agregado", "orientado", "central", "distribuído",
				"agrupado", "solidificado", "independente de máquina", "posicionado", "em rede", "dedicado",
				"alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado" };

		String[] wordListTree = { "processo", "ponto máximo", "solução", "arquitetura", "habilitação no núcleo",
				"estratégia", "mindshare", "portal", "espaço", "visão", "paradigma", "missão" };

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int treeLength = wordListTree.length;

		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * treeLength);

		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListTree[rand3];

		System.out.println("Precisamos de " + phrase);
	}
}
