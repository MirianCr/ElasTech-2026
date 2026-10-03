package org.example.aula9;

import java.util.Scanner;
//1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo.
//Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando
//que não dá pra dividir por zero.
public class AtividadeTratamentoDeExcecoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            int numero1 = sc.nextInt();

            System.out.println("Digite o segundo número:");
            int numero2 = sc.nextInt();

            int divisao = numero1 / numero2;

            System.out.println("A divisão de " + numero1 +
                    " por " + numero2 +
                    " é igual a " + divisao);

        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero!");
        }

        sc.close();
    }
}