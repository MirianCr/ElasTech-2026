package org.example.aula12.ativHashMap;

import java.util.HashMap;

public class AtividadeHashMap4 {
    static void main(String[] args) {
 //4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
 //   Use getOrDefault para mostrar a quantidade de um produto que existe
 //   e de um que não existe (devolvendo 0). Depois tente com get normal
 //   no que não existe e compare.

        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("Notebook", 10);
        estoque.put("Mouse",25 );

        // Produto que existe
        System.out.println("Notebook: " +
                estoque.getOrDefault("Notebook", 0));

        // Produto que não existe
        System.out.println("Teclado: " +
                estoque.getOrDefault("Teclado", 0));

        // Comparando com get normal
        System.out.println("Teclado com get(): " +
                estoque.get("Teclado"));
    }
}