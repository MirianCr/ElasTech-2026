package org.example.aula13.ativForEach;

public class ForEach1 {
    static void main() {
        //1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
        //   um por linha.
        String[] nomes = {"Flora", "Bia", "Mordor", "BobEsponja"};

        for (String nome : nomes) {
            System.out.println("Nome:" + nome);
        }
    }
}
