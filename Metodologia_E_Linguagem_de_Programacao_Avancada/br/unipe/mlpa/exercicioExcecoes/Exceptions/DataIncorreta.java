package br.unipe.mlpa.exercicioExcecoes.Exceptions;

import java.text.ParseException;

/*
 * Alunos: Aline Myrtes
 * 		   Jefferson Guanabara
 */

public class DataIncorreta extends ParseException {

	public DataIncorreta(String mensagem) {
		super(mensagem, 0);
	}
}
