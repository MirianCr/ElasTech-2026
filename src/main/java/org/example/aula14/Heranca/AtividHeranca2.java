package org.example.aula14.Heranca;

public class AtividHeranca2 {
    static void main() {
        //2. Acrescente na Aluna o atributo curso e o método estudar(), que
        //   imprime "[nome] está estudando [curso]."
        //
        //   Preencha os três atributos no objeto e chame os dois métodos.
        //
        //   Repare que o estudar() usa o nome, que veio da mãe.
        Aluna aluna = new Aluna();

        aluna.nome = "Mirian";
        aluna.idade = 25;
        aluna.curso = "Java";

        aluna.apresentar();
        aluna.estudar();
    }
}
