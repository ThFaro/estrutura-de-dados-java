package com.thiago.estruturadedados.pilha.pilhaTeste;

import java.util.Stack;

public class Stackteste {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty());

        stack.push(50);
        stack.push(100);
        stack.push(1);

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        for (int i = 0; i < 5; i++) {
            stack.push(i * 2);
        }
        System.out.println(stack.size());
        System.out.println(stack);

        for (int i = 0; i < stack.size(); i++) {

            System.out.println(stack.peek());
            stack.pop();
            
        }
    }

}
