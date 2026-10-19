package org.example.atividadeRevisaoSolid;

public class Atividade5 {
    //    Questão 5: Classe abstrata
    //a) Crie uma classe abstrata Forma com:
    //
    //um atributo nome;
    //um construtor que recebe o nome;
    //um método normal exibirNome(), que imprime o nome da forma;
    //um método abstrato calcularArea(), que retorna um double.
    //
    //b) Crie uma classe Retangulo que herda de Forma, tem os atributos largura e altura, e implementa calcularArea().
    //
    //c) No main, crie um Retangulo, chame exibirNome() e imprima a área.
    //
    //d) Agora tente escrever Forma f = new Forma("teste");. O que acontece? Por quê?
    //O código não compila e gera um erro parecido com:Forma is abstract; cannot be instantiated.
    //Porque Forma é uma classe abstrata:Classes abstratas servem como modelo para outras classes, mas não podem gerar objetos diretamente.Como a própria classe não sabe calcular a área de todas as formas possíveis, ela obriga as classes filhas (Retangulo, Circulo, Triangulo etc.) a fornecerem uma implementação.

    public static void main(String[] args) {

        Retangulo r = new Retangulo("Retângulo", 5, 4);

        r.exibirNome();
        System.out.println("Área: " + r.calcularArea());
    }
}
