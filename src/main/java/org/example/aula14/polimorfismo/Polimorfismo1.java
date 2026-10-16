package org.example.aula14.polimorfismo;

public class Polimorfismo1 {
    public static void main(String[] args) {

        //1. (mesma classe — muda a QUANTIDADE de parâmetros)
        //
        //   Crie a classe Calculadora com TRÊS métodos chamados calcularArea():
        //   - recebe um double (lado do quadrado)  -> lado * lado
        //   - recebe dois double (base e altura)   -> base * altura
        //   - recebe um int (raio do círculo)      -> 3.14159 * raio * raio
        //
        //   Chame os três na Main e imprima os resultados.
        Calculadora calc = new Calculadora();

        System.out.println("Área do quadrado: " +
                calc.calcularArea(5.0));

        System.out.println("Área do retângulo: " +
                calc.calcularArea(4.0, 6.0));

        double area = calc.calcularArea(3);
        System.out.printf("Área do círculo: %.5f%n", area);
    }
}


