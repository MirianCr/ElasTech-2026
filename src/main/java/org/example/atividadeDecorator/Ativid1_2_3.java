package org.example.atividadeDecorator;

public class Ativid1_2_3 {

    //Atividade: Decorator na Açaiteria
    //
    //
    //Questão 1. Uma açaiteria vende açaí com qualquer combinação de adicionais: granola, leite ninho, morango, paçoca. Por que criar uma classe para cada combinação (AcaiComGranola, AcaiComGranolaEMorango, AcaiComMorangoEPacoca...) é um problema? O que o Decorator faz no lugar?
    //R:
    //Criar uma classe para cada combinação de adicionais é um problema porque a quantidade de classes cresce muito rapidamente.
    //Quanto mais adicionais existirem, mais combinações precisarão ser criadas, deixando o sistema difícil de manter e expandir.
    //
    //O padrão Decorator resolve esse problema permitindo adicionar ingredientes dinamicamente ao objeto. Em vez de criar uma classe para cada combinação, criamos um decorator para cada adicional (Granola, Morango, Paçoca, Leite Ninho) e os combinamos conforme necessário.
    //Assim, o mesmo açaí pode receber qualquer combinação de adicionais sem precisar criar dezenas de classes diferentes. O código fica mais flexível, reutilizável e fácil de manter.
    //-------------------------------------------------------------------------------------------------------------------
    //Questão 2. Em um Decorator, por que a classe AcaiDecorator tem implements Acai?
    //
    //a) Para poder ser criada com new
    //b) **Para que um adicional também conte como açaí e possa ir dentro de outro adicional**
    //c) Para herdar o preço do açaí simples
    //d) Para não precisar usar o super
    //R:
    // letra B - No padrão Decorator, cada adicional (Granola, Morango, Paçoca, etc.) precisa poder ser tratado como um Acai.
    //
    //Por isso, AcaiDecorator implementa a interface Acai. Assim, um decorator pode envolver outro decorator.
    //--------------------------------------------------------------------------------------------------------------------
    //Questão 3 (prática). O seu sistema já tem esta interface e estas duas classes:
    //
    //public interface Acai {
    //    String getDescricao();
    //    double getPreco();
    //}
    //
    //public class AcaiSimples implements Acai {
    //    public String getDescricao() {
    //        return "Açaí Simples";
    //    }
    //
    //    public double getPreco() {
    //        return 12.00;
    //    }
    //}
    //
    //public abstract class AcaiDecorator implements Acai {
    //    protected Acai acaiEmbrulhado;
    //
    //    public AcaiDecorator(Acai acai) {
    //        this.acaiEmbrulhado = acai;
    //    }
    //}
    //
    //No main:
    //
    //Crie um açaí só com granola e imprima a descrição e o preço.
    //Crie um açaí com granola e morango (um adicional embrulhando o outro) e imprima a descrição e o preço.

    public static void main(String[] args) {

        // Açaí com granola
        Acai acaiGranola = new Granola(new AcaiSimples());

        System.out.println(acaiGranola.getDescricao());
        System.out.println("R$ " + acaiGranola.getPreco());

        // Açaí com granola e morango
        Acai acaiGranolaMorango =
                new Morango(
                        new Granola(
                                new AcaiSimples()));

        System.out.println(acaiGranolaMorango.getDescricao());
        System.out.println("R$ " + acaiGranolaMorango.getPreco());
    }
}
