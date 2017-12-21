package com.back.modelo;

public class Usuario {

	private String cpf;
	private String nome;
	private String login;
	private String senha;
	private Formato formato;
	private Envio envio;
	private TipoUser tipoUser;

	public Usuario(String cpf, String nome, String login, String senha, Formato formato, Envio envio,
			TipoUser tipoUser) {
		this.cpf = cpf;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.formato = formato;
		this.envio = envio;
		this.tipoUser = tipoUser;
	}

	public Usuario(String cpf, String nome, String login, String tipoUser) {
		this.cpf = cpf;
		this.nome = nome;
		this.login = login;
		this.tipoUser = TipoUser.valueOf(tipoUser);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public Envio getEnvio() {
		return envio;
	}

	public void setEnvio(Envio envio) {
		this.envio = envio;
	}

	public TipoUser getTipoUser() {
		return tipoUser;
	}

	public void setTipoUser(TipoUser tipoUser) {
		this.tipoUser = tipoUser;
	}

}
