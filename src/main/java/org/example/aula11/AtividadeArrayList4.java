package org.example.aula11;

import java.util.ArrayList;
import java.util.List;

public class AtividadeArrayList4 {
    static void main() {
//- Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
        ArrayList<String> lista = new ArrayList<>();
        lista.addAll(List.of("Paracatu", "Ceilandia", "Taguatinga", "Unaí")) ;
        lista.remove(1);
        System.out.println("Sobraram:" + lista);
    }
}
