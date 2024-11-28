package br.com.edu.ifpd.questaoDois;
public class SequenciaFibonacci {

    public void sequenciaFibonacciFor() {
        int a = 0, b = 1, temp = 0;

        System.out.println("Sequencia de Fibonacci com For: ");
        System.out.print(a + " " + b);

        for (int i = 3; i <= 10; i++) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.print(" " + temp);
        }
        System.out.println("\n");
    }

    public void sequenciaFibonacciWhile() {
        int a = 0, b = 1, temp = 0, i = 3;

        System.out.println("Sequencia de Fibonacci com While: ");
        System.out.print(a + " " + b);
        while (i <= 10) {
            temp = a + b;
            a = b;
            b = temp;

            System.out.print(" " + temp);

            i++;
        }
        System.out.println("\n");
    }

    public void sequenciaFibonacciDoWhile() {
        int a = 0, b = 1, temp = 0, i = 3;
        System.out.println("Sequencia de Fibonacci com While: ");
        System.out.print(a + " " + b);
        do {
            temp = a + b;
            a = b;
            b = temp;

            System.out.print(" " + temp);

            i++;
        } while (i <= 10);

        System.out.println("\n");
    }
}