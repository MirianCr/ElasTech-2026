package org.example.aula4;

public class ExercicioEstruturasDeDecisao {
    static void main(){

// 1 — Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança",
//  de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".

//        int idade = 10;
//
//        if(idade < 13){
//            System.out.println("É criança!");
//        } else if (idade >= 13 && idade < 18){
//            System.out.println("É adolescente!");
//        } else if (idade >= 18 && idade <= 59){
//            System.out.println("É adulto!");
//        } else{
//            System.out.println("É idoso!");
//        }


//  2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00).
//  Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre
//  "Saldo insuficiente" e quanto está faltando.

//            double saldoConta = 500.00;
//            double compra = 320.00;
//
//            if (saldoConta >= compra){
//                System.out.println("Compra aprovada! Sobrou em seu saldo: " +(saldoConta - compra) + " R$");
//            }else{
//                System.out.println("Saldo insuficiente! Faltam: " + (compra - saldoConta));
//            }
//





// 3 — Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o
// pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá.
// Qualquer outro número mostra "Opção inválida".
//
//            int opcao = 2;
//
//            switch(opcao){
//                case 1:
//                    System.out.println("cafe");
//                    break;
//                case 2:
//                    System.out.println("Capuccino.");
//                    break;
//                case 3:
//                    System.out.println("Chocolate quente.");
//                    break;
//                case 4:
//                    System.out.println("Chá");
//                    break;
//                default:
//                    System.out.println("opção inválida");
//            }




// 4 — Crie variáveis idade (17) e temAutorizacao (true).
// Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização. Faça o mesmo para
//precisa ter 18 anos e ter autorização.
//                int idade = 17;
//                boolean temAutorizacao = false;
//
//                if ( idade >= 18 || temAutorizacao){
//                    System.out.println("Você está autorizado(a) a entrar na festa!");
//                }else{
//                    System.out.println("Você precisa ter 18 anos e ter autorização!");
//                }







//Desafio: Crie variáveis para três notas de uma aluna.
// Calcule a média e mostre: "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e
// "Reprovada" abaixo de 5. Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.

//Ps: Utilize double para o valor das notas. Para controlar as casas decimais,
// use printf com o marcador %.2f onde você quer que apareça a média no seu texto
// (Troquem ele de lugar pra ver o que acontece), onde 2 é a quantidade de casas que você quer
// (Experimentem trocar por 3 e ver o que acontece). O texto e a pontuação vão dentro das aspas,
// e o \n no final pula a linha (ele funciona como  um enter para que tudo não fique colado um do lado do outro):

//System.out.printf("Sua média é: %.2f\n", media);

        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;
        double media = (nota1 + nota2 + nota3) / 3;
        String aluno = "Mirian";

        if (media >= 7){
            System.out.printf("Nota media pra aprovação:7.0.\n" +
                              aluno+" você foi Aprovada! Parabéns! \n" +
                              "A sua media é: %.2f",media);

        } else if (media >= 5 && media <= 6.9) {
            System.out.printf("Nota media pra aprovação: 7.0.\n" +
                              aluno+" você está em recuperação, sua media é: %.2f",media);

        }else {
            System.out.printf("Nota media pra aprovação: 7.0.\n" +
                              aluno + " que triste, mas você foi Reprovada. \n" +
                              "O valor da sua média está abaixo de 5.0! \n" +
                              "Sua media é: %.2f",media);
        }


    }
}
