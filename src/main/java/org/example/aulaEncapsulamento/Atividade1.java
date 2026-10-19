package org.example.aulaEncapsulamento;

public class Atividade1 {
    static void main(String[] args) {

    //ATIVIDADE - Encapsulamento e Modificadores de Acesso
    //
    //Referência geral:
    //
    //class Coisa {
    //    private String atributo;          // fechado pra fora
    //
    //    public String getAtributo() {     // getter: devolve
    //        return atributo;
    //    }
    //
    //    public void setAtributo(String atributo) {   // setter: recebe
    //        this.atributo = atributo;     // this: qual é qual
    //    }
    //}
    //
    //
    //1. (sentir o private na pele)
    //
    //   Crie a classe ContaBancaria com os atributos titular (String) e
    //   saldo (double), os DOIS private.
    //
    //   Na Main, crie uma conta e tente fazer estas duas linhas:
    //
    //   System.out.println(c.titular);
    //   c.saldo = -5000;
    //
    //   Rode e LEIA o erro.
        // java: titular has private access in org.example.aulaEncapsulamento.ContaBancaria
    //
    //   Saída esperada:
    //
    //   error: titular has private access in ContaBancaria
    //   error: saldo has private access in ContaBancaria
       // Quando um atributo é declarado como private, ele só pode ser acessado dentro da própria classe.
    //
    //    Agora a classe está fechada demais — não dá pra fazer nada
    //      com ela. As próximas questões abrem as portas, uma por uma.
    ContaBancaria c = new ContaBancaria();

//        System.out.println(c.titular);
//        c.saldo = -500;
}
}

