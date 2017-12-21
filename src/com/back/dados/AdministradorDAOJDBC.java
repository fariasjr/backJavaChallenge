package com.back.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.back.excecoes.BackException;
import com.back.modelo.Usuario;

public class AdministradorDAOJDBC implements AdministradorDAO {

	@Override
	public void cadastrarUsuario(Usuario usuario) throws BackException {
		Connection con = null;
		try {
			con = JDBCConnection.getConnnection();

			String sqlCadastrarUsuario = "insert into usuario(cpf, nome, login, senha) values (?, ?, ?, ?)";

			PreparedStatement pstm = con.prepareStatement(sqlCadastrarUsuario);

			pstm.setString(1, usuario.getCpf());
			pstm.setString(2, usuario.getNome());
			pstm.setString(3, usuario.getLogin());
			pstm.setString(4, usuario.getSenha());

			pstm.executeUpdate();

			String sqlCadastrarFormato = "insert into formato(cpf, txt, pdf, doc, docx, jpg, tif) values (?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement pstmF = con.prepareStatement(sqlCadastrarFormato);

			pstmF.setString(1, usuario.getCpf());
			pstmF.setBoolean(2, usuario.getFormato().isTxt());
			pstmF.setBoolean(3, usuario.getFormato().isPdf());
			pstmF.setBoolean(4, usuario.getFormato().isDoc());
			pstmF.setBoolean(5, usuario.getFormato().isDocx());
			pstmF.setBoolean(6, usuario.getFormato().isJpg());
			pstmF.setBoolean(7, usuario.getFormato().isTif());

			pstmF.executeUpdate();

			String sqlCadastrarEnvio = "insert into envio(cpf, app, web, des) values (?, ?, ?, ?)";

			PreparedStatement pstmE = con.prepareStatement(sqlCadastrarEnvio);

			pstmE.setString(1, usuario.getCpf());
			pstmE.setBoolean(2, usuario.getEnvio().isApp());
			pstmE.setBoolean(3, usuario.getEnvio().isWeb());
			pstmE.setBoolean(4, usuario.getEnvio().isDes());

			pstmE.executeUpdate();

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
	public void atualizarUsuario(Usuario usuario) throws BackException {
		Connection con = null;
		try {
			con = JDBCConnection.getConnnection();

			String sqlAtualizarUsuario = "update usuario set nome = ?, login = ?, senha = ? where cpf = ?";

			PreparedStatement pstm = con.prepareStatement(sqlAtualizarUsuario);

			pstm.setString(1, usuario.getNome());
			pstm.setString(2, usuario.getLogin());
			pstm.setString(3, usuario.getSenha());
			pstm.setString(4, usuario.getCpf());

			pstm.executeUpdate();

			String sqlAtualizarFormato = "update formato set txt = ?, pdf = ?, doc = ?, docx = ?, jpg = ?, tif = ? where cpf = ?";

			PreparedStatement pstmF = con.prepareStatement(sqlAtualizarFormato);

			pstmF.setBoolean(1, usuario.getFormato().isTxt());
			pstmF.setBoolean(2, usuario.getFormato().isPdf());
			pstmF.setBoolean(3, usuario.getFormato().isDoc());
			pstmF.setBoolean(4, usuario.getFormato().isDocx());
			pstmF.setBoolean(5, usuario.getFormato().isJpg());
			pstmF.setBoolean(6, usuario.getFormato().isTif());
			pstmF.setString(7, usuario.getCpf());

			pstmF.executeUpdate();

			String sqlAtualizarEnvio = "update envio set app = ?, web = ?, des = ? where cpf = ?";

			PreparedStatement pstmE = con.prepareStatement(sqlAtualizarEnvio);

			pstmE.setBoolean(1, usuario.getEnvio().isApp());
			pstmE.setBoolean(2, usuario.getEnvio().isWeb());
			pstmE.setBoolean(3, usuario.getEnvio().isDes());
			pstmE.setString(4, usuario.getCpf());

			pstmE.executeUpdate();

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
	public void removerUsuario(String cpf) throws BackException {
		Connection con = null;
		try {
			con = JDBCConnection.getConnnection();

			String sqlRemoverUsuario = "delete from usuario where cpf = ?";

			PreparedStatement pstm = con.prepareStatement(sqlRemoverUsuario);

			pstm.setString(1, cpf);

			pstm.executeUpdate();

			String sqlRemoverFormato = "delete from formato where cpf = ?";

			PreparedStatement pstmF = con.prepareStatement(sqlRemoverFormato);

			pstmF.setString(1, cpf);

			pstmF.executeUpdate();

			String sqlRemoverEnvio = "delete from envio where cpf = ?";

			PreparedStatement pstmE = con.prepareStatement(sqlRemoverEnvio);

			pstmE.setString(1, cpf);

			pstmE.executeUpdate();

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
	public Usuario procurarUsuario(String cpf) throws BackException {
		Connection con = null;
		try {
			con = JDBCConnection.getConnnection();

			String sqlProcurarUsuario = "select cpf, nome, login, tipouser from arquivos";

			PreparedStatement stmt = con.prepareStatement(sqlProcurarUsuario);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Usuario userRs = new Usuario(rs.getString("cpf"), rs.getString("nome"), rs.getString("login"),
						rs.getString("tipouser"));

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
	public void removerArquivo(int numero) throws BackException {
		Connection con = null;
		try {
			con = JDBCConnection.getConnnection();

			String sqlRemoverArquivo = "delete from arquivos where numero = ?";

			PreparedStatement pstm = con.prepareStatement(sqlRemoverArquivo);

			pstm.setInt(1, numero);

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

}
