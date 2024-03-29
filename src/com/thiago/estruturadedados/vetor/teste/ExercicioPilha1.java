package com.thiago.estruturadedados.vetor.teste;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();

        for (int i = 0; i < 10; i++) {

            Integer posicao = i + 1;

            System.out.println("Digite o " + posicao + " número");
            int numero = scanner.nextInt();

            if (numero % 2 != 0) {
                pilha.push(numero);
            } else {
                if (pilha.isEmpty()) {
                    System.out.println("Pilha vazia");
                } else {
                    pilha.pop();
                }

            }

        }
        System.out.println("Elementos da pilha: " + pilha);

        while (!pilha.isEmpty()) {
            System.out.println("Removendo o elemento do topo da pilha: " + pilha.peek());
            System.out.println(pilha.pop());
        }
    }
}
