package com.thiago.estruturadedados.pilha.pilhaTeste;

import com.thiago.estruturadedados.pilha.Pilha;

public class PilhaTeste {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.empilha(1);
        pilha.empilha(20);
        pilha.empilha(10);

        System.out.println(pilha.topo());

       System.out.println(pilha.desempilha()); 

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
