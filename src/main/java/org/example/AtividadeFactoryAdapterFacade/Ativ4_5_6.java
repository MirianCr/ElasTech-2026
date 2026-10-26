package org.example.AtividadeFactoryAdapterFacade;

public class Ativ4_5_6 {
    //Adapter
//
//Questão 4. Seu sistema precisa usar uma classe de pagamento de outra empresa, mas ela não implementa a sua interface. Por que não dá para simplesmente escrever implements na classe dela? O que você faz no lugar?

//Não dá para simplesmente escrever implements na classe da outra empresa porque ela já foi criada por terceiros e normalmente não temos acesso ao código-fonte para modificá-la. Além disso, alterar uma biblioteca externa não é uma boa prática, pois futuras atualizações poderiam sobrescrever nossas modificações.
//
//Nessa situação, utilizamos o padrão Adapter (Adaptador).
//Não é possível simplesmente adicionar implements em uma classe de outra empresa porque geralmente não temos acesso ao seu código-fonte e não devemos modificar bibliotecas externas. Nesses casos, utilizamos o padrão Adapter, criando uma classe adaptadora que implementa a interface esperada pelo sistema e faz a comunicação com a classe externa. Dessa forma, conseguimos integrar componentes de terceiros sem alterar seu código original.
//
//O Adapter cria uma classe intermediária que implementa a interface esperada pelo nosso sistema e internamente utiliza a classe da empresa parceira.
//-----------------------------------------------------------------------------------------------------------------
//Questão 5. Em um Adapter, onde fica a tradução (por exemplo, a conversão de dólar para real)?
//• a) Na classe de fora
//• b) Na interface
//•** c) No método implementado da interface, dentro do adapter ***
//• d) No main, antes de chamar o método
//
//Resposta letra c) O objetivo do Adapter é traduzir uma interface para outra. Portanto, qualquer conversão necessária (como dólar para real, metros para centímetros, formatos de data, etc.) deve ficar dentro do Adapter.
//---------------------------------------------------------------------------------------------------------------
//Questão 6 (prática). O seu sistema usa esta interface:
//public interface Pagamento {
//    void pagar();
//}
//Você recebeu esta classe de outra empresa. Ela não pode ser alterada:
//public class PayPalAPI {
//    public void sendPayment() {
//        System.out.println("Pagamento enviado pelo PayPal.");
//    }
//}
//Crie a classe PayPalAdapter, para que o sistema consiga usar o PayPal como um Pagamento. Não precisa fazer nenhuma conversão: o método pagar() só precisa chamar o método da classe de fora.
//No main:
//1. Escreva, como comentário, a linha que tentaria usar PayPalAPI direto como Pagamento (a que não compila).
//2. Crie uma variável do tipo Pagamento usando o adapter e chame pagar().

    public static void main(String[] args) {

    // Pagamento pagamento = new PayPalAPI(); // Não compila

    Pagamento pagamento = new PayPalAdapter(new PayPalAPI());
    pagamento.pagar();
}
}
