package org.example.aula12.atividadeArrayDe;

import java.util.ArrayDeque;
import java.util.List;

public class AtividadeArrayDeque2 {
    static void main(String[] args) {
       // 2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
        //   imprima a fila logo depois. Repare que ela não mudou.

                ArrayDeque<String> fila = new ArrayDeque<>();

                fila.addAll(List.of("Ana", "Bruno", "Carlos", "Daniela"));

                System.out.println("Próximo da fila: " + fila.peek());

                System.out.println("Fila completa: " + fila);

    }
}
