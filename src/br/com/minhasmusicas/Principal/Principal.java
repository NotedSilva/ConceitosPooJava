package br.com.minhasmusicas.Principal;

import br.com.minhasmusicas.Modelos.MinhasPreferidas;
import br.com.minhasmusicas.Modelos.Musica;
import br.com.minhasmusicas.Modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Nights");
        minhaMusica.setArtista("Frank Ocean");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Azarados");
        meuPodcast.setApresentador("Gabriel Silva");

        for (int i = 0; i < 10; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 80; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
