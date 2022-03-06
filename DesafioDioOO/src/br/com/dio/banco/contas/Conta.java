package br.com.dio.banco.contas;
import br.com.dio.cliente.Cliente;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    protected Cliente cliente;


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente=cliente;
    }

    public void setSaldo(double valor){
        this.saldo = valor;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNumero(){
        return numero;
    }

    public int getAgencia(){
        return agencia;
    }

    @Override
    public void sacar(double valor){
        saldo-=valor;
        System.out.println("----------------------");
        System.out.printf("Saque Confirmado\nValor: %.2f\n", valor);
        System.out.println("----------------------");
    };

    @Override
    public void depositar(double valor){
        saldo=valor+saldo;
        System.out.println("----------------------");
        System.out.printf("Depósito Confirmado\nValor: %.2f\n", valor);
        System.out.println("----------------------");
    };

    @Override
    public void transferir(double valor, Conta destino){
        saldo-=valor;
        destino.setSaldo(destino.getSaldo() + valor);
        System.out.println("----------------------");
        System.out.printf("Transferencia Confirmada\nValor: %.2f\nConta Destino(Agencia):" +
                " %d (%d)\n", valor, destino.getNumero(), destino.getAgencia());
        System.out.println("----------------------");
    };

    protected void extratoComum() {
        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Conta: %d\n", this.numero);
        System.out.printf("Saldo: %.2f R$\n", this.saldo);
        System.out.print("----------------------\n");
    }


    public void getInfos(){
        System.out.printf("\nTitular: %s\n", this.cliente.getNome());
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Conta: %d\n", this.numero);
    }
}
