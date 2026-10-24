package org.example.atividadeSingleton;

//1. O que o padrão Singleton garante?
//a) Que a classe tenha vários construtores
//b) Que exista apenas um objeto da classe no programa **
//c) Que a classe não tenha atributos
//d) Que a classe possa ser herdada

//Resposta:
//letra B-Que exista apenas um objeto da classe no programa
//O padrão Singleton garante que uma classe tenha uma única instância durante toda a execução da aplicação e fornece um ponto global de acesso a essa instância.

//------------------------------------------------------------------------------------------------------------------

//2. Por que o construtor de um Singleton é private?
//O construtor de um Singleton é private para impedir a criação direta de objetos da classe e garantir que exista apenas uma única instância.
//------------------------------------------------------------------------------------------------------------------

//3. Complete a lacuna:
//
//java
//private ______ Configuracao instancia;
//a) final
//b) public
//c) static **
//d) void
//Resposta: letra c-static porque deve pertencer à classe e não a um objeto específico. Assim, existe apenas uma variável compartilhada que guarda a única instância do Singleton.

//------------------------------------------------------------------------------------------------------------------
//4. O que acontece se alguém tentar escrever isto fora da classe?
//
//java
//Configuracao c = new Configuracao();
//Aparece a mensagem de erro:
//Configuracao() has private access in Configuracao
//Resposta:
//Se a classe Configuracao foi implementada corretamente com o construtor private
//fora da própria classe, ocorrerá um erro de compilação, porque o construtor não é acessível.
//Aparece a mensagem de erro: Configuracao() has private access in Configuracao
//O código não compila, pois o construtor é private e não pode ser acessado fora da classe.

//------------------------------------------------------------------------------------------------------------------
//5. Qual é a forma correta de obter o objeto de um Singleton chamado Configuracao?
//a) new Configuracao()
//b) Configuracao.getInstancia()**
//c) Configuracao.instancia
//d) this.getInstancia()
//Resposta:
//No padrão Singleton, o construtor da classe é private, por isso existe um método estático que retorna a única instância da classe
//------------------------------------------------------------------------------------------------------------------

