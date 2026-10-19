package org.example.atividadeRevisaoSolid;

public class Atividade3GettersEsetters {
    //Questão 3: Getters e Setters
    //Crie uma classe Produto com os atributos privados nome (String), preco (double) e quantidade (int).
    //
    //Crie getters e setters para todos os atributos.
    //O setter de preco não deve aceitar valores menores ou iguais a zero.
    //O setter de quantidade não deve aceitar valores negativos.
    //No main, crie um produto, preencha os atributos pelos setters, tente colocar um preço negativo, e imprima os dados usando os getters.

    public static void main(String[] args) {

        Produto p = new Produto();

        p.setNome("Notebook");
        p.setPreco(3500.00);
        p.setQuantidade(10);

        p.setPreco(-500); // tentativa inválida

        System.out.println("Nome: " + p.getNome());
        System.out.println("Preço: " + p.getPreco());
        System.out.println("Quantidade: " + p.getQuantidade());
    }
}
