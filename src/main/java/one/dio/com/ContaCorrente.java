package one.dio.com;

public class ContaCorrente extends Conta {


    @Override
    public void ImprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        imprimirInfoComuns();
    }
}


