package com.thiago.estruturadedados.listaencadeada.teste;

import com.thiago.estruturadedados.listaencadeada.ListaEncadeada;

public class Listateste {

    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        System.out.println(lista);
        lista.adiciona(1);
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        lista.limpa();
        System.out.println(lista);
    }

}
