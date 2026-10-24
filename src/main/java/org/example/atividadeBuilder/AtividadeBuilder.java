package org.example.atividadeBuilder;

public class AtividadeBuilder {
    // Refatore seu código da atividade de construtor com o Builder (Pode utilizar lombok).
        public static void main(String[] args) {

            Agendamento a1 = Agendamento.builder()
                    .nomePet("Thor")
                    .servico("banho")
                    .horario("14h")
                    .perfume(true)
                    .laco(true)
                    .hidratacao(false)
                    .observacao("alérgico a shampoo")
                    .desconto(10)
                    .build();

            Agendamento a2 = Agendamento.builder()
                    .nomePet("Luna")
                    .servico("tosa")
                    .horario("10h")
                    .build();

            Agendamento a3 = Agendamento.builder()
                    .nomePet("Mel")
                    .servico("banho")
                    .horario("16h")
                    .hidratacao(true)
                    .build();

            a1.mostrar();
            a2.mostrar();
            a3.mostrar();
        }
    }







//   public class Agendamento {
//       private String nomePet;
//       private String servico;
//       private String horario;
//       private boolean perfume;
//       private boolean laco;
//       private boolean hidratacao;
//       private String observacao;
//       private double desconto;
//
//       public Agendamento(String nomePet, String servico, String horario,
//                          boolean perfume, boolean laco, boolean hidratacao,
//                          String observacao, double desconto) {
//
//           this.nomePet = nomePet;
//           this.servico = servico;
//           this.horario = horario;
//           this.perfume = perfume;
//           this.laco = laco;
//           this.hidratacao = hidratacao;
//           this.observacao = observacao;
//           this.desconto = desconto;
//       }
//
//       public void mostrar() {
//           System.out.println("Pet: " + nomePet);
//           System.out.println("Serviço: " + servico);
//           System.out.println("Horário: " + horario);
//           System.out.println("Perfume: " + perfume);
//           System.out.println("Laço: " + laco);
//           System.out.println("Hidratação: " + hidratacao);
//           System.out.println("Observação: " + observacao);
//           System.out.println("Desconto: " + desconto + "%");
//           System.out.println("----------------------");
//       }

