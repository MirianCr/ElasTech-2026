package org.example.AtividadeFactoryAdapterFacade;

public class Ativ1e2 {
    //Factory
    //
    //Questão 1. Explique com suas palavras qual problema o Factory resolve. O que aconteceria se os ifs que decidem qual objeto criar ficassem espalhados pelo main e por outras partes do programa, e depois surgisse um tipo novo?

    //Factory resolve o problema de centralizar a criação de objetos.
    //Em vez de espalhar vários if e switch pelo programa para decidir qual classe instanciar, essa responsabilidade fica concentrada em uma única classe.Isso aumenta o risco de erros, dificulta a manutenção e deixa o código repetido.
    //
    //Com o Factory, a lógica de criação fica em apenas um lugar. Quando um novo tipo é criado, normalmente basta alterar a fábrica, sem precisar procurar e modificar várias partes do programa.
    //
    //Questão 2. O método da fábrica normalmente devolve o objeto criado com qual tipo?
    //• a) O tipo da classe concreta (ex.: Cachorro)
    //• b) O tipo da interface (ex.: Animal) ***
    //• c) String
    //• d) Não devolve nada (void)
    //Resposta: B - O tipo da interface (ex.: Animal)
    //A variável recebe o tipo Animal (interface), e não o tipo concreto Cachorro.
    //
}
