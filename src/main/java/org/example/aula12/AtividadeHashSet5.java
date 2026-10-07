package org.example.aula12;

import java.util.HashSet;
import java.util.Set;

public class AtividadeHashSet5 {
    static void main() {
       // 5. Crie um HashSet com três frutas e percorra ele com for,
     //   imprimindo uma por linha.

        Set<String> frutas = new HashSet<>();

        frutas.add("melancia");
        frutas.add("goiaba");
        frutas.add("maçã");

        for(String fruta: frutas){
            System.out.println("fruta:" + fruta);
        }
    }
}
