package one.dio.com;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 4995;
    private static int SEQUENCIAL = 1303;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;

    }

    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfoComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}


