package org.example.aula14.polimorfismo;

public class Polimorfismo5 {
    //5. (herança — método que recebe a mãe)
    //
    //   Crie um método na sua classe Main:
    //
    //   static void mostrarFicha(Pessoa p) {
    //       p.apresentar();
    //   }
    //
    //   Chame ele três vezes, passando a aluna, a professora e a estagiária.
    //
    //   O método não sabe quem vai receber, e funciona pros três.

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }

    public static void main(String[] args) {

        Aluna aluna = new Aluna();
        aluna.nome = "Ana";
        aluna.idade = 20;

        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 30;
        professora.disciplina = "Java e IA";

        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Julia";
        estagiaria.idade = 19;

        mostrarFicha(aluna);
        mostrarFicha(professora);
        mostrarFicha(estagiaria);
    }

}
