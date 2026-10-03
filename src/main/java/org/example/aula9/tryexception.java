package org.example.aula9;

public class tryexception {
    public static void main(String[] args){
        try{
            int resultado = 10 / 5;

            System.out.println("O resultado é:" +resultado);

        } catch(ArithmeticException ae){
            System.out.println("Não se divide por 0!");

        }finally {
            System.out.println("Isso sempre roda!");
        }
        System.out.println("O programa continua");
    }

}
