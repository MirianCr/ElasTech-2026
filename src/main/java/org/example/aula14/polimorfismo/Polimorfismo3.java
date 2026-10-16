package org.example.aula14.polimorfismo;

public class Polimorfismo3 {
    //3. Crie a classe Professora, também filha de Pessoa, com o atributo
    //   disciplina e o método lancarNota(String aluna, double nota), que
    //   imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
    //   com %.1f.
    //
    //   Na Main, crie uma aluna e uma professora e dê valor aos atributos
    //   de cada objeto:
    //
    //   Professora flora = new Professora();
    //   flora.nome = "Flora";
    //   flora.idade = 30;
    //   flora.disciplina = "Java e IA";
    //
    //   Faça o mesmo com a aluna e chame os métodos das duas.

    public static void main(String[] args) {

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 20;
        ana.curso = "ADS";

        ana.apresentar();
        ana.estudar();

        flora.apresentar();
        flora.lancarNota("Ana", 9.5);
    }



}
