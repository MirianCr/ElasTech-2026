package org.example.aula12;

import java.util.HashMap;
import java.util.HashSet;

public class AtividadeHashSet {
    static void main() {
        //1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
        //   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
        //   com o repetido.
        HashSet<String> nomes=new HashSet<>();

        nomes.add("Flora");
        nomes.add("Flora");//repetido
        nomes.add("Analis");
        nomes.add("Joaquim");

        System.out.println(nomes);
        System.out.println("Tamanho: " + nomes.size());

    }
}
