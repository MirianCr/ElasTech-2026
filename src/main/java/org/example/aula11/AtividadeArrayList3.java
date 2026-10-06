package org.example.aula11;

import java.util.ArrayList;
import java.util.List;

public class AtividadeArrayList3 {
    static void main() {
// Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
        ArrayList<String> lista = new ArrayList<>();
        lista.addAll(List.of("Shakira", "Allana", "Mavie", "Mirian")) ;
        System.out.println("Antes:" + lista);
        lista.set(2, "Joaquina");
        System.out.println("Depois:" + lista);

    }
}
