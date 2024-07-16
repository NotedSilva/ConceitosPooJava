package br.com.Desafio1;

public class ModeloCarro extends Carro {
    private String placa;
    private String cor;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Placa: "+placa);
        System.out.println("Cor: "+cor);
    }
}
