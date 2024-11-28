package br.com.edu.ifpb.atividadeCincoPoo.questaoQuatro;

public class Inversor {
    private String frase;

    // configura this.frase
    public void setFrase(String frase){
        this.frase = frase;
    }

    // retorna this.frase
    public String getFrase(){
        return this.frase;
    }

    // metodo que converte a frase digitada
    // para criar o metodo, e preciso que se coloque dentro dele o objeto StringBuilder
    public String getFraseConvertida(){
        return new StringBuilder(this.frase).reverse().toString();

    }

    public int getQtdeA(){
        String verificar = this.frase;
        int contador = 0;
        for(int i = 0; i < verificar.length(); i++){
            if (verificar.charAt(i) == 'a'){
                contador = contador + 1;
            }
        }
        return contador;
    }
}
