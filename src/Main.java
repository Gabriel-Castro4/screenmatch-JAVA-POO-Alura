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
        System.out.println(newFilm.getSomaDasAvaliacoes());
        System.out.println(newFilm.getTotalDeAvaliacoes());
        newFilm.exibeFichaTecnica();



    }
}
