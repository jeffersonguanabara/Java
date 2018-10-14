package br.unipe.mlpa.exercicio.dao;

import java.util.ArrayList;

public interface IPessoaDAO {
	
	public void adicionar(PessoaDAO Pessoa);
	
	public void remover(PessoaDAO pessoa);
	
	public ArrayList<PessoaDAO> listar();
	
	public void alterar(PessoaDAO pessoa);
	
	public ArrayList<PessoaDAO> buscarPorNome(String nome);
	
	public ArrayList<PessoaDAO> buscarPorRG(String RG);

}
