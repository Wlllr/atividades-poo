package br.com.ifpb.projetos.atividades.atividadeOitoPoo.questaoQuatro;

public class DispositivosTester {
    public static void testarDispositivosEletronicos(DispositivoEletronico dispositivo){
        System.out.println("****** ligando o dispositivo... ******");
        dispositivo.ligar();

        System.out.println("****** Resetando o dispositivo... ******");
        dispositivo.resetar();

        System.out.println("****** Desligando o dispositivo... ******");
        dispositivo.desligar();
    }

    public static void main(String[] args) {
        DispositivoEletronico pcXuxa = new Computador("PcXuxa", "Gamer UltraStarPlus", "i9", 64, 2);
        DispositivoEletronico s24 = new SmartPhone("Samsung", "S24 Ultra", "Android 15 xatu p kct", 4500, 512);

        testarDispositivosEletronicos(pcXuxa);
        testarDispositivosEletronicos(s24);
    }
}
