package br.com.ifpb.projetos.atividades.atividadeOitoPoo.questaoUm;

public class CarroTester {
    public static void main(String[] args) {
        //Usando o construtor padrão/vazio
        Carro c1 = new Carro();
        c1.setModelo("Passat");
        c1.setDataFabricacao("1974");

        //Usando construtor com apenas um parametro
        Carro c2 = new Carro("Ecosport Freestyle");
        c2.setDataFabricacao("2019");

        //usando o construtor com dois parametros
        Carro c3 = new Carro("Fusca", "1995");

        //imprimir informações
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }

}
