package org.example.atividadeObserver;

import java.util.ArrayList;
import java.util.List;


public class Estoque {

    private List<ObservadorEstoque> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorEstoque observador) {
        observadores.add(observador);
    }

    public void setQuantidade(int quantidade) {
        for (ObservadorEstoque observador : observadores) {
            observador.atualizar(quantidade);
        }
    }
}