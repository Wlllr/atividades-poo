package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoDois;

public class UmaEscolaTester {
    public static void main(String[] args) {
        UmaPessoa pessoaQualquer = new UmaPessoa("John Doe", 25);
        UmAluno alunoQualquer = new UmAluno("Joao Ninguem", 20, "20201010214");
        UmProfessor professorQualquer = new UmProfessor("Elaine Cristina", 50, "Historia");

        System.out.println(pessoaQualquer);
        System.out.println(alunoQualquer);
        System.out.println(professorQualquer);
    }
}
