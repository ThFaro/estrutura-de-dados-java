package com.thiago.estruturadedados.fila;


import com.thiago.estruturadedados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{

	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}

	public void enfileira(T elemento) {

		this.adiciona(elemento);
	}

	public T desenfileira(){

		final int POS = 0;

		if (this.estaVazia()){
			return null;
		}

		T elementoASerRemovido = this.elementos[POS];

		this.remove(POS);

		return elementoASerRemovido;

	}

	public T espiar() {
		final int POSICAO = 0;
		if (this.estaVazia()) {
			return null;
		}

		return this.elementos[POSICAO];
	}



};


/*

	public T espiar(){

		if (this.estaVazia()){
			return null;
		}

		return this.elementos[0];
	}
 */
