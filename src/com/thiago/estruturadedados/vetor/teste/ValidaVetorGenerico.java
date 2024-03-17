package com.thiago.estruturadedados.vetor.teste;
import com.thiago.estruturadedados.vetor.VetorObj;;

public class ValidaVetorGenerico {

    public static void main(String[] args) {
        VetorObj vetor = new VetorObj(3);

        vetor.adicionar(3);
        vetor.adicionar(2);
        vetor.adicionar(1);
        vetor.adicionar(0);

        System.out.println("Tamanho = " + vetor.tamanho());

     
    }
    
}
