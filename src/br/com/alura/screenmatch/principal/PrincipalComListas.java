package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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
    }
}
