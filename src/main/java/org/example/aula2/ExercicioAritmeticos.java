package org.example.aula2;

public class ExercicioAritmeticos {
    static void main(){

//Aritméticos
// 0- Rode esse código:
//        System.out.println("2 + 2 = " + 2 + 2);
////Agora rode:
//        System.out.println("2 + 2 = " + (2 + 2));

//Explique em um comentário por que deram resultados diferentes.
        //O primeiro deu resultado 22 porque só juntou o 2 e 2 que deu 22
        //O segundo somou certinho 2 + 2 com resultado 4 pois estava entre parenteses



//1- Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e mostre na tela:
// soma, subtração, multiplicação, divisão e resto.
//        int valorA = 10;
//        int valorB = 3;
//        int soma = (valorA + valorB);
//        int subtra = (valorA - valorB);
//        int multi = (valorA * valorB);
//        int divisao = (valorA / valorB);
//        int resto = (valorA % valorB);
//
//        System.out.println("Soma: " + soma );
//        System.out.println("Subtração: " + subtra);
//        System.out.println("Multiplicação : " + multi);
//        System.out.println("Divisão: " + divisao);
//        System.out.println("Resto: " + resto);



// 2- Crie variáveis para dois números decimais de valor a = 10 e b = 3 e
// mostre na tela: soma, subtração, multiplicação, divisão e resto.
//        double valorA = 10;
//        double valorB = 3;
//
//        System.out.println("Soma: " + (valorA + valorB));
//        System.out.println("Subtração: " +(valorA - valorB));
//        System.out.println("Multiplicação : " +(valorA * valorB));
//        System.out.println("Divisão: " +(valorA / valorB));
//        System.out.println("Resto: " +(valorA % valorB));



//3- Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.
//        double nota1 = 8;
//        double nota2 = 6;
//        double nota3 = 10;
//        double soma = nota1 + nota2 + nota3;
//        double media = soma/3;
//
//        System.out.println("A soma das notas é: " + soma);
//        System.out.println("A media das notas é: " + media);





//4- Faça a operação a + b * c, sendo a = 3, b = 4 e c = 5.
//        int a = 3;
//        int b = 4;
//        int c = 5;
//
//        System.out.println(a + b * c);






//5- Faça a operação (a + b) * c, sendo a = 3, b = 4 e c = 5.
//        int a = 3;
//        int b = 4;
//        int c = 5;
//
//        System.out.println((a + b) * c);








// Desafio: Crie uma variável com 3785 segundos.
// Mostre quantos minutos inteiros isso dá e quantos segundos sobram.
        int segundos = 3785;

        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;

        System.out.println("Minutos inteiros: " + minutos);
        System.out.println("Segundos que sobraram: " + segundosRestantes);

    }
}
