package org.example.aula13.atividadeInterf;

public class AtividadeInterface2 {
    static void main(String[] args) {

        //2. Agora acrescente a classe Gato, que implementa a mesma interface e
        //   imprime "Miau!". Na main, declare as duas variáveis como Animal:
        //
        //   Animal bidu = new Cachorro();
        //   Animal salem= new Gato();
        //
        //   Chame emitirSom() nas duas.

        Cachorro bidu = new Cachorro(); //criar um cachorro

        bidu.emitirSom();//chamar o metodo

        Gato salem = new Gato();//cria um gato

        salem.emitirSom();
    }
}
