package com.back.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.back.excecoes.BackException;
import com.back.modelo.Arquivo;

public class UsuarioDAOJDBC implements UsuarioDAO {

	@Override
	public void cadastrarArquivo(Arquivo arquivo) {
		Connection con = null;
		try {
			con = JDBCConnection.getConnnection();

			String sqlCadastrarArquivo = "insert into arquivo(numero, data, formato, lancar) values (?, ?, ?, ?)";

			PreparedStatement pstm = con.prepareStatement(sqlCadastrarArquivo);

			pstm.setInt(1, arquivo.getNumero());
			pstm.setString(2, arquivo.getData().toString());
			pstm.setString(3, arquivo.getFormato().name());
			pstm.setString(4, arquivo.getLancar().name());

			pstm.executeUpdate();

		} catch (BackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Arquivo procurarArquivo(int numero) {
		Connection con = null;
		try {
			con = JDBCConnection.getConnnection();

			String sqlProcurarArquivo = "select numero, data, formato, lancar from arquivos";

			PreparedStatement stmt = con.prepareStatement(sqlProcurarArquivo);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Arquivo arqRs = new Arquivo(rs.getInt("numero"), rs.getString("data"), rs.getString("formato"),
						rs.getString("lancar"));

			}

			rs.close();
			stmt.close();

		} catch (BackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public int LerArquivo(int numero) {
		// TODO Auto-generated method stub
		return 0;
	}

}
