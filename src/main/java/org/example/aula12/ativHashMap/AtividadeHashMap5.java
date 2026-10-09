package org.example.aula12.ativHashMap;

import java.util.HashMap;

public class AtividadeHashMap5 {
    static void main(String[] args) {
 //5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
 //   Remova uma delas e imprima de novo.

        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Mariazinha", 10.0);
        notas.put("Juriscleudis", 5.0 );
        notas.put("Volverina",2.0 );


        System.out.println("mapa: " + notas);
        System.out.println("tamanho: " + notas.size());

        notas.remove("Volverina");

        System.out.println("Mapa após remover: " + notas);
        System.out.println("novo tamanho: " + notas.size());


    }
}