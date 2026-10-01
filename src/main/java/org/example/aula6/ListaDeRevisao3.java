package org.example.aula6;

import java.util.Scanner;

public class ListaDeRevisao3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
// 3 - Usando um do-while e um switch, crie um menu interativo.
// O menu deve oferecer três opções:
//  1 - Ver camisas
//  2 - Ver calças
//  3 - Sair
//  Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha.
//  Se digitar uma opção inválida,avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.

        int menu;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Ver camisas");
            System.out.println("2 - Ver calças");
            System.out.println("3 - Sair");

            menu = scanner.nextInt();

            switch(menu){
                case 1:
                    System.out.println("Você escolheu: Ver camisas");
                    break;

                case 2:
                    System.out.println("Você escolheu: Ver calças");
                    break;

                case 3:
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("opção inválida, se quiser sair digite 3");

        }

    }while(menu != 3);
        scanner.close();
    }
}

