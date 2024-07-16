package br.com.Desafio1;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(35000, 42000, 44000);
        meuCarro.setCor("Vermelho");
        meuCarro.setPlaca("BRA2E19");
        meuCarro.exibirInfo();
    }
}
