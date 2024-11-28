import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa primeiraPessoa = new Pessoa();

        System.out.println("Informe a sua idade: ");
        primeiraPessoa.idade = teclado.nextInt();

        if (primeiraPessoa.idade >= 18){
            System.out.println("Voce tem " + primeiraPessoa.idade + " anos voce e maior de idade!");
        } else{
            System.out.println("Voce tem " + primeiraPessoa.idade + " anos voce e menor de idade.");
        }
    }
}
