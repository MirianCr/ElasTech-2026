package org.example.aula13.atividadeInterf;

import java.util.ArrayList;

public class AtividadeInterface3 {
    static void main(String[] args) {
        //3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
        //   e percorra com for-each chamando emitirSom(). Repare que não
        //   tem nenhum if. Dica:
        //animais.add(new Cachorro());

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
