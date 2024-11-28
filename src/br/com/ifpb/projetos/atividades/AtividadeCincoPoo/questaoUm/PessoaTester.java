package br.com.edu.ifpb.questaoUm;

public class PessoaTester {
    public static void main(String[] args) {

        PessoaUm primeiraPessoa = new PessoaUm("Weller", 26);
        PessoaUm segundaPessoa = new PessoaUm("Pedro", 15);
        PessoaUm terceiraPessoa = new PessoaUm();


        System.out.println(primeiraPessoa);
        System.out.println(segundaPessoa);
        System.out.println(terceiraPessoa);
    }
}
