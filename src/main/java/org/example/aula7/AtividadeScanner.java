package org.example.aula7;
import java.util.Scanner;
public class AtividadeScanner {
    static void main() {

// 1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."
//
//        Scanner sc = new Scanner(System.in);
//
//        String nome;
//        int idade;
//
//        System.out.println("Digite o seu nome:");
//        nome = sc.nextLine();
//
//        System.out.println("Digite a sua idade:");
//        idade = sc.nextInt();
//
//        System.out.println("Oi " +nome + " ! Você tem "+ idade +" anos"+
//                " e vai fazer "+ (idade +1) +" no proximo aniversario");


// 2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.

//        Scanner sc = new Scanner(System.in);
//
//        int numero1;
//        int numero2;
//
//        System.out.println("Digite o primeiro número:");
//        numero1 = sc.nextInt();
//
//        System.out.println("Digite o segundo número:");
//        numero2 = sc.nextInt();
//
//        System.out.println("Soma: " + (numero1 + numero2));
//        System.out.println("Subtração: " + (numero1 - numero2));
//        System.out.println("Multiplicação: " + (numero1 * numero2));
//        System.out.println("Divisão: " + (numero1 / numero2));
//        System.out.println("Resto: " + (numero1 % numero2));


//3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9)
// ou foi reprovada.

//        Scanner sc = new Scanner(System.in);
//
//        double nota;
//
//        System.out.println("Digite a nota da aluna:");
//        nota = sc.nextDouble();
//
//        if (nota >= 7) {
//            System.out.println("Sua nota foi acima de 7. Você foi Aprovada! Sua nota é: " + nota);
//        } else if (nota >= 5) {
//            System.out.println("Sua nota está abaixo de 5. Você está de Recuperação. Sua nota é:" +nota);
//        } else {
//            System.out.println("Sua nota é baixa. Você foi Reprovada! Sua nota é: " + nota);
//        }

//4 - Peça um número e mostre a tabuada dele de 1 a 10.
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número:");
        numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }



    }
}
