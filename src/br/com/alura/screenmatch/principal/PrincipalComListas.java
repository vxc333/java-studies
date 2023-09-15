package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        var meuFilme = new Filme("O poderoso chefão",1970);
        var meuFilme2 = new Filme("Dogville",2003);
        var meuFilme3 = new Filme("Avatar",2012);
        Serie minhaSerie = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(meuFilme3);
        lista.add(minhaSerie);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme){
                System.out.println(filme.getClassificacao());
            }

        }
        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Paulo");
        buscarPorArtista.add("Xavier");
        buscarPorArtista.add("Bernado");
        System.out.println(buscarPorArtista);
        Collections.sort(buscarPorArtista);
        System.out.println(buscarPorArtista);

        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
