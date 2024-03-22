package com.thiago.estruturadedados.pilha;

import com.thiago.estruturadedados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(){
        super();
    }

    public Pilha(int capcidade){
        super();
    }

    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }

    public void adiciona(int posicao, T elemento){
        super.adiciona(posicao,elemento);
    }

}
