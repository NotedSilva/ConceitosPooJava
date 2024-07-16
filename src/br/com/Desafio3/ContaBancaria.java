package br.com.Desafio3;

public class ContaBancaria {
    protected double saldo;
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de: " + valor + " realizado. Saldo atual: " +saldo);
    }

    public void sacar (double valor) {
        saldo -= valor;
        System.out.println("Saque de: " + valor + " realizado. Saldo atualizado: " + saldo);
    }

    public void consultarSaldo () {
        System.out.println("Saldo atual: " + saldo);
    }
}
