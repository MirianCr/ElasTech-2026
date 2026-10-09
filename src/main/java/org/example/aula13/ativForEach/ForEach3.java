package org.example.aula13.ativForEach;

import java.util.ArrayList;
import java.util.List;

public class ForEach3 {
    static void main(String[] args) {
  //3. Com o array de notas {8, 6, 10, 7}, use for-each para somar
 //   todas e mostrar a soma e a média

        List<Integer> notas = new ArrayList<>();

        notas.add(8);
        notas.add(6);
        notas.add(10);
        notas.add(7);

        int soma = 0;

        for (int nota : notas) {
            soma += nota;
        }

        double media = (double) soma / notas.size();

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
