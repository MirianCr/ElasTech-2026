package org.example.atividadeObserver;

// PainelAeroporto
public class PainelAeroporto implements ObservadorVoo {

    @Override
    public void atualizar(String status) {
        System.out.println("Painel: " + status);
    }
}
