package br.unipe.mlpa.exercicio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PessoaDAO implements IPessoaDAO {

	private int idPessoa;
	private String nome;
	private String cpf;
	private String rg;
	private String idade;
	
	public IComandosSQL comandos = new ComandosSQL();
	
	public PessoaDAO() {
		
	}
	
	public PessoaDAO(int idPessoa, String nome, String cpf, String rg, String idade) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "PessoaDAO [idPessoa=" + idPessoa + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", idade=" + idade
				+ "]";
	}

	@Override
	public void adicionar(PessoaDAO pessoa) {
		
		try (Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = conn.prepareStatement(comandos.insertTable());
			ps.setString(1, pessoa.getNome());
			ps.setString(2, pessoa.getCpf());
			ps.setString(3, pessoa.getRg());
			ps.setString(4, pessoa.getIdade());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 		
	}

	@Override
	public void remover(PessoaDAO pessoa) {
		try(Connection conn = new ConnectionFactory().getConnection()) {
			PreparedStatement ps = conn.prepareStatement(comandos.removeOfTable());
			ps.setString(1, pessoa.getCpf());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("Error ao deletar um produto do banco de dados");
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public ArrayList<PessoaDAO> listar() {
		ArrayList<PessoaDAO> lista = new ArrayList<PessoaDAO>();
		PreparedStatement ps;
		try (Connection conn = new ConnectionFactory().getConnection()) {
			ps = conn.prepareStatement(comandos.listOfTable());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				PessoaDAO pessoa = new PessoaDAO();
				pessoa.setNome(rs.getString("nome"));
				pessoa.setCpf(rs.getString("cpf"));
				pessoa.setRg(rs.getString("rg"));
				pessoa.setIdade(rs.getString("idade"));
				lista.add(pessoa);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return lista;
	}

	@Override
	public void alterar(PessoaDAO pessoa) {
		try(Connection conn = new ConnectionFactory().getConnection()) {
			PreparedStatement ps = conn.prepareStatement(comandos.updateTable());
			ps.setString(1,  pessoa.getNome());
			ps.setString(2, pessoa.getCpf());
			ps.setString(2,  pessoa.getRg());
			ps.setString(4, pessoa.getIdade());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("Error ao atualizar uma pessoa no banco de dados");
			System.out.println(e.getMessage());
		}
		
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	@Override
	public PessoaDAO buscarPorNome(String nome) {
		PessoaDAO pessoa = new PessoaDAO();
		try(Connection conn = new ConnectionFactory().getConnection()) {
			PreparedStatement ps = conn.prepareStatement(comandos.getOfTableName());
			ps.setString(1, nome);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				pessoa.setNome(rs.getString("nome"));
				pessoa.setCpf(rs.getString("cpf"));
				pessoa.setRg(rs.getString("rg"));
				pessoa.setIdade(rs.getString("idade"));
			}
			rs.close();
			ps.close();				
		} catch (SQLException e) {
			System.out.println("Error: pessoa não encontrada!");
			e.getMessage();
		}	
		return pessoa;
	}

	@Override
	public PessoaDAO buscarPorRG(String RG) {
		PessoaDAO pessoa = new PessoaDAO();
		try(Connection conn = new ConnectionFactory().getConnection()) {
			PreparedStatement ps = conn.prepareStatement(comandos.getOfTableRG());
			ps.setString(1, RG);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				pessoa.setNome(rs.getString("nome"));
				pessoa.setCpf(rs.getString("cpf"));
				pessoa.setRg(rs.getString("rg"));
				pessoa.setIdade(rs.getString("idade"));
			}
			rs.close();
			ps.close();				
		} catch (SQLException e) {
			System.out.println("Error: pessoa não encontrada!");
			e.getMessage();
		}	
		return pessoa;
	}

}
