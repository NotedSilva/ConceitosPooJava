public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnicaMusica() {
        System.out.println("Titulo da música: "+titulo);
        System.out.println("Nome do artista: "+artista);
        System.out.println("Ano de lançamento: "+anoLancamento);
    }

    void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }

}
