package br.com.edu.ifpb.questaoUm;

public class PessoaUm {
    private String nome;
    private int idade;

    public PessoaUm(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public PessoaUm(){
        this.nome = "";
        this.idade = 0;
    }

    @Override
    public String toString(){
        return "Nome{nome='" + this.nome + "', idade=" + this.idade + "}";
    }

}

