package org.example.aula14.Heranca;

public class AtividHeranca5 {
    public static void main(String[] args) {
        //5. Faça uma cadeia de três níveis:
        //   - Funcionario, com o atributo nome e o método baterPonto() ok
        //   - Gerente extends Funcionario, com aprovarFerias(String quem) ok
        //   - Diretora extends Gerente, com definirMeta(String meta) ok
        //
        //   Na Main, crie uma Diretora, preencha o nome dela
        //   (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.
        //
        //   Herança em cadeia: ela tem tudo que vem de cima.

       Diretora carla = new Diretora();

       carla.nome = "Carla";

       carla.baterPonto();
       carla.aprovarFerias("Ana");
       carla.definirMeta("Aumentar as vendas em 20%");
    }
}
