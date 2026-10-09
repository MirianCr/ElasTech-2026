package org.example.aula13.atividadeInterf;

import java.util.ArrayList;

public class AtividadeInterface5 {
    static void main(String[] args) {
// 5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
//   Crie Carro e Moto implementando os dois. Coloque numa lista e
//  percorra com for-each chamando os dois métodos em cada um.
        ArrayList<Veiculo> metodo = new ArrayList<>();

        metodo.add(new Carro());
        metodo.add(new Moto());

        for (Veiculo veiculo : metodo) {
            veiculo.ligar();
            veiculo.acelerar();
 }
}
}
