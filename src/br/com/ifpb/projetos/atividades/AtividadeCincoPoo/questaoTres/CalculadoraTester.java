package br.com.edu.ifpb.questaoTres;

import java.util.Scanner;

public class CalculadoraTester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CalculadoraComSwitch resultado = new CalculadoraComSwitch();

        char opereacao;
        double primeiro, segundo;

        System.out.print("Informe o primeiro numero: ");
        primeiro = teclado.nextDouble();
        System.out.print("Informe o segundo numero: ");
        segundo = teclado.nextDouble();

        System.out.print("Informe a operacao que deseja realizar: \n" +
                " + -> Adicao \n" +
                " - -> Subtracao \n " +
                "/ -> Divisao \n" +
                "* -> Multiplicacao \n");
        opereacao = teclado.next().charAt(0);

        switch (opereacao){
            case '+':
                System.out.println("O resultado da operacao de adicao e: " + resultado.soma(primeiro, segundo));
                break;
            case '-':
                System.out.println("O resultado da operacao de subtracao e: " + resultado.subtracao(primeiro, segundo));
                break;
            case '/':
                System.out.println("O resultado da operacao de divisao e: " + resultado.divisao(primeiro, segundo));
            case '*':
                System.out.println("O resultado da operacao de multiplicaco e: " +  resultado.multiplicacao(primeiro, segundo));
                break;
            default:
                System.out.println("Operacao invalida!");
        }


    }
}
