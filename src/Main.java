import br.com.alura.screenmatch.modelos.Filmes;
import br.com.alura.screenmatch.modelos.Series;

public class Main {
    public static void main(String[] args) {

        Filmes newFilm = new Filmes();

        newFilm.setNome("O poderoso chefão");
        newFilm.setAnoDeLancamento(1970);
        newFilm.setDuracaoEmMinutos(180);

        newFilm.avalia(8);
        newFilm.avalia(5);
        newFilm.avalia(10);
        newFilm.avalia(5);
        newFilm.avalia(4);
        System.out.println(newFilm.getTotalDeAvaliacoes());
        newFilm.exibeFichaTecnica();

        System.out.println("*******************************************");

        Series lost = new Series();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(45);
        lost.exibeFichaTecnica();

    }
}
