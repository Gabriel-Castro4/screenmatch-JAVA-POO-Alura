package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainComBuscas {               //Esse "throws" é para que o método ".send()"  funcione corretamente.
    public static void main(String[] args) throws IOException, InterruptedException {

        //Aqui estamos criando um cliente
        HttpClient client = HttpClient.newHttpClient();

        //Aqui estamos criando uma requisição
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create("https://omdbapi.com/?t=city+of+god&apikey=d56cca0"))
                .build();

        /*JÁ FIZEMOS A REQUISIÇÃO, AGORA PRECISAMOS DA RESPOSTA*/

        //Resposta
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
