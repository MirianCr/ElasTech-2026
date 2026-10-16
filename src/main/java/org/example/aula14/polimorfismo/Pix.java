package org.example.aula14.polimorfismo;

public class Pix implements MeioDePagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento via PIX no valor de R$ %.2f%n", valor);
    }
}
