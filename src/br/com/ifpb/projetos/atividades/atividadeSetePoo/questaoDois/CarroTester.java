package br.com.ifpb.atividadeSetePoo.questaoDois;

public class CarroTester {
    public static void main(String[] args) {
        Carro ferrariNumberTen = new Carro("Esportivo", "201", "Volkswagen", 1998);
        Carro fusca = new Carro("Popular", "1020", "Volkswagen", 1981);

        System.out.println(ferrariNumberTen.equals(fusca));

    }
}
