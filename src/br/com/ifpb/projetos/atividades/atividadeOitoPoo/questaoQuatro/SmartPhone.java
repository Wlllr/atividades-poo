package br.com.ifpb.projetos.atividades.atividadeOitoPoo.questaoQuatro;

public class SmartPhone implements DispositivoEletronico{
    private String marca;
    private String modelo;
    private String sistemaOperacional;
    private int capacidadeDeBateria;
    private int armazenamento;

    public SmartPhone(String marca, String modelo, String sistemaOperacional, int capacidadeDeBateria, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.capacidadeDeBateria = capacidadeDeBateria;
        this.armazenamento = armazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getCapacidadeDeBateria() {
        return capacidadeDeBateria;
    }

    public void setCapacidadeDeBateria(int capacidadeDeBateria) {
        this.capacidadeDeBateria = capacidadeDeBateria;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public void ligar() {
        System.out.println("SmartPhone " + this.modelo + " ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("SmartPhone " + this.modelo + " desligado!");

    }

    @Override
    public void resetar() {
        System.out.println("SmartPhone " + this.modelo + " resetado!");


    }
}
