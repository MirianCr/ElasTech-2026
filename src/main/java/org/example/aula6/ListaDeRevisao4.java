package org.example.aula6;

public class ListaDeRevisao4 {
    static void main() {

// 4 - Crie uma classe chamada Pet.
// Dê a ela três atributos: nome (String), raca (String) e peso (double).
//
// Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
//Atribua valores para os atributos de cada um deles.
//
//Imprima os dados dos dois pets concatenando textos e variáveis.

      Pet dogs = new Pet();
      dogs.nome = "Shakira";
      dogs.raca = "lulu da polmerania";
      dogs.peso = 2;

      Pet gato = new Pet();
      gato.nome = "Shanin";
      gato.raca = "vira-lata";
      gato.peso= 2.5;

      System.out.println("\nDados do cachorro: "+ dogs.nome + " \n-Raça: " + dogs.raca + " \n-Peso: " + dogs.peso + " kg.\n");

      System.out.println("Dados do gato: "+ gato.nome + " \n-Raça: " + gato.raca + " \n-Peso: " + gato.peso + " kg.");
    }
}
