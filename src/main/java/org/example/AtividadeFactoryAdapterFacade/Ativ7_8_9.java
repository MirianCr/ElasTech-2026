package org.example.AtividadeFactoryAdapterFacade;

public class Ativ7_8_9 {
    //Facade
    //
    //Questão 7. Explique com suas palavras qual problema o Facade resolve. Se quiser, use o exemplo do síndico do condomínio ou crie outro.

    //O padrão Facade serve para simplificar o uso de um sistema complexo, criando uma única classe que reúne várias operações e oferece uma interface mais fácil para o cliente.
    //
    //Um exemplo é o do síndico de um condomínio. Imagine que um morador precisa resolver vários assuntos: manutenção, segurança, limpeza e jardinagem. Em vez de falar diretamente com cada equipe, o morador fala apenas com o síndico. O síndico recebe a solicitação e encaminha para os setores corretos.
    //
    //Na programação, o Facade funciona da mesma forma. Em vez de o código cliente acessar várias classes e métodos diferentes, ele usa apenas a classe Facade, que coordena tudo internamente. Isso deixa o código mais organizado, simples de usar e com menor acoplamento entre as classes.
    //-----------------------------------------------------------------------------------------------------------------------------
    //Questão 8. Marque V (verdadeiro) ou F (falso):
    //• (F ) A fachada precisa implementar uma interface.
    //• (V ) A fachada guarda as classes envolvidas no processo em atributos.
    //• (F) Depois que a fachada existe, é proibido usar as outras classes diretamente.
    //
    //-----------------------------------------------------------------------------------------------------------------------------
    //Questão 9 (prática). Você já tem estas três classes:
    //public class Despertador {
    //    public void desligar() {
    //        System.out.println("Despertador desligado.");
    //    }
    //}
    //public class Cafeteira {
    //    public void fazerCafe() {
    //        System.out.println("Café pronto.");
    //    }
    //}
    //public class Chuveiro {
    //    public void ligar() {
    //        System.out.println("Chuveiro ligado.");
    //    }
    //}
    //Crie a classe ManhaFacade com um método acordar() que desligue o despertador, faça o café e ligue o chuveiro, nessa ordem.
    //No main, use só a fachada: crie um objeto ManhaFacade e chame acordar().

    public static void main(String[] args) {

        ManhaFacade manhaFacade = new ManhaFacade();
        manhaFacade.acordar();
    }
}
