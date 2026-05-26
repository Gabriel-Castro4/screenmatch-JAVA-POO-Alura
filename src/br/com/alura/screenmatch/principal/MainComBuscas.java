package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulos;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainComBuscas {               //Esse "throws" é para que o método ".send()"  funcione corretamente.
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);

        //Fizemos uma pergunta para o usuário digitar o nome do filme
        System.out.println("Digite um filme: ");
        var busca = scan.next();

        //fizemos uma variável que padroniza como será o link da pesquisa, com a informação da variável "busca"
        String endereco = "https://omdbapi.com/?t=" + busca + "&apikey=d56cca0";

        //Aqui estamos criando um cliente
        HttpClient client = HttpClient.newHttpClient();

        //Aqui estamos criando uma requisição
        HttpRequest request = HttpRequest.newBuilder().
                //trocamos a busca do link direto, para uma variável que já possui o link dentro dela, mas com o nome do filme colocado pelo própio usuário.
                uri(URI.create(endereco))
                .build();

        /*JÁ FIZEMOS A REQUISIÇÃO, AGORA PRECISAMOS DA RESPOSTA*/

        //Resposta
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        //Biblioteca do google baixada no mvnrepository que transforma informações em formato JSON, ou também transforma JSON em outras formas
        Gson gson = new Gson();
        //Estamos pegando as informações da classe "Titulos", e colocando as informações da API com a nossa classe, comparando elas e colocando elas conforme designamos no "toString" da classe "Titulos"
        Titulos meuTitulo = gson.fromJson(json, Titulos.class);
        System.out.println(meuTitulo);

    }
}
