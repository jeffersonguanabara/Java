package br.unipe.mlpa.exercicio.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {
				
		try (Connection conn = new ConnectionFactory().getConnection()){
			System.out.println(ConnectionFactory.status);
			
			PessoaDAO pessoa = new PessoaDAO();
			
			pessoa.setNome("Jefferson");
			pessoa.setCpf("11111111111");
			pessoa.setRg("12345");
			pessoa.setIdade("21");
			
			//pessoa.adicionar(pessoa);
			
			//System.out.println(pessoa.listar());
			
			pessoa.setCpf("11111111111");
			
			//pessoa.remover(pessoa);
			
			System.out.println(pessoa.buscarPorNome("eff"));
			
			System.out.println(pessoa.buscarPorRG("23"));
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
