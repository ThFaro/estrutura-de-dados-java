package com.thiago.estruturadedados.pilha;

import com.thiago.estruturadedados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capcidade) {
        super();
    }

    public boolean empilha(T elemento) {
        return super.adiciona(elemento);

    }

    public T topo() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[tamanho - 1];
    }

    public T desempilha() {
        if (this.estaVazia()) {
            return null;
        }

        T elemento = this.elementos[tamanho - 1];

        tamanho--;
        return elemento;
    }

}
