package org.example.atividadeObserver;

public class Ativ5 {
    public static void main(String[] args) {

        //5 - Crie uma classe PainelAeroporto que também implementa ObservadorVoo e imprime "Painel: " + o status. No main, adicione ao voo um passageiro um painel, e mude o status para "Atrasado". Os dois devem ser avisados.
        Voo voo = new Voo();

        Passageiro passageiro = new Passageiro();
        PainelAeroporto painel = new PainelAeroporto();

        voo.adicionarObservador(passageiro);
        voo.adicionarObservador(painel);

        voo.mudarStatus("Atrasado");
    }
}




