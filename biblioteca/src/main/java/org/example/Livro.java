package org.example;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;


    // Método para atribuir valores ao fabricante e modelo
    public void setLivro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;

    }

    // Exibir informações
    @Override
    public String toString () {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao;
    }
}

