package org.example.aulaEncapsulamento;

public class Atividade3 {
    static void main(String[] args) {
        //3. (a porta de escrita, com porteiro)
        //
        //   Crie um setter para o titular que RECUSA valor vazio. Se vier
        //   vazio, avisa e mantém o que já estava.
        //
        //   Na Main, chame ele duas vezes: uma com "" e uma com "Ana".
        //   Mostre o titular depois de cada uma.
        //
        //   Saída esperada:
        //
        //   Titular inválido! Mantido null
        //   Titular: Ana
        //
        //   Referência:
        //
        //   public void setAtributo(String atributo) {
        //       if (atributo == null || atributo.isEmpty()) {
        //           System.out.println("Inválido! Mantido " + this.atributo);
        //           return;
        //       }
        //       this.atributo = atributo;
        //   }
        //
        //    O return sozinho sai do método na hora, sem fazer o resto.
        //
        //    Compare com a questão 1: lá, c.saldo = -5000 passava direto.
        //      Aqui o objeto conferiu antes de aceitar.

        ContaBancaria c = new ContaBancaria();
        c.setTitular("");
        System.out.println("Titular: " + c.getTitular());

        c.setTitular("Ana");
        System.out.println("Titular: " + c.getTitular());

    }
}
