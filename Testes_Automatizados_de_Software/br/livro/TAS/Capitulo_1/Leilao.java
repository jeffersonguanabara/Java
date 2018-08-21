package br.livro.TAS.Capitulo_1;

import java.util.LinkedList;
import java.util.List;

public class Leilao {
	
	private String itemDoLeilao;
	private List<Lance> lances = new LinkedList<Lance>();
	
	public Leilao() {
		// TODO Auto-generated constructor stub
	}
	
	public Leilao (String itemDoLeilao) {
		super();
		this.itemDoLeilao = itemDoLeilao;
	}

	public String getItemDoLeilao() {
		return itemDoLeilao;
	}

	public List<Lance> getLances() {
		return this.lances;
	}

	public void propoe(Lance lance) {
		// TODO Auto-generated method stub
		lances.add(lance);
	}
}
