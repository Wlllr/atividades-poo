package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoUm;

public class Aluno extends Pessoa{

    private String matricula;

    Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    void apresentar(){
        System.out.println("Meu nome e " + getNome() + " e tenho " + getIdade()
                + " de idade minha matricula e " + getMatricula());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
