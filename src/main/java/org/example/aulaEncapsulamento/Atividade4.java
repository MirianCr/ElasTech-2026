package org.example.aulaEncapsulamento;

public class Atividade4 {
    static void main() {

//        4. (métodos que fazem o trabalho sujo)
//
//        Crie na ContaBancaria:
//
//        PÚBLICOS:
//        - depositar(double valor)   -> recusa valor menor ou igual a zero
//        - sacar(double valor)       -> recusa se não tiver saldo
//
//        PRIVADOS:
//        - temSaldo(double valor)    -> devolve true ou false
//        - registrarLog(String acao) -> imprime "[LOG] Ana: saque de 200.0"
//
//        O sacar() usa o temSaldo() pra decidir, e os dois chamam o
//        registrarLog() quando dá certo.
//
//                Na Main: deposite 500, tente depositar -100, tente sacar 2000,
//                saque 200.
//
//        Saída esperada:
//
//   [LOG] Ana: deposito de 500.0
//        Saldo: 500.0
//        Valor inválido!
//                Saldo insuficiente!
//   [LOG] Ana: saque de 200.0
//        Saldo: 300.0
//
//        Depois tente chamar c.registrarLog("teste") lá da Main:
//
//        error: registrarLog(String) has private access in ContaBancaria
//
//        Quem usa a sua classe vê só depositar() e sacar(). O resto é
//        maquinário interno e nem aparece no autocompletar.


        ContaBancaria c = new ContaBancaria();
        c.setTitular("Ana");

        c.depositar(500);
        System.out.println("Saldo: R$ " + c.getSaldo());

        c.depositar(-100);

        c.sacar(2000);

        c.sacar(200);
        System.out.println("Saldo: R$" + c.getSaldo());

    }
}
