package br.com.dio.cliente;
public class Cliente
{
    public String nome;

    public Cliente(String name){
        this.nome = name;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
