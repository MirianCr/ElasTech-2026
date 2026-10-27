package org.example.atividadeObserver;

public class Ativ6 {
    static void main(String[] args) {

        //6 - Agora monte o mesmo padrão do zero, com outro tema:
        //
        //a) Crie uma interface ObservadorEstoque com o método void atualizar(int quantidade).
        //
        //b) Crie uma classe RegistroEstoque que implementa a interface e imprime "Nova quantidade: " + a quantidade.
        //
        //c) Crie uma classe Estoque com uma lista de observadores, um método adicionarObservador e um método setQuantidade(int quantidade), que avisa todos da lista.
        //
        //d) No main, adicione um RegistroEstoque e mude a quantidade duas vezes.

        Estoque estoque = new Estoque();

        RegistroEstoque registro = new RegistroEstoque();

        estoque.adicionarObservador(registro);

        estoque.setQuantidade(50);

        estoque.setQuantidade(30);
    }
}

