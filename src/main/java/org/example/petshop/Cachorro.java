package org.example.petshop;

public class Cachorro extends Pet{
    @Override
    public void emitirSom() {
        System.out.println(nome + " fez: Au au!");
    }
    public void buscarBolinha(){
        System.out.println(nome + "buscou a bolinha!");
    }
}
