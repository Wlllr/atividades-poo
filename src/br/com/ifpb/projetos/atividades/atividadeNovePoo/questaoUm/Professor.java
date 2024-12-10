package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoUm;

public class Professor extends Pessoa{
    private String disciplinaMatriculada;

    Professor(String nome, int idade, String disciplinaMatriculada) {
        super(nome, idade);
        this.disciplinaMatriculada = disciplinaMatriculada;
    }

    @Override
    void apresentar(){
        System.out.println("Meu nome e " + getNome() + " e tenho " + getIdade()
                + " de idade a disciplina que eu lenciono e " + getDisciplinaMatriculada());
    }

    public String getDisciplinaMatriculada() {
        return disciplinaMatriculada;
    }

    public void setDisciplinaMatriculada(String disciplinaMatriculada) {
        this.disciplinaMatriculada = disciplinaMatriculada;
    }
}
