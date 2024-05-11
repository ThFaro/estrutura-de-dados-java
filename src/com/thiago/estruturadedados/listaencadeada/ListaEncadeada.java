package com.thiago.estruturadedados.listaencadeada;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);

        if (tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        tamanho++;
    }

    public void limpa() {
        No<T> atual = this.inicio;

        while (atual != null) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }



    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nSequência: ");

        No<T> atual = inicio;

        while (atual != null) {
            builder.append(atual.getElemento()).append(" -> ");
            atual = atual.getProximo();
        }

        builder.append("null\n");

        builder.append("Tamanho: ").append(getTamanho());
        return builder.toString();
    }
}
