package org.example.aula5;

import java.util.Scanner;

public class Scanear {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Escreva a sua idade:");
        idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);
        sc.nextLine();

        System.out.println("Escreva seu nome:");
        nome = sc.nextLine();
        System.out.println("Seu nome é: " + nome);

    }
}
