package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        System.out.println(meuFilme.getClassificacao());

        Serie minhaSerie = new Serie("Lost",2000);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(10);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.setEpisodiosPorTemporada(10);
        System.out.println(minhaSerie.getDuracaoEmMinutos() );

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtrar(episodio);
        var filmeMeu = new Filme("Dogville",2003);
        filmeMeu.setDuracaoEmMinutos(200);
        filmeMeu.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeMeu);
        listaDeFilmes.add(meuFilme);
        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(1).getNome());
    }
}
