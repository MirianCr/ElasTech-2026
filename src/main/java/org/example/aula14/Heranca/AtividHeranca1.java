package org.example.aula14.Heranca;

public class AtividHeranca1 {
    static void main(String[] args) {
//        1. Crie a classe Pessoa com os atributos nome e idade, e o método
//        apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."ok
//
//        Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.ok
//
//        Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().
//
//     Repare: você não escreveu nome, idade nem apresentar() na Aluna,
//        e os três funcionaram.
        Aluna aluna = new Aluna();

        aluna.nome = "Mirian";
        aluna.idade = 25;

        aluna.apresentar();


    }
}
