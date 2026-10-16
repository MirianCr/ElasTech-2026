package org.example.aula14.polimorfismo;

public abstract class Pessoa {
        String nome;
        int idade;

        void apresentar() {
            System.out.println("Oi, sou " + nome + " e tenho " + idade + " anos.");
        }

       // abstract void apresentar(String cargo);
}

