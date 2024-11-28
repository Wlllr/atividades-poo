import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, acumulador = 1;

        System.out.println("Informe um numero: ");
        numero = teclado.nextInt();

        for (int i = numero; i > 0; i--){
            acumulador = (acumulador * i);
        }
        System.out.printf("O fatorial de %d e igual a %d", numero, acumulador);
    }
}
