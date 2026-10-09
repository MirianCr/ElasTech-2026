package org.example.aula12.atividadeArrayDe;

import java.util.ArrayDeque;
import java.util.List;

public class AtividadeArrayDeque4 {
    static void main(String[] args) {
     //   4. Crie uma fila com três nomes e atenda todos usando
        //   while (!fila.isEmpty()). No final, imprima "Fila vazia!".

                ArrayDeque<String> fila = new ArrayDeque<>();

                fila.add("Ana");
                fila.add("Mavie");
                fila.add("Sebastiana");

                while (!fila.isEmpty()) {
                    System.out.println("Atendendo: " + fila.poll());
                }

                System.out.println("Fila vazia!");

    }
}
