package br.com.ifpb.projetos.atividades.atividadeNovePoo.questaoUm;

import java.util.ArrayList;

public class EscolaTester {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Aluno("Weller", 26, "202410130032"));
        listaDePessoas.add(new Professor("Danyllo", 20, "Programaçao Orientada a Objetos"));

        for (Pessoa cadaPessoa : listaDePessoas){
            cadaPessoa.apresentar();
        }

    }
}
