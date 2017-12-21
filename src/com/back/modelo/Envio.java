package com.back.modelo;

public class Envio {

	private boolean app;
	private boolean web;
	private boolean des;
	
	public Envio(boolean app, boolean web, boolean des) {
		this.app = app;
		this.web = web;
		this.des = des;
	}

	public boolean isApp() {
		return app;
	}

	public void setApp(boolean app) {
		this.app = app;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public boolean isDes() {
		return des;
	}

	public void setDes(boolean des) {
		this.des = des;
	}
	
	
	
}
