package com.back.negocio;

import com.back.excecoes.BackException;
import com.back.modelo.Usuario;

public interface AdministradorBO {
	
	void cadastrarUsuario (Usuario usuario) throws BackException;
	
	void atualizarUsuario (Usuario usuario) throws BackException;
	
	void removerUsuario (String cpf) throws BackException;
	
	Usuario procurarUsuario (String cpf) throws BackException;
	
	void removerArquivo (int numero) throws BackException;
	
}
