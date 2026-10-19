package org.example.atividadeRevisaoSolid;

public class Atividade6 {
    //Questão 6: Exercício integrado (Sistema de Funcionários)
    //
    //Faça em etapas.
    //
    //Etapa 1. Crie uma classe abstrata Funcionario com atributos privados nome e salarioBase, um construtor que recebe os dois, getters, e um setter de salarioBase que não aceite valores negativos.
    //
    //Etapa 2. Adicione à classe Funcionario um método abstrato calcularSalario().
    //
    //Etapa 3. Crie duas classes que herdam de Funcionario:
    //
    //Desenvolvedor: o salário é o salário base mais 20%. ( salario = salarioBase + (salarioBase * 0.20) ou
    //
    //salario = salarioBase * 1.20
    //
    //)
    //Gerente: o salário é o salário base mais 50%. (
    //
    //salario = salarioBase + (salarioBase * 0.50) ou salario = salarioBase * 1.50 )
    //
    //
    //Etapa 4. Crie uma interface Notificador com o método notificar(String mensagem). Crie duas implementações: NotificadorEmail e NotificadorSms, cada uma imprimindo a mensagem de um jeito diferente.
    //
    //Etapa 5. Crie uma classe FolhaPagamento que recebe um Notificador pelo construtor e tem um método pagar(Funcionario f), que calcula o salário e usa o notificador para avisar o funcionário.
    //
    //Etapa 6. No main, crie um desenvolvedor e um gerente, pague os dois usando uma folha com notificação por email, e depois crie outra folha com notificação por SMS.
    //
    //Pergunta final: quais princípios e conceitos de POO você usou em cada etapa?

    //Etapa 1 - Encapsulamento -Os atributos ficaram protegidos com private e o acesso é feito por getters e setters.
    //Etapa 2 - Abstração -A classe Funcionario define o que deve ser feito, mas não como.
    //Etapa 3 - Herança e Polimorfismo - Herança porque as classes filhas reaproveitam a classe pai.
    //Polimorfismo porque cada uma implementa:calcularSalario() de forma diferente.
    //Etapa 4 - Interface -Define um contrato que todas as notificações devem seguir.
    //Etapa 5 - Injeção de Dependência e Polimorfismo.A classe FolhaPagamento depende da interface e não das implementações específicas.
    //Etapa 6 - polimorfismo-Uso integrado de todos os conceitos anteriores


    public static void main(String[] args) {

        Desenvolvedor dev =
                new Desenvolvedor("Ana", 5000);

        Gerente gerente =
                new Gerente("Carlos", 8000);

        FolhaPagamento folhaEmail =
                new FolhaPagamento(new NotificadorEmail());

        folhaEmail.pagar(dev);
        folhaEmail.pagar(gerente);

        FolhaPagamento folhaSms =
                new FolhaPagamento(new NotificadorSms());

        folhaSms.pagar(dev);
        folhaSms.pagar(gerente);
    }
}
