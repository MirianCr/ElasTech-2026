package org.example.aula13.ativForEach;

import java.util.ArrayList;

public class ForEach5 {
    static void main(String[] args) {
        //5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
        //   usando o índice. Deixe os dois na mesma classe e compare.
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Bia");
        nomes.add("Carlos");

        System.out.println("Usando for-each:");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("\nUsando for normal:");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
