import java.util.Scanner;

public class LerNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero, acumulador = 0;

        System.out.println("Informe um numero: ");
        numero = teclado.nextDouble();

        while (numero != 0) {
            acumulador = acumulador + numero;

            System.out.println("Informe um numero: ");
            numero = teclado.nextDouble();
        }
        System.out.printf("O valor total e igual a %.2f", acumulador);
    }
}
