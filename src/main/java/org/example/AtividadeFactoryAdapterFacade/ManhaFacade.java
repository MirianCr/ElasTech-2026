package org.example.AtividadeFactoryAdapterFacade;

public class ManhaFacade {
    private Despertador despertador;
    private Cafeteira cafeteira;
    private Chuveiro chuveiro;

    public ManhaFacade() {
        despertador = new Despertador();
        cafeteira = new Cafeteira();
        chuveiro = new Chuveiro();
    }

    public void acordar() {
        despertador.desligar();
        cafeteira.fazerCafe();
        chuveiro.ligar();
    }
}
