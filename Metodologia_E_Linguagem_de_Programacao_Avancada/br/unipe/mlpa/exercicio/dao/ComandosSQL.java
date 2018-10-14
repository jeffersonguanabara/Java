package br.unipe.mlpa.exercicio.dao;

public class ComandosSQL implements IComandosSQL{

	@Override
	public String createDatabase() {
		return "create database exerciciodao;";
	}

	@Override
	public String createTable() {
		String sql = "";
		sql += "create table tbl_pessoa ("
				+ "id_pessoa int not null auto-increment,"
				+ "nome varchar(60) not null,"
				+ "cpf varchar(11) not null unique,"
				+ "rg varchar(15) not null,"
				+ "idade varchar(3) not null)";
				
		return sql;
	}

	@Override
	public String insertTable() {
		return "insert into pessoa (nome, cpf, rg, idade) values (?,?,?,?)";
	}

	@Override
	public String removeOfTable() {
		return "delete from pessoa where cpf = ?";
	}

	@Override
	public String listOfTable() {
		return "select * from pessoa";
	}

	@Override
	public String updateTable() {
		return "update Pessoa set nome = ?, cpf = ?, rg = ?, idade = ? where cpf = ?";
	}

	@Override
	public String getOfTableName() {
		return "select * from pessoa where nome = ?";
	}

	@Override
	public String getOfTableRG() {
		return "select * from pessoa where rg = ?";
	}

}
