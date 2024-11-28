package br.com.edu.ifpb.atividadeCincoPoo.questaoQuatro;

import java.util.Scanner;

public class inversorTester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Inversor frase = new Inversor();

        System.out.print("Informe uma String: ");
        frase.setFrase(teclado.nextLine());

        System.out.println("A String original e: " + frase.getFrase());
        System.out.println("A String convertida e: " + frase.getFraseConvertida());

        System.out.println("A quantidade de letras 'A' que aparecem na String e: " + frase.getQtdeA());
    }
}
