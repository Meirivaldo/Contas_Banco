package one.dio.com;

/**
 * Toda interface é publica! Logo, colocar public é uma redundância!
 * Por isso, só se coloca void, logo o seu método não retornará nada!
 */
public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void ImprimirExtrato();

}