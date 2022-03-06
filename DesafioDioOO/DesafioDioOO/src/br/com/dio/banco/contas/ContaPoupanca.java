package br.com.dio.banco.contas;
import br.com.dio.cliente.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.print("----------------------\n");
        System.out.println("Extrato Conta Poupança");
        System.out.println("----------------------");
        super.extratoComum();
    }
    public void getInfos(){
        System.out.print(" Tipo: Conta Poupança");
        super.getInfos();
    }
}
