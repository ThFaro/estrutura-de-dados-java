package com.thiago.estruturadedados.fila.filaTeste;

import com.thiago.estruturadedados.fila.Fila;

public class Ex2 {
    public static void main(String[] args) {

        Fila<String> regular = new Fila<>();
        Fila<String> prioridade = new Fila<>();
        final int MAX_PRIORIDADE = 3;

        regular.enfileira("Pessoa 1");
        regular.enfileira("Pessoa 2");
        regular.enfileira("Pessoa 3");
        prioridade.enfileira("Pessoa 1 P");
        prioridade.enfileira("Pessoa 2 P");
        prioridade.enfileira("Pessoa 3 P");
        prioridade.enfileira("Pessoa 4 P");
        regular.enfileira("Pessoa 4");
        regular.enfileira("Pessoa 5");
        regular.enfileira("Pessoa 6");

        while (!regular.estaVazia() || !prioridade.estaVazia()) {
            int contador = 0;

            while (!prioridade.estaVazia() && contador < MAX_PRIORIDADE) {
                atendePessoa(prioridade);
                contador++;

            }

            if (!regular.estaVazia()) {
                atendePessoa(regular);
            }

            if (prioridade.estaVazia()) {
                while (!regular.estaVazia()) {
                    atendePessoa(regular);

                }
            }
        }

    }

    public static void atendePessoa(Fila<String> fila) {
        String pessoaAtendida = fila.desenfileira();
        System.out.println(pessoaAtendida + " foi atendida.");

    }

}
