package org.example.AtividadeFactoryAdapterFacade;

public class Ativ3 {

    //Questão 3 (prática). Implemente a interface e as classes abaixo:
    //
    //public interface Animal {
    //    void emitirSom();
    //}
    //
    //
    //public class Cachorro implements Animal {
    //    @Override
    //    public void emitirSom() {
    //        System.out.println("Au au!");
    //    }
    //}
    //
    //
    //public class Gato implements Animal {
    //    @Override
    //    public void emitirSom() {
    //        System.out.println("Miau!");
    //    }
    //}
    //
    //
    //Crie a classe AnimalFactory com um método getAnimal(String tipo):
    //• se o tipo for "cachorro", devolve um Cachorro;
    //• se o tipo for "gato", devolve um Gato.
    //No main, use a fábrica para criar um cachorro e um gato e chame emitirSom() nos dois. O main não pode ter new Cachorro() nem new Gato().


        public static void main(String[] args) {

            Animal cachorro = AnimalFactory.getAnimal("cachorro");
            Animal gato = AnimalFactory.getAnimal("gato");

            cachorro.emitirSom();
            gato.emitirSom();
        }
    }

