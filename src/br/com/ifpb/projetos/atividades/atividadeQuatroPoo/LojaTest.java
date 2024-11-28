import java.util.Scanner;

public class LojaTest {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto primeiroProduto = new Produto();

        primeiroProduto.nome = "Cafe";
        System.out.println("Informe o valor: ");
        primeiroProduto.preco = teclado.nextDouble();

        primeiroProduto.desconto(primeiroProduto.preco);
        
    }
}
