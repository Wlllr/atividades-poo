import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota;

        System.out.println("Informe a sua nota: ");
        nota = teclado.nextDouble();

        if (nota >= 0 && nota < 50) {
            System.out.printf("Insuficiente. Sua nota foi %.2f ", nota);
        } else if (nota >= 50 && nota < 70) {
            System.out.printf("Suficiente. Sua nota foi %.2f", nota);
        } else if (nota >= 70 && nota < 90) {
            System.out.printf("Bom. Sua nota foi %.2f", nota);
        } else if (nota >= 90 && nota <= 100) {
            System.out.printf("Excelente. Sua nota foi %.2f", nota);
        } else {
            System.out.println("Formato de nova invalida tente novamente.");
        }
    }
}
