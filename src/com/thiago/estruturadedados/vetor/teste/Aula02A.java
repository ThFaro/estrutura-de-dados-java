package com.thiago.estruturadedados.vetor.teste;

import com.thiago.estruturadedados.vetor.Vetor;

public class Aula02A {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        try {
            vetor.adicionar("Posição 1");
            vetor.adicionar("Posição 2");
            vetor.adicionar("Posição 3");
            vetor.adicionar("Posição 4");
            
            System.out.println("A lista tem " + vetor.tamanho() + " posições.");
            System.out.println(vetor.toString());
            System.out.println(vetor.busca(3));
            System.out.println(vetor.findIndex("Posição 2"));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
