package org.example.aula12;

import java.util.HashSet;
import java.util.Set;

public class AtividadeHashSet6 {
    static void main() {
        //6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
        //imprima o isEmpty() de novo.

                Set<String> nomes = new HashSet<>();

                System.out.println(nomes.isEmpty());//true

                nomes.add("Mirian");//adiciona um valor

                System.out.println(nomes.isEmpty());//false
    }
}

