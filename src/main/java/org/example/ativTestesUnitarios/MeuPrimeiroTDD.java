package org.example.ativTestesUnitarios;

public class MeuPrimeiroTDD {
    //Atividade Prática: Meu Primeiro TDD com JUnit 5/
    //Mão na massa: A Calculadora de Descontos
    //Vamos desenvolver uma classe CalculadoraDesconto usando os 3 passos (AAA) do JUnit!
    //
    //Regras de Negócio que nossa classe deve ter:
    //Método aplicarDesconto(double valorCompra, boolean clienteVip):Se a compra for menor que R$ 100,00 e o cliente não for VIP, não tem desconto (retorna o próprio valorCompra).Se o cliente for VIP, ganha 10% de desconto em qualquer valor (multiplica por 0.90).Se o valorCompra passado for zero ou negativo (<= 0), deve lançar um erro: IllegalArgumentException.
    //Sua Missão na classe CalculadoraDescontoTest:Teste 1 (@Test): Prepare uma compra de R$ 50.0 para cliente comum (false) e use assertEquals para garantir que retorna 50.0.Teste 2 (@Test): Prepare uma compra de R$ 200.0 para cliente VIP (true) e use assertEquals para garantir que retorna 180.0.Teste 3 (@Test): Use assertThrows para garantir que passar -10.0 lança IllegalArgumentException!


}
