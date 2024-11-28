package br.com.ifpb.atividadeSetePoo.questaoUm;

public class Livro {
    public Livro(String titulo){
        System.out.println(titulo);
    }

    public Livro(String titulo, String autor){
        System.out.println(titulo + autor);
    }

    public Livro(String titulo, String autor, int anoPub){
        System.out.println(titulo + autor + anoPub);
    }
}
