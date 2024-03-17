package com.thiago.estruturadedados.vetor;

public class VetorObj {
    
    private Object [] elementos;
    private int tamanho;

    public VetorObj(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionaV1(Object elemento) {
        this.aumentaCapacidade();
        ;
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }

    public void adicionaV2(Object elemento) throws Exception {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já esta cheio,não será possivel adicionar mais elementos");
        }
    }

    public boolean adicionar(Object elemento) {
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    public void adicionarPoPosicao(int posicao, Object elemento) {
        this.aumentaCapacidade();
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];

        }
        this.elementos[posicao] =  elemento;
        this.tamanho ++;


    }

    public int tamanho() {
        return this.tamanho;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
            s.append("]");
        }

        return s.toString();
    }

    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int findIndex(Object elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }

        }
        return -1;
    }

    public void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

    }

    public void remover(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < tamanho -1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;

    }

}

