package org.example.aula12.ativHashMap;

import java.util.HashMap;

public class AtividadeHashMap2 {
    static void main(String[] args) {
 //2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
 //   imprima, e depois faça put de "café" DE NOVO com valor 7.50.
 //   Imprima outra vez e veja o que aconteceu com o tamanho.

        HashMap<String, Double> produtos = new HashMap<>();

        produtos.put("Notebook Samsung v345", 2759.9);
        produtos.put("Mouse branco N9876", 30.00);
        produtos.put("café", 5.00);

        System.out.println("Produtos antes: " + produtos);
        System.out.println("Tamanho: " +produtos.size());

        produtos.put("café", 7.50);

        System.out.println("Depois: " + produtos);
        System.out.println("Tamanho: " + produtos.size());

    }

}
