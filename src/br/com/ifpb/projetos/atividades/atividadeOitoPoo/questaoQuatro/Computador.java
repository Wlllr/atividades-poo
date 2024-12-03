package br.com.ifpb.projetos.atividades.atividadeOitoPoo.questaoQuatro;

public class Computador implements DispositivoEletronico {
    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRAM;
    private int armazenamento;

    public Computador(String marca, String modelo, String processador, int memoriaRAM, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
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

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public void ligar() {
        System.out.println("Computador " + this.marca + " ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("Computador " + this.marca + " desligado!");
    }

    @Override
    public void resetar() {
        System.out.println("Computador " + this.marca + " resetado!");

    }
}
