package org.example.aulaEncapsulamento;

public class Atividade5 {
    static void main(String[] args) {

        Produto p = new Produto();

        System.out.println(p.nome);
        System.out.println(p.preco);
        //System.out.println(p.codigoInterno);

    }
    //5. (os modificadores lado a lado)
    //
    //   Crie a classe Produto com TRÊS atributos, cada um com um
    //   modificador diferente:
    //
    //   private String codigoInterno = "X-99";
    //   String nome = "Caneta";            // sem modificador: default
    //   public double preco = 5.50;
    //
    //   Na Main (mesmo package), tente imprimir os três.
    //
    //   Quais funcionaram? Qual deu erro?
    //
    //   Saída esperada:
    //
    //   Caneta
    //   5.5
    //   error: codigoInterno has private access in Produto
    //java: codigoInterno has private access in org.example.aulaEncapsulamento.Produto
    //
    //    No MESMO package, default e public se comportam igual. A
    //      diferença entre eles só aparece quando você sai do package.
}
