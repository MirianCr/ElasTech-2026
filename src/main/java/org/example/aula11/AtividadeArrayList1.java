package org.example.aula11;

import java.util.ArrayList;
import java.util.List;

public class AtividadeArrayList1 {
    static void main(String[] args) {
//        - Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

        ArrayList<String> lista = new ArrayList<>();

        //lista.add("maria");
        //lista.add("jose");
        //lista.add("pedro");
        lista.addAll(List.of("Maria", "Jose", "pedro"));
        System.out.println(lista);
    }
}
