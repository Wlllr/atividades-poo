package br.com.ifpb.atividadeSetePoo.questaoQuatro;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x;

        System.out.println("Informe o lado do quadro: ");
        System.out.println("A Area do quaro e igul a: " + calculaAreaQuadrado(teclado.nextDouble()));
    }

    public static double calculaAreaQuadrado(double lado){
        return (lado*lado);
    }
}
