package br.com.Desafio2;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("AU");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando rabo");
    }
}
