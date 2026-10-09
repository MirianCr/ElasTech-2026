package org.example.aula13.atividadeInterf;

  class SMs implements Notificacao{

        @Override
        public void enviar(String mensagem){
            System.out.println("SMS enviado! " + mensagem);
        }
}
