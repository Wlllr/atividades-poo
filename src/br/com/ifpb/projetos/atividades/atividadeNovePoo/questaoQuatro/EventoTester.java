package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoQuatro;

public class EventoTester {
    public static void main(String[] args) {

        Evento entregaProjeto = new Evento("Projeto de Estrutura de Dados", "2024-12-20");
        entregaProjeto.tempoRestanteEvento();

        Evento prova = new Evento("Prova de POO", "2024-12-10");
        prova.tempoRestanteEvento();

    }
}
