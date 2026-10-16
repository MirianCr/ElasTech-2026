package org.example.aula14.polimorfismo;

public class Professora extends Pessoa {

        String disciplina;

        //@Override
         void apresentar(String cargo) {
            System.out.println("Oi, sou " + nome + " e ensino " + disciplina + ".");
        }

//        void apresentar(String cargo) {
//              System.out.println("Oi, sou " + nome + ", " + cargo);
//         }
        void lancarNota(String aluna, double nota) {
            System.out.printf("%s lançou nota %.1f para %s%n", nome, nota, aluna);
        }
 }

