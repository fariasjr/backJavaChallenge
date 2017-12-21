package com.back.ui;

import com.back.modelo.Arquivo;
import com.back.modelo.Envio;
import com.back.modelo.Formato;
import com.back.modelo.TipoFormato;
import com.back.modelo.TipoLancar;
import com.back.modelo.TipoUser;
import com.back.modelo.Usuario;

public class TesteBack {

	public static void main(String[] args) {

		System.out.println("Inicio");

		Formato admTesteFor = new Formato(true, true, true, true, true, true);
		Envio admTesteEnv = new Envio(true, true, true);

		Usuario admTeste = new Usuario("123", "Farias", "farias", "123", admTesteFor, admTesteEnv, TipoUser.ADM);

		System.out.println(admTeste.toString());

		Arquivo testeArq = new Arquivo(1, "01/01/2017", TipoFormato.PDF, TipoLancar.APP);

		System.out.println(testeArq.toString());

		System.out.println("Fim");

	}

}
