package br.com.dio;
import br.com.dio.cliente.Cliente;
import br.com.dio.banco.contas.Conta;
import br.com.dio.banco.contas.ContaCorrente;
import br.com.dio.banco.contas.ContaPoupanca;
import br.com.dio.banco.Banco;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Banco do Itaperuçu");

        Cliente joao = new Cliente("Joao");
        Cliente pedro = new Cliente("Pedro");

        Conta cc = new ContaCorrente(joao);
        Conta cp = new ContaPoupanca(pedro);

        banco.incluiConta(cc);
        banco.incluiConta(cp);
        banco.listaContas();

        cc.depositar(100);
        cc.extrato();

        cc.transferir(75, cp);


        cc.extrato();
        cp.extrato();

        cc.sacar(25);
        cc.extrato();
    }
}
