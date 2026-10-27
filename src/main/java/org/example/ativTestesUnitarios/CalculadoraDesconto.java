package org.example.ativTestesUnitarios;

public class CalculadoraDesconto {

    public double aplicarDesconto(double valorCompra, boolean clienteVip) {

        if (valorCompra <= 0) {
            throw new IllegalArgumentException("Valor da compra deve ser maior que zero.");
        }

        if (clienteVip) {
            return valorCompra * 0.90;
        }

        return valorCompra;
    }
}
