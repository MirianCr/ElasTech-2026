package org.example.aula8;
import java.util.Scanner;

public class Num5 {
//5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.
 public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();

            if (Utilidades5.ehMaiorDeIdade(idade)) {
                System.out.println("A pessoa é maior de idade.");
            } else {
                System.out.println("A pessoa é menor de idade.");
            }
        }
}

