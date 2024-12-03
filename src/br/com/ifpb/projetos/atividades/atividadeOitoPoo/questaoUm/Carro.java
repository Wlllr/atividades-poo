package br.com.ifpb.projetos.atividades.atividadeOitoPoo.questaoUm;

public class Carro {
    private String modelo;
    private String dataFabricacao;

    public Carro(){
        super();
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public Carro(String modelo, String dataFabricacao) {
        this.modelo = modelo;
        this.dataFabricacao = dataFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", dataFabricacao='" + dataFabricacao + '\'' +
                '}';
    }
}
