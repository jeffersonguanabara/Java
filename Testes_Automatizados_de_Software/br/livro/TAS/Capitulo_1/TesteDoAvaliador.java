package br.livro.TAS.Capitulo_1;

public class TesteDoAvaliador {

	public static void main(String[] args) {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("Playstation 3 Novo");
		
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(jose, 400.0));
		leilao.propoe(new Lance(maria, 250.0));
		
		Avaliador leiloeiro = new Avaliador();
		
		leiloeiro.avalia(leilao);
		
		//imprime o maior valor proposto no leilão
		System.out.println(leiloeiro.getMaiorLance());
	}
}
