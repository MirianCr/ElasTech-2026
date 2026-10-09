package org.example.aula12.ativHashMap;

import java.util.HashMap;

public class AtividadeHashMap1 {
    static void main(String[] args) {
 //1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
 // inteiro e depois use get para mostrar a idade de uma delas.

        HashMap<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Mirian", 25);
        pessoas.put("Ana", 30);
        pessoas.put("Carlos", 40);

        System.out.println("Mapa inteiro: " + pessoas);

        System.out.println("Idade da Ana: " + pessoas.get("Ana"));

    }
}
