package org.example.aula7;

public class AtividadeEstruturaDeRepeticao {
    static void main() {
//
//1 - Mostre os números de 1 a 30, um por linha, usando for.
//        for (int i = 1; i<=30; i++){
//            System.out.println(i);
//        }

//2 - Mostre a contagem regressiva de 10 até 1 e depois a palavra "Fim!".
//        for (int i = 10; i>=1; i--){
//           System.out.println(i);
//          }
//           System.out.println("Fim!");


//3 - Faça o mesmo do exercício 1, agora usando while. Compare os dois códigos.
//        int contador = 1;
//        while (contador <=30){
//            System.out.println(contador++);
//        }

//4 -  Crie uma variável com um número e mostre a tabuada dele de 1 a 10.
        int numero = 2;
        for(int i = 1; i <=10;i++ ){
            System.out.println(i+"x"+i + "=" + i*numero);
         }


    }
}
