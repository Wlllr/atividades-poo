package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoTres;

public class PagamentoTester {
    public static void main(String[] args) {
        Pagavel funcionarioPadrao = new Funcionario(1500.0);
        Pagavel funcionarioFleelancer = new Freelancer(10.0, 100);

        exibirPagamento(funcionarioPadrao);
        exibirPagamento(funcionarioFleelancer);

    }

    static void exibirPagamento(Pagavel pagamento){
        System.out.println("Pagamento: " + pagamento.calcularPagamento());
    }
}
