package org.example.aula12.atividadeArrayDe;

import java.util.ArrayDeque;
import java.util.List;

public class AtividadeArrayDeque3 {
    static void main(String[] args) {
     //   3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
       // depois. Compare com o exercício 2.

                ArrayDeque<String> fila = new ArrayDeque<>();

                fila.addAll(List.of("Ana", "Bruno", "Carlos", "Daniela"));

                System.out.println("Fila antes: " + fila);

                System.out.println("Atendida: " + fila.poll());//primeiro da fila

                System.out.println("Fila depois: " + fila);

    }
}
