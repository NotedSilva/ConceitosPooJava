package br.com.Desafio7;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(int temperatura) {
        double resultado = (temperatura * 1.8) + 32;
        System.out.println("A temperatura convertida de Celcius para Fahrenheit é de :" +resultado);
    }

    @Override
    public void fahrenheitParaCelsius(int temperatra) {
        double resultado = (temperatra -32) / 1.8;
        System.out.println("A temperatura convertida de Fahrenheit para Celcius é de: "+resultado);
    }
}
