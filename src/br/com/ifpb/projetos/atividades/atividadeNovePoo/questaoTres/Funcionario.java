package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoTres;

public class Funcionario implements Pagavel{
    private double salarioFixo;

    public Funcionario(double salario){
        this.salarioFixo = salario;
    }

    @Override
    public double calcularPagamento(){
        return salarioFixo;
    }
}
