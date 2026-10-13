package org.example.aula14.Heranca;

    public class Professora extends Pessoa {

        String disciplina;


        @Override
        public void apresentar(){
            System.out.println("Oi, sou " + nome + "e ensino " + disciplina + ".");
        }

        public void lancarNota(String aluna, double nota) {
            System.out.printf("%s lançou nota %.1f para %s%n",
                    nome, nota, aluna);
        }

}
