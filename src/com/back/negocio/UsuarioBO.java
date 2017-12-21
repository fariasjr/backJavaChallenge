package com.back.negocio;

import java.sql.SQLException;

import com.back.excecoes.BackException;
import com.back.modelo.Arquivo;

public interface UsuarioBO {
	
	void cadastrarArquivo (Arquivo arquivo) throws BackException;
	
	Arquivo procurarArquivo(int numero) throws BackException, SQLException;
	
	int LerArquivo (int numero) throws BackException;
		
}
