package org.example.atividadeConstrutores;

public class Atividade1 {
    //EXERCÍCIO — CONSTRUTORES 🏗️
    //
    //1. Crie a classe Agendamento com TODOS estes atributos,
    //   recebidos num construtor só:
    //
    //   - nomePet (String)
    //   - servico (String)
    //   - horario (String)
    //   - perfume (boolean)
    //   - laco (boolean)
    //   - hidratacao (boolean)
    //   - observacao (String)
    //   - desconto (double)
    //
    //   Crie um método mostrar() que imprime tudo.
    //
    //   Na Main, crie 3 agendamentos:
    //   a) Thor, banho, 14h, com perfume e laço, sem hidratação,
    //      "alérgico a shampoo", 10% de desconto
    //   b) Luna, tosa, 10h, sem nenhum extra, sem observação,
    //      sem desconto
    //   c) Mel, banho, 16h, só com hidratação, sem observação,
    //      sem desconto
    //
    //   Agora responda:
    //   - Olhando só a linha do new, dá pra saber o que cada
    //     true/false significa? Não, fica difícil saber se o primeiro true é perfume, laço ou hidratação sem consultar o construtor.
    //   - Se você trocar a ordem do perfume e do laço sem querer,
    //     o código compila? Alguém perceberia o erro? Sim, o código compila normalmente, porque ambos são do tipo boolean.Os dois compilam. O erro só seria percebido ao executar ou conferir os dados.
    //   - No agendamento b, quantos valores você digitou só pra
    //     dizer "não quero isso"?Foram digitados:
    //
    //false (perfume)
    //false (laço)
    //false (hidratação)
    //"" (sem observação)
    //0 (sem desconto)
    //
    //5 valores foram informados apenas para indicar que os recursos não seriam utilizados.
    //
    //   Guarda essa sensação.
    public static void main(String[] args) {

        Agendamento a1 = new Agendamento(
                "Thor",
                "banho",
                "14h",
                true,
                true,
                false,
                "alérgico a shampoo",
                10
        );

        Agendamento a2 = new Agendamento(
                "Luna",
                "tosa",
                "10h",
                false,
                false,
                false,
                "",
                0
        );

        Agendamento a3 = new Agendamento(
                "Mel",
                "banho",
                "16h",
                false,
                false,
                true,
                "",
                0
        );

        a1.mostrar();
        a2.mostrar();
        a3.mostrar();
    }
}
