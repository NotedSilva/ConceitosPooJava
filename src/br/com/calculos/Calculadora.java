package br.com.calculos;

import br.com.filmes.Titulo;

public class Calculadora {
    private int tempoTotal;

    public void inclui (Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
    public int getTempoTotal() {
        return tempoTotal;
    }
}
