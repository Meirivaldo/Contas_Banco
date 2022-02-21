package one.dio.com;

public class Main {
    public static void main(String[] args) {

        Conta cc= new ContaCorrente();
        cc.depositar(1000);
        cc.sacar(500);
        cc.depositar(300);
        cc.transferir(500, cc);

        Conta poupanca= new ContaPoupanca();
        cc.transferir(100, poupanca);

        cc.imprimirInfoComuns();
        poupanca.imprimirInfoComuns();
    }
}
