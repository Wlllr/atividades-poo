import java.util.Scanner;

public class Palavra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        int contador = 0;

        System.out.println("Escreva uma palavra: ");
        palavra = teclado.nextLine();
        //tamanho = palavra.length();

        palavra = palavra.toLowerCase();

        for(int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador = contador + 1;
            }
        }

        System.out.println("A palavra contem " + contador + " vogais.");
    }
}
