package org.example.aula9;

import java.util.Scanner;

// 2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição.
// Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.

public class AtividadeTratamentoDeExcecoes2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] notas = {10, 20, 30, 40, 50};

        try {
            System.out.println("Digite uma posição de 0 a 4:");
            int posicao = sc.nextInt();

            System.out.println("A nota na posição " + posicao + " é " + notas[posicao]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro! O array só possui posições de 0 a 4.");
        }

        sc.close();
    }
}