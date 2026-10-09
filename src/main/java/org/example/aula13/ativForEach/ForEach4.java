package org.example.aula13.ativForEach;

import java.util.ArrayList;
import java.util.List;

public class ForEach4 {
    static void main(String[] args) {
    //4. Com um array de nomes, use for-each e um if para contar quantos
    //   têm mais de 5 letras. Mostre o total. Dica: usem o método length.

        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Beatriz");
        nomes.add("Carlos");
        nomes.add("João");
        nomes.add("Fernanda");

        int contador = 0;

        for (String nome : nomes) {
            if (nome.length() > 5) {
                contador++;
            }
        }

        System.out.println("Quantidade de nomes com mais de 5 letras: " + contador);
    }
}
