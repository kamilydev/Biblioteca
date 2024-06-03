package org.example;
import java.util.ArrayList;
import java.util.*;

public class Biblioteca {
    public List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
