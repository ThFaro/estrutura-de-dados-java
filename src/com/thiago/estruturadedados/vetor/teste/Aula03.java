package com.thiago.estruturadedados.vetor.teste;

import com.thiago.estruturadedados.vetor.Vetor;

public class Aula03 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        System.out.println(vetor);
        System.out.println(vetor.tamanho());

        vetor.adicionar("E");
        vetor.adicionar("F");
        System.out.println(vetor);
        System.out.println(vetor.tamanho());

        int posicaodesejada = 0;
        vetor.adicionarPorPosicao(posicaodesejada, "A");

        System.out.println(vetor);
        System.out.println(vetor.tamanho());

        vetor.remover(0);
        System.out.println(vetor);


    }

}
