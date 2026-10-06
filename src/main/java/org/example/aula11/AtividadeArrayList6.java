package org.example.aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeArrayList6 {
    static void main() {
//- Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição.
// Se não estiver, avise.
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        lista.addAll(List.of("Ana", "João", "Maria", "Pedro", "Lucas"));

        System.out.println("Digite um nome:");
        String nome = sc.nextLine();
        if (lista.contains(nome)) {
            System.out.println("O nome está na lista.");
            System.out.println("Posição: " + lista.indexOf(nome));
        } else {
            System.out.println("O nome não está na lista.");
        }

    }
}
