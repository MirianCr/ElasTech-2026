package org.example.aula11;

import java.util.ArrayList;
import java.util.List;

public class AtividadeArrayList2 {
    static void main() {
 //- Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.

        ArrayList<String> lista = new ArrayList<>();
        lista.addAll(List.of("laranja", "maçã", "pera", "melancia")) ;
        System.out.println("Primeira: " + lista.get(0));//primeira
        //System.out.println("Ultima: " + lista.get(3));//ultima
        System.out.println("Ultima fruta: " + lista.get(lista.size()-1));
        System.out.println("Quantidade de frutas: "+ lista.size());//quantidade de frutas
    }
}
