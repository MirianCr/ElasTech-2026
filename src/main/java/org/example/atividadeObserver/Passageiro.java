package org.example.atividadeObserver;

public class Passageiro implements ObservadorVoo {

@Override
    public void atualizar(String status) {
    System.out.println("Passageiro atualizar: " + status);
    }
}
