package br.com.filmes;

import br.com.calculos.Calculadora;
import br.com.filmes.Filme;
import br.com.filmes.Serie;


public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Interestelar");
        meuFilme.setAnoDeLancamento(2014);
        meuFilme.setDuracaoEmMinutos(169);
        meuFilme.setIncluidoNoPlano(true);

        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        Calculadora cal = new Calculadora();
        cal.inclui(meuFilme);
        cal.inclui(favorito);
        cal.inclui(outro);
        cal.inclui(serie);

        System.out.println("Tempo total: " + cal.getTempoTotal());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9.3);
        meuFilme.avalia(7.5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações do filme: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + meuFilme.mediaAvaliacao());

        /*Calculadora cal = new Calculadora();
        int resultado = cal.dobrarNumero(12);
        System.out.println("O dobro do numero é: "+resultado);*/

        /*Pessoa saudacao = new Pessoa();
        saudacao.Saudacoes();*/

       /* Carro novoCarro = new Carro();
        novoCarro.modelo = "Toyota Prius";
        novoCarro.ano = 2020;
        novoCarro.cor = "Preto";

        novoCarro.exibeFichaTecnicaCarro();
        System.out.println("Idade do carro: " + novoCarro.calculaIdadeCarro() + " anos");*/



        /*Musica novaMusica = new Musica();
        novaMusica.titulo = "Nights";
        novaMusica.artista = "Frank Ocean";
        novaMusica.anoLancamento = 2016;

        novaMusica.exibeFichaTecnicaMusica();

        novaMusica.avalia(10);
        novaMusica.avalia(9.5);
        novaMusica.avalia(10);
        novaMusica.avalia(8.9);
        System.out.println("A nota media da música: "+novaMusica.mediaAvaliacoes());*/

        /*Aluno novoAluno = new Aluno();
        novoAluno.nome = "Gabriel";
        novoAluno.idade = 23;

        novoAluno.exibeInformacoes();*/

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(serie);
        episodios.setTotalVisualizacoes(99);
        filtro.filtra(episodios);

    }
}
