package org.example.aula14.Heranca;

public class AtividHeranca4 {
    public static void main(String[] args) {
        //4. Na Professora, sobrescreva o apresentar() usando @Override, pra
        //   imprimir "Oi, sou [nome] e ensino [disciplina]."
        //
        //   Chame apresentar() na aluna e na professora e compare as saídas.
        Aluna aluna = new Aluna();
        aluna.nome = "Ana";
        aluna.idade = 20;
        aluna.curso = "Java";

        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 35;
        professora.disciplina = "Programação";

        aluna.apresentar();
        professora.apresentar();

    }
}
