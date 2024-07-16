package br.com.desafio.poo;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    void exibirDetalhes() {
        System.out.println("Título: "+getTitulo());
        System.out.println("Autor: "+getAutor());
    }
}
