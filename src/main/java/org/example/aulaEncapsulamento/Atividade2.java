package org.example.aulaEncapsulamento;

public class Atividade2 {
    static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();

        System.out.println("Titular: " + c.getTitular());
        System.out.println("Saldo: " + c.getSaldo());
    }

    //2. (abrir a porta de leitura)
    //
    //   Crie um getter para cada atributo.
    //
    //   Na Main, apague as duas linhas que davam erro e mostre o titular
    //   e o saldo usando os getters. ok
    //
    //   Saída esperada:
    //
    //   Titular: null
    //   Saldo: 0.0
    //
    //    Olha o que apareceu. O objeto existe, mas está VAZIO — ninguém
    //      preencheu nada ainda. O null e o 0.0 são os valores que o Java
    //      coloca sozinho quando você dá new.
    //
    //    No IntelliJ: alt + insert (ou Cmd + N no Mac) -> Getter. Mas
    //      escreva o primeiro na mão, pra ver como ele é por dentro.




}
