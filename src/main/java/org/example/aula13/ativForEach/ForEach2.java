package org.example.aula13.ativForEach;

import java.util.ArrayList;

public class ForEach2 {
    static void main(String[] args) {
        //2. Crie um ArrayList com 5 notas e imprima todas usando for-each.
        ArrayList<Double> notas = new ArrayList<>();

        notas.add(8.5);
        notas.add(7.0);
        notas.add(9.5);
        notas.add(6.0);
        notas.add(10.0);

        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}
