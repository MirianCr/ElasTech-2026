package org.example.aula12.ativHashMap;

import java.util.HashMap;

public class AtividadeHashMap3 {
    static void main(String[] args) {
 //3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
 //   dentro de um if para mostrar o telefone de alguém que está na agenda
 //   e de alguém que não está.

        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Flora", "61991565777");
        agenda.put("Floribela","6178787799" );

        if (agenda.containsKey("Flora")) {
            System.out.println("Telefone da Flora: " + agenda.get("Flora"));
        } else {
            System.out.println("Flora não está na agenda.");
        }

        if (agenda.containsKey("Zoe")) {
            System.out.println("Telefone da Zoe: " + agenda.get("Zoe"));
        } else {
            System.out.println("Zoe não está na agenda.");
        }




    }

}
