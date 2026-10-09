package org.example.aula13.atividadeInterf;

public class AtividadeInterface1 {
    static void main(String[] args) {
//1. Crie uma interface Animal com o método emitirSom().
//   Crie a classe Cachorro que implementa ela e imprime "Au au!".
//   Na Main, crie um cachorro e chame o método. Não esqueça do @Override.
    Cachorro cachorro = new Cachorro(); //criar um cachorro

    cachorro.emitirSom();//chamar o metodo
    }
}
