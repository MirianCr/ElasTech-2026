package org.example.aula11;

import java.util.ArrayList;
import java.util.List;

public record AtividadeArrayList5() {
    static void main() {
//- Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`.
// (Dica: i + ": " + comando para pegar posição da lista)

        ArrayList<String> lista = new ArrayList<>();

        lista.addAll(List.of("Ana", "João", "Maria", "Pedro", "Lucas", "Julia"));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ": " + lista.get(i));
        }
    }
}
