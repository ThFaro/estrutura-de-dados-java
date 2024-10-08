package com.thiago.estruturadedados.listaencadeada;

public class No<T> {

    private T elemento;
    private No<T> proximo;

    public T getElemento() {
        return this.elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return this.proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public No(T elemento, No<T> proximo) {
        super();
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }
}
