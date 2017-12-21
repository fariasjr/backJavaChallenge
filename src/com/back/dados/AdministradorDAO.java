package com.back.dados;

import com.back.excecoes.BackException;
import com.back.modelo.Usuario;

public interface AdministradorDAO {

	public void cadastrarUsuario(Usuario usuario) throws BackException;

	public void atualizarUsuario(Usuario usuario) throws BackException;

	public void removerUsuario(String cpf) throws BackException;

	public Usuario procurarUsuario(String cpf) throws BackException;

	public void removerArquivo(int numero) throws BackException;
}
