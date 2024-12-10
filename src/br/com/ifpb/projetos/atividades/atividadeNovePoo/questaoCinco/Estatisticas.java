package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoCinco;

import java.util.Collections;
import java.util.List;

public class Estatisticas {
    public static double media(List<Integer> numeros) {
        if (numeros.isEmpty()) return 0;
        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        return (double) soma / numeros.size();

    }

    public static int maximo(List<Integer> numeros) {
        return Collections.max(numeros);
    }
}
