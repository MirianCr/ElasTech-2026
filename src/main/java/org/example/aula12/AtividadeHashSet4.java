package org.example.aula12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AtividadeHashSet4 {
    static void main(String[] args) {
        //4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
        //imprima de novo, junto com o tamanho.

        Set<String> cpfs = new HashSet<>();

        cpfs.add("123456");
        cpfs.add("1234567");
        cpfs.add("12345678");


        System.out.println(cpfs);

        cpfs.remove("123456");//remover

        System.out.println("Depois de remover: " + cpfs);
        System.out.println("Tamanho: " + cpfs.size());//tamanho
    }
}
