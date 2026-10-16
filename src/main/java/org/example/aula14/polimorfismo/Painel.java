package org.example.aula14.polimorfismo;

public class Painel {

    void exibir(String texto) {
        System.out.println("Recebi uma String: " + texto);
    }

    void exibir(int numero) {
        System.out.println("Recebi um int: " + numero);
    }

    void exibir(boolean valor) {
        System.out.println("Recebi um boolean: " + valor);
    }

    void exibir(double numero) {
        System.out.println("Recebi um double: " + numero);
    }

    public static void main(String[] args) {
        Painel painel = new Painel();

        painel.exibir("Olá");
        painel.exibir(10);
        painel.exibir(true);
        painel.exibir(3.14);
    }
}
