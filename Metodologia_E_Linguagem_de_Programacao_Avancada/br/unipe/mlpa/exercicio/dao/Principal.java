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
			
			PessoaDAO p1 = new PessoaDAO();
			
			p1.setNome("Paulo");
			p1.setCpf("22222222222");
			p1.setRg("654321");
			p1.setIdade("18");
			
			p1.adicionar(p1);
			
			System.out.println(p1.listar());
			
			System.out.println(p1.buscarPorNome("ulo"));
			System.out.println(p1.buscarPorRG("43"));
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
