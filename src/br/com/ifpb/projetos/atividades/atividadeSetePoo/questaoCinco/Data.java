package br.com.ifpb.atividadeSetePoo.questaoCinco;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Informe a data de nascimento (yyyy-mm-dd): ");
        LocalDate dataNasc = LocalDate.parse(teclado.nextLine());
        LocalDate currentDate = LocalDate.now();

        System.out.println("Data de Nascimento: " + dataNasc);
        Period w = Period.between(dataNasc, currentDate);

        System.out.printf("A sua idade e: %d anos, %d meses, %d dias%n", w.getYears(), w.getMonths(), w.getDays());

        System.out.println();

        LocalDate startDate = LocalDate.now();
        System.out.print("Informe o ano do proximo aniversario: (yyyy-mm-dd): ");
        LocalDate endDate = LocalDate.parse(teclado.nextLine());

        Period p = Period.between(startDate, endDate);
        System.out.printf("Faltam: %d anos, %d meses, %d dias para o seu aniversario!%n", p.getYears(), p.getMonths(), p.getDays());
    }
}
