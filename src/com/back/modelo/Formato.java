package com.back.modelo;

public class Formato {
	
	private boolean txt;
	private boolean pdf;
	private boolean doc;
	private boolean docx;
	private boolean jpg;
	private boolean tif;
	
	public Formato(boolean txt, boolean pdf, boolean doc, boolean docx, boolean jpg, boolean tif) {
		this.txt = txt;
		this.pdf = pdf;
		this.doc = doc;
		this.docx = docx;
		this.jpg = jpg;
		this.tif = tif;
	}
	public boolean isTxt() {
		return txt;
	}
	public void setTxt(boolean txt) {
		this.txt = txt;
	}
	public boolean isPdf() {
		return pdf;
	}
	public void setPdf(boolean pdf) {
		this.pdf = pdf;
	}
	public boolean isDoc() {
		return doc;
	}
	public void setDoc(boolean doc) {
		this.doc = doc;
	}
	public boolean isDocx() {
		return docx;
	}
	public void setDocx(boolean docx) {
		this.docx = docx;
	}
	public boolean isJpg() {
		return jpg;
	}
	public void setJpg(boolean jpg) {
		this.jpg = jpg;
	}
	public boolean isTif() {
		return tif;
	}
	public void setTif(boolean tif) {
		this.tif = tif;
	}
	
	
	
}
