package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoQuatro;

import java.time.LocalDate;
import java.time.Period;

public class Evento {
    private String nome;
    private LocalDate data;

    Evento(String nome, String datastr){
        this.nome = nome;
        this.data = LocalDate.parse(datastr);
    }

    void tempoRestanteEvento(){
        LocalDate hoje = LocalDate.now();

        if (data.isAfter(hoje)){
            Period periodo = Period.between(hoje, data);
            System.out.println("Faltam " + periodo.getMonths() + " meses e "
                    + periodo.getDays() + " dias para o evento " + nome + ".");
        } else {
            System.out.println("O evento " + nome + " ja ocorreu ou e hoje.");
        }

    }
}
