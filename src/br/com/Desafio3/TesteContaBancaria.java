package br.com.Desafio3;

public class TesteContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();


        ContaCorrente contacorrente = new ContaCorrente();
        contacorrente.depositar(200);
        contacorrente.cobrarTarifaMensal();
        contacorrente.consultarSaldo();
        contacorrente.sacar(150);
        contacorrente.consultarSaldo();

    }
}
