package org.example.aula14.Heranca;

import org.w3c.dom.ls.LSOutput;

public class Aluna extends Pessoa{
    String curso;

    public void estudar(){
        System.out.println(nome + " está estudando " + curso +". ");
    }

}
