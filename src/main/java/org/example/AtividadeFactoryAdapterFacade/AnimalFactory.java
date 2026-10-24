package org.example.AtividadeFactoryAdapterFacade;

public class AnimalFactory {

    public static Animal getAnimal(String tipo) {

        if (tipo.equalsIgnoreCase("cachorro")) {
            return new Cachorro();
        }

        if (tipo.equalsIgnoreCase("gato")) {
            return new Gato();
        }

        return null;
    }
}
