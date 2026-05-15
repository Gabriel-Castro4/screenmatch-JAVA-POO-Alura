import br.com.alura.screenmatch.modelos.Filmes;

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

    }
}
