package org.example.aula12.atividadeArrayDe;

import java.util.ArrayDeque;
import java.util.Deque;

public class AtividadeArrayDeque1 {
    static void main(String[] args) {
       // 1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
       // e quantas pessoas tem.
        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.add("Ana");
        fila.add("Mavie");
        fila.add("Sebastiana");

        System.out.println(fila);
        System.out.println("quantas pessoas:" + fila.size());

    }
}
