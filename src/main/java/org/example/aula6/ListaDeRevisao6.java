package org.example.aula6;

import java.util.Scanner;

public class ListaDeRevisao6 {
    static void main() {
//  6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
// Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
// Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
// Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."
        Scanner sc = new Scanner(System.in);
        String nome;
        int dataNasc;

        System.out.println("Digite o ano do seu nascimento:");
        dataNasc = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite agora o seu nome completo:");
        nome = sc.nextLine();

        System.out.println("O usuário " + nome + " nasceu em " + dataNasc + ".");
    }
}
