package br.com.servlets;

import java.util.ArrayList;
import java.util.List;

public class Banco <T>  {

	public static List  lista = new ArrayList<>();
	
	public void adicionar (T empresa) {
		lista.add(empresa);

	}
	
	public List<T>  getDados() {
		return this.lista;
	}

}
