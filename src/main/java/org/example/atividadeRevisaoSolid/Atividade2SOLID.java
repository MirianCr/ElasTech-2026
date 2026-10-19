package org.example.atividadeRevisaoSolid;

public class Atividade2SOLID {
    //Questão 2: SOLID
    //Para cada código abaixo, diga qual princípio do SOLID está sendo violado e explique como você corrigiria.
    //
    //a)
    //Princípio violado: Viola SRP → uma classe com várias responsabilidades.
    //SRP (Single Responsibility Principle - Princípio da Responsabilidade Única)
    //
    //A classe Relatorio está fazendo muitas coisas diferentes:
    //Para corrigir devo separar cada responsabilidade em sua própria classe.


    //java
    //class Relatorio {
    //    void calcularTotais() { /* ... */ } //CALCULA DADOS
    //    void formatarEmPdf() { /* ... */ } //GERA PDF
    //    void salvarNoDisco() { /* ... */ } //SALVA ARQUIVO
    //    void enviarPorEmail() { /* ... */ } //ENVIA EMAIL
    //}

    //SEPARANDO CADA UM EM SUA CLASSE(Assim cada classe tem apenas uma responsabilidade.)
    class Relatorio {
        void calcularTotais() { }
    }

    class GeradorPdf {
        void formatarEmPdf() { }
    }

    class SalvarArquivo {
        void salvarNoDisco() { }
    }

    class EnviadorEmail {
        void enviarPorEmail() { }
    }
//=========================================================================================
    //b)
    //java
    //class EnviadorEmail {
    //    void enviar(String tipo) {
    //        if (tipo.equals("aniversario")) {
    //            System.out.println("Feliz aniversário!");
    //        } else if (tipo.equals("seguranca")) {
    //            System.out.println("Alerta de segurança!");
    //        } else if (tipo.equals("promocao")) {
    //            System.out.println("Promoção imperdível!");
    //        }
    //    }
    //}

    //Princípio violado: Viola OCP → precisa ser modificada sempre que surge um novo tipo de e-mail.
    //OCP (Open/Closed Principle - Princípio Aberto/Fechado)
    //Toda vez que surgir um novo tipo de e-mail, será necessário alterar a classe:
    //else if (tipo.equals("cobranca")) { ... }
    //A classe não está fechada para modificações.

    //Pra corrigir devo criar uma interface e uma classe para cada tipo de mensagem.

    interface Mensagem {
        void enviar();
    }
    class MensagemAniversario implements Mensagem {
        public void enviar() {
            System.out.println("Feliz aniversário!");
        }
    }
    class MensagemSeguranca implements Mensagem {
        public void enviar() {
            System.out.println("Alerta de segurança!");
        }
    }
    class MensagemPromocao implements Mensagem {
        public void enviar() {
            System.out.println("Promoção imperdível!");
        }
    }

//======================================================================================================
    //c)
    //java
    //class PedidoService {
    //    private MySQLRepositorio repo = new MySQLRepositorio();
    //
    //    void finalizar() {
    //        repo.salvar();
    //    }
    //}

    //Princípio violado:Viola DIP → depende diretamente de MySQLRepositorio em vez de depender de uma abstração.
    //
    //DIP (Dependency Inversion Principle - Princípio da Inversão de Dependência)
    //PedidoService depende diretamente de uma implementação concreta:MySQLRepositorio
    //Se amanhã o banco mudar para PostgreSQL ou MongoDB, a classe precisará ser alterada.

    //PARA CORRIGIR
    //Fazer a dependência de uma abstração (interface).
    interface Repositorio {
        void salvar();
    }
    class MySQLRepositorio implements Repositorio {
        public void salvar() {
            System.out.println("Salvando no MySQL");
        }
        class PedidoService {

            private Repositorio repo;

            public PedidoService(Repositorio repo) {
                this.repo = repo;
            }

            void finalizar() {
                repo.salvar();
            }
        }

        Repositorio repo = new MySQLRepositorio();

        PedidoService pedido = new PedidoService(repo);

        //pedido.finalizar();
        //Assim, PedidoService depende da interface Repositorio, e não de uma implementação específica.
    }

}
