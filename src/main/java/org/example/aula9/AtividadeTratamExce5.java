package org.example.aula9;

import java.util.Scanner;

//5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número.
// Trate a ArithmeticException para o caso de ela digitar 0.
public class AtividadeTratamExce5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            int numero1 = sc.nextInt();

            int divisao = 100 / numero1;
            System.out.println("O resto da divisão de 100 por " + numero1 +
                    " é igual a " + divisao);

        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero!");

        }
    }
}
