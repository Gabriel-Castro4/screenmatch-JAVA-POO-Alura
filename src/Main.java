import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
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

        Filmes oneFilm = new Filmes();

        oneFilm.setNome("Avatar");
        oneFilm.setAnoDeLancamento(2023);
        oneFilm.setDuracaoEmMinutos(200);

        Filmes twoFilm = new Filmes();

        twoFilm.setNome("Taxi Driver");
        twoFilm.setAnoDeLancamento(1970);
        twoFilm.setDuracaoEmMinutos(120);

        System.out.println("*******************************************");

        Series lost = new Series();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();

        System.out.println("*******************************************");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(oneFilm);
        calculadora.inclui(newFilm);
        calculadora.inclui(twoFilm);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

    }
}
