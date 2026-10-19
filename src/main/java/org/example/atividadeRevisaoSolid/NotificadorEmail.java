package org.example.atividadeRevisaoSolid;

public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("[EMAIL] " + mensagem);
    }
}