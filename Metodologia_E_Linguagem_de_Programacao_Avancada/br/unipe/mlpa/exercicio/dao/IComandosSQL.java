package br.unipe.mlpa.exercicio.dao;

public interface IComandosSQL {

	public String createDatabase();
	
	public String createTable();
	
	public String insertTable();
	
	public String removeOfTable();
	
	public String listOfTable();
	
	public String updateTable();
	
	public String getOfTableName();
	
	public String getOfTableRG();
}
