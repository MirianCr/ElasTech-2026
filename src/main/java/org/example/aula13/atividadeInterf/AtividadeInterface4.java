package org.example.aula13.atividadeInterf;

import java.util.ArrayList;

public class AtividadeInterface4 {
    static void main(String[] args) {
         //4. Crie uma interface Notificacao com o método enviar(String mensagem).
        //   Crie duas classes que implementam ela: Email e SMS. Cada uma
        //   imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
        //   e percorra com for-each, enviando a mesma mensagem.
        //
        //   Saída esperada:
        //   E-mail enviado: Sua compra foi aprovada!
        //   SMS enviado: Sua compra foi aprovada!

        ArrayList<Notificacao> notifica = new ArrayList<>();

        notifica.add(new Email());
        notifica.add(new SMs());

        for (Notificacao notificacao : notifica) {
            notificacao.enviar("Sua compra foi aprovada! ");
    }
  }
}
