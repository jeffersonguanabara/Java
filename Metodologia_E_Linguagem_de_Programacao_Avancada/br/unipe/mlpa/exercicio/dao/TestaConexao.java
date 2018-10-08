package br.unipe.mlpa.exercicio.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) {
				
		try (Connection conn = new ConnectionFactory().getConnection()){
			System.out.println(ConnectionFactory.status);
			
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
