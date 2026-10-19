package org.example.aulaEncapsulamento;

public class Atividade6 {
    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();

        System.out.println("Numero da conta: " + c.getNumeroConta());

        //c.setNumeroConta("999-Z");
        System.out.println("Numero da conta: " + c.getNumeroConta());

    }
    //6. (nem todo atributo precisa de setter)
    //
    //   Na ContaBancaria, acrescente o atributo numeroConta, private,
    //   já com um valor fixo:
    //
    //   private String numeroConta = "001-X";
    //
    //   Crie o GETTER dele. NÃO crie o setter.
    //
    //   Na Main, mostre o número da conta. Depois tente mudar ele:
    //
    //   c.setNumeroConta("999-Z");
    //
    //   Saída esperada:
    //
    //   Numero da conta: 001-X
    //   error: cannot find symbol
    //     symbol:   method setNumeroConta(String)
    //
    //    Getter e setter não são um par obrigatório. Número de conta,
    //      CPF e data de cadastro são informações que podem ser LIDAS,
    //      mas não deveriam mudar depois. Você decide isso simplesmente
    //      não escrevendo o setter.
}
