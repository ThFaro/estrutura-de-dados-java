package com.thiago.estruturadedados.fila.filaTeste;

import java.util.Queue;
import java.util.LinkedList;

public class FilaNativa {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);
        fila.add(3);
        
        System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila.remove());
        System.out.println(fila);
    }

}