package br.com.Desafio3;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de: " + tarifaMensal + " cobrado. Saldo atualizado: " + saldo);
    }

}
