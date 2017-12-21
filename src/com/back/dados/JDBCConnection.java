package com.back.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.back.excecoes.BackException;


public class JDBCConnection {
	
	public static Connection getConnnection() throws BackException {

		String url = "jdbc:mysql://localhost:3306/banco";
		// String diverManeger

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String user = "root";
			String pass = "fafa6969";
			con = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;

	}

	public static void main(String[] args) {
		try {
			Connection con = JDBCConnection.getConnnection();
			if (con == null) {
				System.out.println(("Falha na conexao!"));
			} else {
				System.out.println("Conexao sucesso");
			}
		} catch (BackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
