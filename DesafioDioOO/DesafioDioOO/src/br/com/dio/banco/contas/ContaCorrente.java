package br.com.dio.banco.contas;
import br.com.dio.cliente.Cliente;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void extrato() {
        System.out.print("----------------------\n");
        System.out.println("Extrato Conta Corrente");
        System.out.println("----------------------");
        super.extratoComum();
    }
    public void getInfos(){
        System.out.print(" Tipo: Conta Corrente");
        super.getInfos();
    }
}
