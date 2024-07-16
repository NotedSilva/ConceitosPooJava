package br.com.minhasmusicas.Modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " È muito bem avaliado pela comunidade!");
        } else {
            System.out.println(audio.getTitulo() + " Que bom gosto!");
        }
    }
}
