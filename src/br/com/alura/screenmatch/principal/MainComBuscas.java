package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulos;
import br.com.alura.screenmatch.modelos.TitulosOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainComBuscas {               //Esse "throws" é para que o método ".send()"  funcione corretamente.
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String busca = "";

        //Lista feita para guardas as informações dos titulos digitados peso usuário
        List<Titulos> novosFilmes = new ArrayList<>();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                //Esse comando é para deixar o JSON organizado
                .setPrettyPrinting()
                .create();

        Titulos meuTitulo = null;
        while (!busca.equalsIgnoreCase("sair")) {

            //Fizemos uma pergunta para o usuário digitar o nome do filme
            System.out.println("Digite um filme: ");
            /*var busca = scan.next(); Só estava reconhecendo o primeiro nome*/
            busca = scan.nextLine(); //Está reconhecendo toda a linha
            //Aqui o código está dizendo que: se caso a respotas possuir nomes compostos, por exemplo: "Tropa de Elite", ela vai modificar par: "Tropa+de+Elite"
            busca = busca.replace(" ", "+");
            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            //fizemos uma variável que padroniza como será o link da pesquisa, com a informação da variável "busca"
            String endereco = "https://omdbapi.com/?t=" + busca + "&apikey=d56cca0";
            System.out.println(endereco);
            try {
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

                //Com isso estamos dizendo que uma informação da record "TitulosOmdb", ela é verdadeira independente de que a priemira letra da informação seja maiúscula ou minúscula no JSON.
                //mudamos a posição do gson para tratar dos dados diretamente na lista "novosFilmes", e tranformar as informações já no formato JSON
//                Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
                //Estamos pegando as informações da classe "Titulos", e colocando as informações da API com a nossa classe, comparando elas e colocando elas conforme designamos no "toString" da classe "Titulos"
                //Titulos meuTitulo = gson.fromJson(json, Titulos.class);
                TitulosOmdb meuTituloOmdb = gson.fromJson(json, TitulosOmdb.class);
                System.out.println(meuTituloOmdb);

                //tente:
                //try {
                //Aqui estamos dizendo que o item da API além de fazer parte da record, ele também faz parte da classe "Títulos", então nesse cógido estamos dizendo isso, e na classe "Títulos" estou criando um método construtor para ele.
                meuTitulo = new Titulos(meuTituloOmdb);
                System.out.println("Título já convertido: ");
                System.out.println(meuTitulo);

                //Isso é uma class que cria arquivos, nesse caso ele está criando um .txt e escreve dentro do arquivo, que nesse caso é o "toString" do "meuTitulo"           (Escritas em arquivo)
//

                //Add os filmes a lista
                novosFilmes.add(meuTitulo);

                //Caso aconteça um erro:
                //pegue: //tipo de erro identificado //declarandoNomeDoErro
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro:");
                //"nomeDoErro.getMessage()"
                System.out.println(e.getMessage());
                //ele vai printar aonde está o erro.
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {

            }

        }
        //printando todos os filmes digitados na lista
        System.out.println(novosFilmes);



        //Ele aqui está pegando as informações da lista e transformando em JSON, já criando um arquivo JSON
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(novosFilmes));
        escrita.close();

        System.out.println("O programa finalizou corretamente");

    }
}
