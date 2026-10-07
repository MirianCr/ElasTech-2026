package org.example.aula12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AtividadeHashSet2 {
    static void main(String[] args) {
        //2. Crie um HashSet de cores usando addAll. Depois use contains dentro
        //   de um if para avisar se a cor "verde" já está no conjunto ou não.

        List<String> cores=new ArrayList<>();

        cores.add("azul");
        cores.add("verde");
        cores.add("amarelo");

        Set<String> todasCores = new HashSet<>();
        todasCores.addAll(cores);

        System.out.println("cores: " + todasCores);
        if (todasCores.contains("verde")){
            System.out.println("já tem a cor verde na lista");
        }else{
            System.out.println("não tem a cor verde na lista");
        }
    }
}
