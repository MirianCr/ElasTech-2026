package org.example.atividadeObserver;

public class Atividade4 {
    //4 - A interface já está pronta:
    //
    //public interface ObservadorVoo {
    //void atualizar(String status);
    //
    //}
    //
    //a) Crie uma classe Passageiro que implementa ObservadorVoo e, no atualizar, imprime "Passageiro avisado: " + o status.
    //
    //b) Crie uma classe Voo com uma lista de ObservadorVoo, um método adicionarObservador(ObservadorVoo o) e um método mudarStatus(String status), que chama o atualizar de todos da lista.
    //
    //c) No main, crie um voo, adicione um passageiro e mude o status para "Embarque iniciado".
    public static void main(String[] args) {
            Voo voo = new Voo();

            Passageiro passageiro = new Passageiro();

            voo.adicionarObservador(passageiro);

            voo.mudarStatus("Embarque iniciado");}
}
