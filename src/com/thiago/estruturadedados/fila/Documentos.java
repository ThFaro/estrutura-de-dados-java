package com.thiago.estruturadedados.fila;

public class Documentos {

	private String nome;

	private int qtdFolhas;
	
	public Documentos(String nome, int qtdFolhas) {
		super();
		this.nome = nome;
		this.qtdFolhas = qtdFolhas;
	}

	public Documentos() {
		super();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdFolhas() {
		return qtdFolhas;
	}
	public void setQtdFolhas(int qtdFolhas) {
		this.qtdFolhas = qtdFolhas;
	}
	
}

