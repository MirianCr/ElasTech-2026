package org.example.aula6;

import java.util.Scanner;

public class ListaDeRevisao5 {
    static void main() {
// 5 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double). Ok
//
// Na classe principal, faça um laço for que repita 3 vezes.ok
//
// A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
//
// Instancie um novo Produto e guarde nele os valores digitados.
//
// Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!".
//Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.
        Scanner sc = new Scanner(System.in);

        for (int i=1; i<=3; i++){
            Produto prod = new Produto();

            System.out.println("Qual é o nome do produto?");
            prod.nome = sc.nextLine();
            System.out.println("Qual é o valor do produto? R$");
            prod.preco = sc.nextDouble();
            sc.nextLine();

            if (prod.preco > 100) {
                System.out.printf("Produto caro! Valor dele é: %.2f R$.%n",prod.preco," R$.\n");
            }else {
                System.out.printf("Produto %s está com preço acessivel!%n",prod.nome);
            }

      }

    }
}
