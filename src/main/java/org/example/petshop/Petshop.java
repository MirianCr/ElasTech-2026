package org.example.petshop;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Petshop {
    static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        Pet[] pets = new Pet[5];

        int opcao = -1;
        int total = 0;

        ArrayDeque<String> fila = new ArrayDeque<>();

        while (opcao != 0) {

            System.out.println("\n=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Buscar pet");
            System.out.println("4 - Mostrar espécies");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender próximo");
            System.out.println("7 - Executar serviços");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {

                    case 1:

                        if (total >= pets.length) {
                            System.out.println("Limite de pets atingido.");
                            break;
                        }

                        //Pet pet = new Pet();

                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Espécie: ");
                        String especie = sc.nextLine();

                        Pet pet;

                        if (especie.equalsIgnoreCase("Cachorro")) {
                            pet = new Cachorro();
                        } else if (especie.equalsIgnoreCase("Gato")) {
                            pet = new Gato();
                        } else {
                            pet = new Pet();
                        }

                        pet.nome = nome;
                        pet.especie = especie;

                        System.out.print("Peso: ");
                        pet.peso = sc.nextDouble();
                        sc.nextLine();

                        pet.porte = pet.definirPorte();

                        pets[total] = pet;
                        total++;

                        System.out.println(
                                "Pet cadastrado! Agora são "
                                        + total
                                        + " pet(s).");
                        break;

                    case 2:

                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println("\n--- PETS CADASTRADOS ---");

                            for (int i = 0; i < total; i++) {
                                System.out.println(
                                        pets[i].nome + " (" +
                                                pets[i].especie + ") - " +
                                                pets[i].peso + " kg - Porte " +
                                                pets[i].porte
                                );
                            }
                        }
                        break;

                    case 3:

                        System.out.print("Qual pet você procura? ");
                        String busca = sc.nextLine();

                        boolean achou = false;

                        for (int i = 0; i < total; i++) {

                            if (pets[i].nome.equalsIgnoreCase(busca)) {

                                System.out.println(
                                        "Encontrado: " +
                                                pets[i].nome + " (" +
                                                pets[i].especie + ") - " +
                                                pets[i].peso + " kg"
                                );

                                achou = true;
                                break;
                            }
                        }

                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }

                        break;

                    case 4:

                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                            break;
                        }

                        HashSet<String> especies = new HashSet<>();

                        for (int i = 0; i < total; i++) {
                            especies.add(pets[i].especie);
                        }

                        System.out.println("\n--- ESPÉCIES CADASTRADAS ---");

                        for (String item : especies) {
                            System.out.println("- " + item);
                        }

                        System.out.println("Total de espécies diferentes: " + especies.size());

                        break;

                    case 5:

                        System.out.print("Nome do pet pra entrar na fila: ");
                        String nomeFila = sc.nextLine();

                        fila.add(nomeFila);

                        System.out.println(nomeFila + " entrou na fila.");
                        System.out.println("Fila agora: " + fila);

                        break;

                    case 6:

                        if (fila.isEmpty()) {
                            System.out.println("A fila está vazia.");
                        } else {

                            System.out.println("Próximo da fila: " + fila.peek());

                            String atendido = fila.poll();

                            System.out.println("Atendendo " + atendido + "...");
                            System.out.println("Fila agora: " + fila);
                        }

                        break;
                    case 7:

                        System.out.print("Nome do pet: ");
                        String nomePet = sc.nextLine();

                        ArrayList<Servico> servicos = new ArrayList<>();

                        servicos.add(new Banho());
                        servicos.add(new Tosa());
                        servicos.add(new Consulta());

                        for (Servico servico : servicos) {
                            servico.executar(nomePet);
                        }

                        break;
                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");

                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine(); // limpa a entrada inválida

            }
        }

        sc.close();







        //Pet meuPet = new Pet();

//        meuPet.nome = "Mel";
//        meuPet.especie = "Cachorro";
//        meuPet.peso = 8.5;
//        meuPet.porte = meuPet.definirPorte();
//
//
//        pets[0] = meuPet;
//
//        System.out.println("--- PETS CADASTRADOS ---");
//        System.out.println(
//                pets[0].nome + " (" +
//                        pets[0].especie + ") - " +
//                        pets[0].peso + " kg - Porte " +
//                        pets[0].porte
//        );

//        System.out.println("=== FICHA DO PET: === \n");
//        System.out.println("Nome: " + meuPet.nome +
//                        " \nEspecie: " + meuPet.especie +
//                        "\nPeso: " + meuPet.peso +
//                        "\nPorte:" + meuPet.porte);






        //String nome;
        //String especie = "cachorro";
        //Double peso = 8.5;


//        System.out.println("=== FICHA DO PET: === \n");
//        System.out.println("Digite o nome: " );
//        String nome = sc.nextLine();
//
//        System.out.println("Digite a especie: ");
//        String especie = sc.nextLine();
//
//        System.out.println("Digite o peso: ");
//        double peso= sc.nextDouble();







       // System.out.println("Nome: " + nome);
       // System.out.println("Espécie:" + especie);
       // System.out.printf("Peso: %.1f kg", peso);
    }
}
