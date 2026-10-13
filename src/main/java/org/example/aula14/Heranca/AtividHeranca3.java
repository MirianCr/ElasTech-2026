package org.example.aula14.Heranca;

public class AtividHeranca3 {
    static void main(String[] args) {
        //3. Crie a classe Professora, também filha de Pessoa, com o atributo
        //   disciplina e o método lancarNota(String aluna, double nota), que
        //   imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
        //   com %.1f. ok
        //
        //      Na Main, crie uma aluna e uma professora, preencha os atributos de
        //   cada objeto e chame os métodos das duas.
        Aluna aluna = new Aluna();
        aluna.nome = "Ana";
        aluna.idade = 20;
        aluna.curso = "Java";

        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 35;
        professora.disciplina = "Programação";

        aluna.apresentar();
        aluna.estudar();

        professora.apresentar();
        professora.lancarNota(aluna.nome, 9.5);

    }
}
