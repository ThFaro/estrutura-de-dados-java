package com.thiago.estruturadedados.fila.filaTeste;

import com.thiago.estruturadedados.fila.Documentos;
import com.thiago.estruturadedados.fila.Fila;

public class Ex1 {

	public static void main(String[] args) {
         Fila<Documentos> fila = new Fila<>();
         
         fila.enfileira(new Documentos("Documento 1", 1));
         fila.enfileira(new Documentos("Documento 2", 2));
         fila.enfileira(new Documentos("Documento 3", 3));
         fila.enfileira(new Documentos("Documento 4", 2));
         fila.enfileira(new Documentos("Documento 5", 3));
         fila.enfileira(new Documentos("Documento 6", 3));
         fila.enfileira(new Documentos("Documento 7", 1));
         
         while (!fila.estaVazia()) {
			Documentos doc = fila.desenfileira();
			System.out.println("Imprimindo documento " + doc.getNome());

			try {
				Thread.sleep(200 * doc.getQtdFolhas());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
         
 		System.out.println("Todos os documentos foram impressos.");

	}

}