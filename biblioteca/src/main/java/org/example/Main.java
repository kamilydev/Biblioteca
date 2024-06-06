package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação de objeto Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        int opcao = 0;
        int qtdCadastro = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("## Escolha quais ferramentas deseja utilizar ##");
            System.out.println("Opção 1 - Cadastrar um livro");
            System.out.println("Opção 2 - Consultar os livros cadastrados");
            System.out.println("Opção 0 - Encerrar programa");
            System.out.println("_______________________");

            System.out.print("Digite aqui sua opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 1) {

                // Solicita o número de professores que o usuário deseja criar
                System.out.print("Quantos livros você deseja cadastrar? ");
                qtdCadastro = scanner.nextInt();
                scanner.nextLine(); // Consome a nova linha deixada pelo nextInt

                for (int i = 0; i < qtdCadastro; i++) {
                    System.out.println("@@@@@@@ Dados do livro " + (i + 1) + " @@@@@@@");

                    // Solicita o titulo do livro
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();

                    // Solicita o autor do livro
                    System.out.print("Digite o(a) autor(a) do livro: ");
                    String autor = scanner.nextLine();

                    // Solicita o ano de publicação do livro
                    System.out.print("Digite o ano de publicação do livro: ");
                    int anoPublicacao = Integer.parseInt(scanner.nextLine());

                    Livro novoLivro = new Livro();
                    novoLivro.setLivro(titulo, autor, anoPublicacao);

                    // Adicionando livro à biblioteca
                    biblioteca.adicionarLivro(novoLivro);
                    System.out.println("Livro adicionado com sucesso!");
                };

            } else if (opcao == 2) {
                // Listando todos os livros presentes na biblioteca
                System.out.println("********* Livros cadastrados *********");
                biblioteca.listarLivros();

            } else if (opcao == 0) {
                System.out.println("Aplicação encerrada");

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
