package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoDois;

public class UmProfessor extends UmaPessoa{
    private String disciplinaMinistrada;

    UmProfessor(String nome, int idade, String disciplinaMinistrada){
        super(nome, idade);
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "disciplinaMinistrada='" + disciplinaMinistrada + '\'' +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                "} ";
    }
}
