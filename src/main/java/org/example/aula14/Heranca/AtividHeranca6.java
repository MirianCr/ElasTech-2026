package org.example.aula14.Heranca;

public class AtividHeranca6 {
    public static void main(String[] args) {
        //6. Crie duas interfaces:
        //   - Notificavel, com notificar(String mensagem) ok
        //   - Exportavel, com exportar() ok
        //
        //   Faça o Gerente do exercício 5 implementar as duas, SEM tirar o
        //   extends Funcionario: ok
        //
        //   class Gerente extends Funcionario implements Notificavel, Exportavel
        //
        //    Na Main, crie um gerente, preencha o nome e chame os quatro
        //   métodos nele: baterPonto(), aprovarFerias(), notificar()
        //   e exportar(). ok
        //
        //   UMA herança (extends), VÁRIAS interfaces (implements).

        //   Depois tente colocar uma segunda classe no extends:
        //   extends Funcionario, Pessoa
        //   Veja o que o Java responde.(o Java dará erro: "Class cannot extend multiple classes" é um erro de compilação, porque uma classe só pode herdar de uma única classe.)
        Gerente gerente = new Gerente();

        gerente.nome = "Carlos";

        gerente.baterPonto();
        gerente.aprovarFerias("Ana");
        gerente.notificar("Reunião às 14h");
        gerente.exportar();
    }
}
