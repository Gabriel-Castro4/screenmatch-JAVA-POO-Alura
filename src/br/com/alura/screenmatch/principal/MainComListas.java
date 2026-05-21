package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filmes;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulos;

import java.util.ArrayList;

public class MainComListas {
    public static void main(String[] args) {

        Filmes newFilm = new Filmes("O poderoso chefão", 1970);
        Filmes oneFilm = new Filmes("Avatar", 2023);
        Filmes twoFilm = new Filmes("Taxi Driver", 1970);
        Series lost = new Series("Lost", 2000);

        ArrayList<Titulos> lista = new ArrayList<>();lista.add(oneFilm);
        lista.add(twoFilm);
        twoFilm.avalia(8);
        lista.add(newFilm);
        newFilm.avalia(6);
        lista.add(oneFilm);
        oneFilm.avalia(9);
        lista.add(lost);

        /*Isso é um "for" avançado, ele serve para percorrer todos os itens de uma lista,
        * um por um, nesse caso:
        * Para cada item do tipo "Titulos" chamado "item" dentro da lista, faça: imprimir o item*/

      //para //tipo //nome //nomeDaLista
        for (Titulos item: lista) {
            //imprima(itens)
            System.out.println(item);

            /*Eu quero que se caso um desses itens forem do tipo "Filmes",
            * mostre a classificação deles (Apenas os objetos do tipo:"Filmes" herdam o método "getClassificacao()" da interface "Classificável") */

           //tipo //nome   //casting //nomeDoItem
            Filmes filme = (Filmes) item;
       //Os itens do tipo "Filmes", agora se chamam "filme", mas continuam sendo "item"
            System.out.println("Classificação: " + filme.getClassificacao());

        }
    }
}
