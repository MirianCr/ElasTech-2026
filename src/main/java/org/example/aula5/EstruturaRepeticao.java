package org.example.aula5;

import java.util.Scanner;

public class EstruturaRepeticao {
    public static void main() {
    Scanner scanner = new Scanner(System.in);


        //loop for
//        for( int i= 0; i <= 5; i++) {
//            System.out.println("Volta" + i);
//        }

        //loop while
        int senha = 0;
//        while (senha != 1234){
//            System.out.println("Digite a senha");
//            senha = scanner.nextInt();
//        }
//        System.out.println("Acesso liberado!");
//


        //do while
        do{
            System.out.println("Digite sua senha");
            senha = scanner.nextInt();
        }while(senha != 1234);
        System.out.println("Acesso liberado");

    }


}
