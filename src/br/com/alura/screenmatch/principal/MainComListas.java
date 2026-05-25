package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filmes;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainComListas {
    public static void main(String[] args) {

        Filmes newFilm = new Filmes("O poderoso chefão", 1970);
        Filmes oneFilm = new Filmes("Avatar", 2023);
        Filmes twoFilm = new Filmes("Taxi Driver", 1970);
        Series lost = new Series("Lost", 2000);

        ArrayList<Titulos> lista = new ArrayList<>();
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

            //uso de um "if" e "instanceof" no lugar desse código seguinte
           //Se //item //herda  //tipo //nomeDoItemDoTipoFilme
            if (item instanceof Filmes filme) {
                //Os itens do tipo "Filmes", agora se chamam "filme", mas continuam sendo um "item"
                System.out.println("Classificação: " + filme.getClassificacao());
            }

            /*Eu quero que se caso um desses itens forem do tipo "Filmes",
            * mostre a classificação deles (Apenas os objetos do tipo:"Filmes" herdam o método "getClassificacao()" da interface "Classificável") */

            /*CÓDIGO ANTIGO: */
           //tipo //nome   //casting //nomeDoItem
            //Filmes filme = (Filmes) item;
       //Os itens do tipo "Filmes", agora se chamam "filme", mas continuam sendo "item"
            //System.out.println("Classificação: " + filme.getClassificacao());

        }
        System.out.println("*************************************************");

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Cavalera");
        buscaPorArtista.add("Adam Samdler");
        buscaPorArtista.add("Burton C Bell");
        System.out.println(buscaPorArtista);

        /*Isso é um método estático, o "sort()" (Ou seja, não precisa criar um objeto para chamá-lo, ele é de propriedade da classe "Collections").
        * Ele ordena as listas em ordem alfabética*/
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);

    //O erro acontece pq a classe "Titulos não possui comparativos para organizar os itens da lista entre si, então teremos que implementar a interface "Comparable" na classe "Titulos" e herdar o método "compareTo()".
        Collections.sort(lista);
        System.out.println("Lista de títulos ordenados: ");
        System.out.println(lista);

        /*O o ".sort()" é um comparador
        * Dentro do ".sort()", nós colocamos um critério que no caso é o:
        * "Comparator.comparing()", nesse caso estamos querendo comparar itens do tipo "Titulos", e dentro do tipo "Titulos", queremos comparar o método "getAnoDeLancamento"
        * O "::" é uma referêcia de método, ele pega a classe "Filmes" e faz referência ao método "getAnoDeLancamento" dela*/
        lista.sort(Comparator.comparing(Titulos::getAnoDeLancamento));
        System.out.println("Ordenados pelo ano: ");
        System.out.println(lista);

    }
}
