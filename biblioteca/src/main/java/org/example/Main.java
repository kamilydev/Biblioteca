package org.example;



public class Main {
    public static void main(String[] args) {
        // Criação de objetos Livro
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("O Alquimista", "Paulo Coelho", 1988);

        // Criação de objeto Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Listando todos os livros presentes na biblioteca
        biblioteca.listarLivros();
        }
    }
