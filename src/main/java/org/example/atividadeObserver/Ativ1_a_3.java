package org.example.atividadeObserver;

public class Ativ1_a_3 {


        //1 - Qual problema o padrão Observer resolve? Dê um exemplo do dia a dia que funcione como ele.
        //O padrão Observer resolve o problema de manter vários objetos informados quando ocorre uma mudança em outro objeto. Assim, quando algo muda, todos os interessados são notificados automaticamente.
        //
        //Exemplo do dia a dia: um canal de vídeos. Quando o canal publica um novo vídeo, todos os inscritos recebem uma notificação. O canal não precisa enviar manualmente para cada pessoa; ele apenas avisa os inscritos cadastrados.
        //----------------------------------------------------------------------------------------------------------------
        //2 - No Observer, o que é o Subject  e o que é o Observer? Como o Subject avisa os observadores sem conhecer as classes concretas deles?
        //Subject (Sujeito): é o objeto que possui a informação ou o estado que pode mudar. Exemplo: Pedido.
        //Observer (Observador): é quem deseja ser avisado quando ocorre uma mudança. Exemplo: Cliente, Restaurante ou Entregador.
        //
        //O Subject mantém uma lista de observadores cadastrados e normalmente conhece apenas a interface Observer. Quando uma mudança acontece, ele percorre a lista e chama um método.
        //o Subject não precisa conhecer as classes concretas (Cliente, Entregador, etc.), apenas a interface que todos implementam.
        //---------------------------------------------------------------------------------------------------------------------------
        //3 - Se você precisar adicionar um novo interessado, por exemplo um Entregador que também precisa saber quando o pedido muda de status, o que é preciso alterar na classe Pedido? Por quê?
        //Não é necessário alterar a lógica principal da classe Pedido.
        //
        //Basta criar uma nova classe e Depois, cadastrar o entregador no pedido
        //Isso é possível porque o padrão Observer segue o princípio de que o sistema pode ser estendido sem modificar o código já existente. A classe Pedido continua notificando qualquer objeto que implemente a interface Observer.

}
