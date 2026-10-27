package org.example.ativTestesUnitarios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDescontoTest {

    @Test
    void deveRetornarMesmoValorParaClienteComum() {
        // Arrange
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        // Act
        double resultado = calculadora.aplicarDesconto(50.0, false);

        // Assert
        assertEquals(50.0, resultado);
    }

    @Test
    void deveAplicarDescontoParaClienteVip() {
        // Arrange
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        // Act
        double resultado = calculadora.aplicarDesconto(200.0, true);

        // Assert
        assertEquals(180.0, resultado);
    }

    @Test
    void deveLancarExcecaoParaValorNegativo() {
        // Arrange
        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        // Act + Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.aplicarDesconto(-10.0, false)
        );
    }
}
