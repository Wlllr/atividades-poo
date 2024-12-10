package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoCinco;


import java.util.ArrayList;
import java.util.List;

public class EstatisticasTester {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);

        System.out.println("Média: " + Estatisticas.media(lista));
        System.out.println("Máximo: " + Estatisticas.maximo(lista));
    }
}
