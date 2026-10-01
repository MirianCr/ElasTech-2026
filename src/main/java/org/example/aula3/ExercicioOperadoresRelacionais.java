package org.example.aula3;

public class ExercicioOperadoresRelacionais {
    static void main(){
/*    Relacionais:
        1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes,
        a primeira é maior, a primeira é menor para quando:

        - a = 10, b = 3
        - a = 3, b = 10
        - a = 5, b = 5
   */

        double aluna1a= 10;
        double aluna2b = 3;

//        System.out.println(aluna1a == aluna2b);//iguais
//        System.out.println(aluna1a != aluna2b);//diferentes
//        System.out.println(aluna1a > aluna2b); //a primeira é maior
//        System.out.println(aluna1a < aluna2b);//a primeira é menor

//2- Exiba na tela  a == b, sendo a = 10 e b 3.
        System.out.println(aluna1a == aluna2b);

// 3- Exiba na tela a != b, sendo a = 10 e b = 3.
        System.out.println(aluna1a != aluna2b);

//4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo
        boolean chovendo = true;
        System.out.println(!chovendo);

    }
}
