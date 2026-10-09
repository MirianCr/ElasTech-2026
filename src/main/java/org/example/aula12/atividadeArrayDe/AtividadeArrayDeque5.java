package org.example.aula12.atividadeArrayDe;

import java.util.ArrayDeque;

public class AtividadeArrayDeque5 {
    static void main(String[] args) {
     //   5. Crie uma fila com três nomes e use contains para responder duas
        //   perguntas: se "Bia" está na fila e se "Zoe" está.

                ArrayDeque<String> fila = new ArrayDeque<>();

                fila.add("Ana");
                fila.add("Mavie");
                fila.add("Bia");

                System.out.println("Bia está na fila? " + fila.contains("Bia"));//true
                System.out.println("Zoe está na fila? " + fila.contains("Zoe"));

    }
}
