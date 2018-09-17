package br.unipe.mlpa.exercicioExcecoes.Utils;

import br.unipe.mlpa.exercicioExcecoes.Exceptions.IdadeException;

public class Pessoa {

	private String nome;
	private int idade;
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		try {
			if (idade < 0) throw new IdadeException("Idade informada menor que zero!");
			else this.idade = idade;
		} catch (IdadeException ie) {
			// TODO: handle exception
			System.out.println(ie.getMessage());
		}
		
	}
	
	
}
