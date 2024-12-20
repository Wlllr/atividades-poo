package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoDois;

public class UmaPessoa {
    private String nome;
    private int idade;

    UmaPessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return "Pessoa{" +
                "nome'" + nome + '\'' +
                ", idade =" + idade + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
