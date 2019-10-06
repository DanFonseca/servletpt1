package br.com.servlets;

public class Empresa {
	
	private  String nome;
	
	public Empresa (String nome) {
		this.nome = nome;
	}
	
	public String  getNomeEmpresa () {
		return this.nome;
	}
	
	@Override
	public String toString () {
		return this.nome;
	}

}
