package com.back.modelo;

public class Arquivo {

	private int numero;
	private String data;
	
	private TipoFormato formato;
	private TipoLancar lancar;

	public Arquivo(int numero, String data, TipoFormato formato, TipoLancar lancar) {
		this.numero = numero;
		this.data = data;
		this.formato = formato;
		this.lancar = lancar;
	}

	public Arquivo(int numero, String data, String formato, String lancar) {
		this.numero = numero;
		this.data = data;
		this.formato = TipoFormato.valueOf(formato);
		this.lancar = TipoLancar.valueOf(lancar);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public TipoFormato getFormato() {
		return formato;
	}

	public void setFormato(TipoFormato formato) {
		this.formato = formato;
	}

	public TipoLancar getLancar() {
		return lancar;
	}

	public void setLancar(TipoLancar lancar) {
		this.lancar = lancar;
	}

}
