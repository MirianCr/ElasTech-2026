package org.example.aula14.polimorfismo;

public class Polimorfismo4 {
    //4. (herança — quem não sobrescreve)
    //
    //   Crie a classe Estagiaria, filha de Pessoa, que NÃO sobrescreve
    //   o apresentar() e não acrescenta nada.
    //
    //   Na Main, crie o objeto, dê valor aos atributos, guarde ele numa
    //   variável do tipo da mãe e chame o método apresentar().
    //
    //   O que saiu? Por quê?
    //Saiu a mensagem do método apresentar() da classe Pessoa.
    //
    //Isso acontece porque a classe Estagiaria herdou o método da classe mãe e não o sobrescreveu (@Override).
    //quando a classe filha não sobrescreve um método, ela utiliza a implementação herdada da classe mãe. Isso mostra que a herança permite reaproveitar código sem precisar reescrever os métodos.

    public static void main(String[] args) {

        Pessoa pessoa = new Estagiaria();

        pessoa.nome = "Maria";
        pessoa.idade = 19;

        pessoa.apresentar();
    }
}
