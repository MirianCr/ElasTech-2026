package org.example.aula7;

import java.util.Scanner;

public class AulaStrings {
    static void main() {

//1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).
        Scanner sc = new Scanner(System.in);
//        String nome="";
//
//        System.out.println("Qual é o seu nome completo?");
//        nome=sc.nextLine();
      //  System.out.println("Nome digitado foi: "+ nome +" e tem "+ nome.length()+" letras");

//2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.
 //    System.out.println("Nome digitado maiusculo: "+ nome.toUpperCase() +" e minusculo: " + nome.toLowerCase());
//
////3 — Peça o nome da pessoa e mostre a primeira letra dele.
 //     System.out.println("A primeira letra do Nome digitado: "+ nome.charAt(0));
//
////4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
////Digite uma frase: Estou aprendendo Java
////Digite uma palavra: Java
////A palavra aparece na frase? true
//
//        String frase = "";
//        String palavra = "";
//
//        System.out.println("Digite uma frase:");
//        frase=sc.nextLine();
//
//        System.out.println("Digite uma palavra:");
//        palavra =sc.nextLine();
//
//        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));

//
////5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
////
//// Digite seu nome: Ana
//// Digite de novo: ANA
//// Os nomes são iguais? true
        String nome1;
        String nome2;

        System.out.println("Digite seu nome:");
        nome1 = sc.nextLine();

        System.out.println("Digite de novo:");
        nome2 = sc.nextLine();

        System.out.println("Os nomes são iguais? " + nome1.equalsIgnoreCase(nome2));//equals checa se é igual


//        Referência: //
//        String nome = "Maria Silva";
//        nome.length();                 // 11
//        nome.toUpperCase();            // MARIA SILVA
//        nome.toLowerCase();            // maria silva
//        nome.contains("Silva");        // true
//        nome.charAt(0);                // M
//        nome.substring(0, 5);          // Maria
//        nome.replace("Silva","Souza"); // Maria Souza
//        "  oi ".trim();               // "oi"
//        nome.equals("maria silva");           // false
//        nome.equalsIgnoreCase("maria silva"); // true
//        String nome = "Mavie Hellena";//
//        System.out.println(nome.length());//13
//        System.out.println(nome.toUpperCase());//MAVIE HELLENA
//        System.out.println(nome.toLowerCase());//mavie hellena
//        System.out.println(nome.contains("Hellena"));//true
//        System.out.println(nome.charAt(0));//M
//        System.out.println(nome.substring(0, 5));//Mavie
//        System.out.println(nome.replace("Mavie","Janaina"));//Janaina Hellena
//        System.out.println("   oi   ".trim());//
//        System.out.println(nome.equals("mavie hellena"));//false
//        System.out.println(nome.equalsIgnoreCase("mavie hellena"));//true
//


    }
}
