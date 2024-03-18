package com.thiago.estruturadedados.vetor;

import java.util.ArrayList;

public class ArrayListJava {

    public static void main(String[] args) {
        
        ArrayList<String> arrayList =  new ArrayList<String>();

        //para add elemento no final do array
        arrayList.add("teste 1");
        arrayList.add("teste 2");
        System.out.println(arrayList);

        //para add um elemento em uma posição específica
        arrayList.add(1,"test 3");
        System.out.println(arrayList);

        //para mostrar o tamanho do array utilizamos o metodo size
        System.out.println("O vetor tem o tamanho = " + arrayList.size());

        //para fazer a busca se um elemento existe no array utilizamos o contains
        boolean existeItem = arrayList.contains("test 3");
        if(existeItem){
            System.out.println("O elemento pesquisado existe");
        }else{
            System.out.println("O elemento pesquisado não existe");
        }

        //para buscar a posição de um elemento no vetor utilizamos o indexOf
        int posicao = arrayList.indexOf("test 3");
        if(posicao >-1){
            System.out.println("O elemento pesquisado existe na posição " + posicao);
        }else{
            System.out.println("O elemento pesquisado não existe" + posicao);
        }
        
        //para buscar o elemento passando uma posição de busca utilizamos o método get
        String elementoPosicao = arrayList.get(0);
        System.out.println("O elemento  que esta na posição pesquisada é: " + elementoPosicao);

        //para remover um elemento usamos o metodo remove
        arrayList.remove(0); //remove o elemento da posição 0
        arrayList.remove("test 3"); //remove o elemento passando o object
        System.out.println(arrayList); // [teste 2]

        //para sobrescrever um elemento em uma posição utilizamos o set
        arrayList.add("teste 1");
        System.out.println(arrayList);
        arrayList.set(0, "Usei o SET");
        System.out.println(arrayList);
    }
    
}
