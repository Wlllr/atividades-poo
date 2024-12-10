package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoTres;

public class Freelancer implements Pagavel{
    private double valorHora;
    private int horasTrabalhadas;

    Freelancer(double valorHora, int horasTrabalhadas){
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularPagamento(){
        return valorHora * horasTrabalhadas;
    }
}
