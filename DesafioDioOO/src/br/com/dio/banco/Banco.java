package br.com.dio.banco;
import br.com.dio.banco.contas.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nome;
    private static final List<Conta> contasLista = new ArrayList<>();

    public Banco(String name) {
        this.nome = name;
    }

    public void incluiConta(Conta conta){
        contasLista.add(conta);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void listaContas() {
        System.out.println("**************************");
        System.out.println((this.nome).toUpperCase());
        System.out.println("LISTA DE CONTAS ASSOCIADAS");
        int i=0;
        for (Conta conta : contasLista) {
            System.out.printf("%d.", ++i);
            conta.getInfos();
        }
        System.out.println("**************************");    }
}
