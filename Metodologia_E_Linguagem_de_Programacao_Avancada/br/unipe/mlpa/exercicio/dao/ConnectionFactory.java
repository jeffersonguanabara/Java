package br.unipe.mlpa.exercicio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	static String status;

	public Connection getConnection() {
		
		Connection conn = null;
		
		try {
			
			
			String url = "jdbc:mysql://localhost:3306/exerciciodao";
			
			conn = DriverManager.getConnection(url, "root", "#@80821062JG");
			
			status = "Conexão aberta!";
		} catch (SQLException e) {
			status = e.getMessage();
		} 
		return conn;
	}
}
