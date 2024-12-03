package br.com.ifpb.projetos.atividades.atividadeOitoPoo.questaoTres;

public class Estudante extends Pessoa {
    private String matricula;

    public Estudante(String nome, int idade, String matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /*
    //Outra forma de exibir as informacoes
    public void exibirInformacao(){

        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matricula: " + getMatricula());
    }
    */

    //Forma que optei para mostrar as informacoes
    @Override
    public String toString() {
        return "Estudante{" +
                "matricula='" + matricula + '\'' +
                "} " + super.toString();
    }
}
