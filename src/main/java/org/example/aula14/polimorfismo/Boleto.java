package org.example.aula14.polimorfismo;

public class Boleto implements MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento via boleto no valor de R$ %.2f%n", valor);
    }
}
