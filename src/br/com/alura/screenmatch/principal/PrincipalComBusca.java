package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        var busca = leitura.nextLine();

        String endereco ="http://www.omdbapi.com/?t="+ busca +"&apikey=af93aee7";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request , HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        Gson gson = new Gson();
        Titulo meuTitulo = gson.fromJson(response.body(), Titulo.class);
        System.out.println(meuTitulo);
    } 
}
