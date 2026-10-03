package org.example.aula9;
//6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException
// com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."
public class AtividadeTratamExcec6 {
    public static void main(){

        String[] nomes = {"Gilberto", "Martia", "Flor"};

        try{
            System.out.println(nomes[5]);

        } catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Essa posição não existe." );

        }finally {
            System.out.println( "O programa continua funcionando.");
        }

    }

}



