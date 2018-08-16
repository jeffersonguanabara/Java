package br.livro.UACJ.Capitulo_1;

public class PhraseOMatic {
	public static void main(String[] args) {
		String[] wordListOne = { "24/7", "v�rias camadas", "30.000 p�es", "B-to-B", "todos ganham", "front-end",
				"baseado na web", "difundido", "inteligente", "seis sigma", "caminho cr�tico", "din�mico" };

		String[] wordListTwo = { "habilitado", "adesivo", "valor agregado", "orientado", "central", "distribu�do",
				"agrupado", "solidificado", "independente de m�quina", "posicionado", "em rede", "dedicado",
				"alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado" };

		String[] wordListTree = { "processo", "ponto m�ximo", "solu��o", "arquitetura", "habilita��o no n�cleo",
				"estrat�gia", "mindshare", "portal", "espa�o", "vis�o", "paradigma", "miss�o" };

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
