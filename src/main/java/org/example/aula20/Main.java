package org.example.aula20;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int opcao =1;
        System.out.println("Quyal o banco deseja utilizar? Digite 1-mysql 2 MongoDB");
        int opcao = sc.nextInt();

        BancoDeDados banco = BancoDeDadosFactory.criar(opcao);
        banco.proibidoBarulho();

//        MySql mySql = new MySql();
//        mySql.proibidoBarulho();

    }
}
