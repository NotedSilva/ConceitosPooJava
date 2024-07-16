package br.com.Desafio4;

public class ConversorMoeda implements ConversaoFinanceira {
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.44;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: " +valorReal);
    }
}
