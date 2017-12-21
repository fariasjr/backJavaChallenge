package com.back.negocio;

import java.sql.SQLException;

import com.back.dados.UsuarioDAO;
import com.back.excecoes.BackException;
import com.back.modelo.Arquivo;

public class UsuarioBOImp implements UsuarioBO{
	
	private UsuarioDAO bancoDados;

	public UsuarioBOImp(UsuarioDAO bancoDados) {
		this.bancoDados = bancoDados;
	}


	@Override
	public void cadastrarArquivo(Arquivo arquivo) throws BackException {
		if (arquivo == null) {
			throw new BackException("Objeto conta vazio"); 
		} else if (arquivo.getFormato() == null ){
			throw new BackException("Coloque o formato do arquivo");
		} else if (arquivo.getLancar() == null ){
			throw new BackException("Coloque de onde voce esta enviando o arquivo");
		} else if (arquivo.getNumero() == 0 ){
			throw new BackException("Coloque o numero do arquivo");
		} else {
			bancoDados.cadastrarArquivo(arquivo);
		}
		
	}

	@Override
	public Arquivo procurarArquivo(int numero) throws BackException, SQLException {
		if (numero == 0){
			throw new BackException("O numero do arquivo e invalido");
		} else {
			return bancoDados.procurarArquivo(numero);
		}
	}

	@Override
	public int LerArquivo(int numero) throws BackException {
		if (numero == 0){
			throw new BackException("O numero do arquivo e invalido");
		} else {
			return 0;
		}
	}

}
