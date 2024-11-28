package br.com.ifpb.atividadeSetePoo.questaoTres;
import java.util.ArrayList;
import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        ArrayList<String> listaDeAlunos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String aluno;

        do {
            System.out.println("Qual o nome do aluno: ");
            aluno = teclado.nextLine();

            if (aluno.equals("")){
                break;
            } else {
                listaDeAlunos.add(aluno);
            }

        } while (true);

        System.out.println("Lista de alunos: ");
        for( String cadaAluno : listaDeAlunos){
            System.out.println(cadaAluno);
        }
    }
}
