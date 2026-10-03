package org.example.aula9;
//4 — Crie uma variável String nome = null; e tente imprimir nome.length().
// Trate a NullPointerException e mostre "O nome não foi preenchido."
public class AtividadeTratamExce4 {
    public static void main(String[] args) {

        try{
            String nome = null;

            System.out.println(nome.length());

        } catch(NullPointerException ae){
            System.out.println("O nome não foi preenchido");


    }
  }

}
