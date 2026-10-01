package org.example.aula6;

import java.util.Scanner;

public class ListaDeRevisao {
    static void main() {

//lista de atividades:

// 1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele.
// Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final,
// exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
// Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 "

        Scanner sc = new Scanner(System.in); //peça ao usuário = scanner

        String lanche;
        double valorLanche;

        System.out.println("Qual é o seu lanche de hoje?");
        lanche = sc.nextLine();

        System.out.println("Qual é o valor do lanche? R$");
        valorLanche = sc.nextDouble();

        if (valorLanche > 30) {
            valorLanche = (valorLanche - 5);
        }

        System.out.printf("O lanche " + lanche + " com desconto custa R$ %.2f%n", valorLanche);

        sc.close();

    }
}
