package org.example;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;


    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;

    }

    @Override
    public String toString () {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao;
    }

}

