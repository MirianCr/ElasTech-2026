package org.example.aula12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AtividadeHashSet3 {
    static void main() {
    //3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
    //   tirar os repetidos. Imprima os dois e compare.

    List<String> nomes = new ArrayList<>();

        nomes.add("Mirian");
        nomes.add("Mirian");
        nomes.add("Mirian");

    Set<String> todosNomes = new HashSet<>(nomes);
        System.out.println("ArrayList: " + nomes);
        System.out.println("HashSet: " + todosNomes);//tirar repetidos
  }
}
