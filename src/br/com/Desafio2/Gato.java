package br.com.Desafio2;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("MIAU");
    }

    public void arranharMoveis() {
        System.out.println("Gato arranhando moveis");
    }
}
