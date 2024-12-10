package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoDois;

public class UmAluno extends UmaPessoa{
    private String matricula;

    UmAluno(String nome, int idade, String matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                "} " ;
    }
}
