package com.back.dados;

import java.sql.SQLException;

import com.back.excecoes.BackException;
import com.back.modelo.Arquivo;

public interface UsuarioDAO {
	
	public void cadastrarArquivo(Arquivo arquivo) throws BackException;
	
	public Arquivo procurarArquivo(int numero) throws BackException, SQLException;
	
	public int LerArquivo(int numero) throws BackException;
	
}
