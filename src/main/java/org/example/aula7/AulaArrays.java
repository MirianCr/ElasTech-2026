package org.example.aula7;
import java.util.Scanner;
public class AulaArrays {
    static void main(){
// int[] notas = {3,4,5,6,7,10,80,9};
// int[] outrasNotas = new int[3];

// System.out.println(notas.length);
// System.out.println(notas[0]);

// for(int i = 0; i < notas.length; i++){
//    System.out.println(notas[i]);
//        }

// 1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.
//        String[] pessoas = {"Ana", "Maria","Silvio","Claudia","Sebastiana"};
//        System.out.println(pessoas[0]);//primeiro
//        System.out.println(pessoas[2]);//terceiro
//        System.out.println(pessoas[4]);//ultimo
//
//2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".
// 3 — Com o mesmo array de notas, calcule e mostre a soma e a média.
//        int[] notas = {8, 6, 10, 7, 9};
//        int soma = 0;
//        for (int i = 0; i < notas.length; i++) {
//            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
//            soma = soma + notas[i];
//        }
//        double media = (double) soma / notas.length;
//        System.out.println("Soma: " + soma);
//        System.out.println("Média: " + media);

// 4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
// Guardando os números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = sc.nextInt();      }

// Mostrando de trás para frente
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
