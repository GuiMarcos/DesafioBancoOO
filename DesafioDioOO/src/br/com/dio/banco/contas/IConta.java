package br.com.dio.banco.contas;

public interface IConta {
     void sacar(double valor);
     void transferir(double valor, Conta destino);
     void depositar(double valor);
     void extrato();
}

