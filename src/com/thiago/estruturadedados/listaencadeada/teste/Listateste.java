package com.thiago.estruturadedados.listaencadeada.teste;

import java.util.LinkedList;

import com.thiago.estruturadedados.listaencadeada.ListaEncadeada;

public class Listateste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        System.out.println(lista);

        lista.adiciona(1);
        System.out.println(lista);
        lista.adiciona(2);
        System.out.println(lista);
        lista.adiciona(4);
        System.out.println(lista);

        lista.adicionaInicio(0);
        System.out.println(lista);

        lista.adiciona_posicao(4, 5);
        System.out.println(lista);
        lista.adiciona_posicao(2, 3);
        System.out.println(lista);

        lista.removePosicao(2);
        System.out.println(lista);

        lista.removeInicio();
        System.out.println(lista);

        lista.removeFinal();
        System.out.println(lista);

        System.out.println(lista.buscaPosicao(1));

    }


    public static void testeLinkedList(){
        LinkedList<Integer> lista =  new LinkedList<>();

        lista.add(1);
        lista.addFirst(0);
        lista.addLast(3);

        System.out.println(lista.contains(1));

        lista.add(2,2);
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);

        lista.remove(0);
        lista.removeFirst();
        lista.removeLast();
        System.out.println(lista);

    }

}
