package org.example.aula14.polimorfismo;

public class Calculadora {
    public double calcularArea(double lado) {
        return lado * lado; //quadrado
    }

    public double calcularArea(double base, double altura) {
        return base * altura;//retangulo
    }

    public double calcularArea(int raio) {
        return 3.14159 * raio * raio;//circulo
    }
}
