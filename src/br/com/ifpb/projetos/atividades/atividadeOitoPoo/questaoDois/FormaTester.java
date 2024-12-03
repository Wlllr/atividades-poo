package br.com.ifpb.projetos.atividades.atividadeOitoPoo.questaoDois;

public class FormaTester {
    public static void imprimirArea(Forma forma){
        System.out.printf("Area: %.2f \n", forma.calcularArea());
    }

    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma retangulo = new Retangulo(4,3);

        imprimirArea(circulo);
        imprimirArea(retangulo);
    }
}
