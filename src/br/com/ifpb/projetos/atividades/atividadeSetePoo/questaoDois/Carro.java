package br.com.ifpb.atividadeSetePoo.questaoDois;

public class Carro {

    String modelo;
    String chassi;
    String marca;
    int ano;

    public Carro(String modelo, String chassi, String marca, int ano){
        this.modelo = modelo;
        this.chassi = chassi;
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public boolean equals(Object umCarro){
        if ( umCarro == this){
            return true;
        }

        if (!(umCarro instanceof Carro)){
            return false;
        }

        Carro novoCarro = (Carro) umCarro;

        return marca.equals(novoCarro.marca);
    }

}
