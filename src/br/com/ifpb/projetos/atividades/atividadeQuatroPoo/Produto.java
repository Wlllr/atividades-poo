public class Produto {
    String nome;
    double preco;

    static void desconto(double preco) {
        double valorDescontado;
        if (preco > 100) {
            valorDescontado = preco - (preco * 0.10);
            System.out.println("Preco: " + preco);
            System.out.println("Desconto de " + preco * 0.10);
            System.out.println("valor total a pagar: " + valorDescontado);
        } else {
            valorDescontado = preco - (preco * 0.05);
            System.out.println("Preco: " + preco);
            System.out.println("Desconto de " + preco * 0.05);
            System.out.println("Valor total a pagar: " + valorDescontado);
        }
    }
}