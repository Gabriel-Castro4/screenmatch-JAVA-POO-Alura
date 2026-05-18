package br.com.alura.screenmatch.calculos;

//Imports de pacotes
import br.com.alura.screenmatch.modelos.Filmes;
import br.com.alura.screenmatch.modelos.Series;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    //Não quero que trabalhe o setter do atributo


    //Método utilizando o parâmetro "Filmes"
    public void inclui(Filmes f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }

    //Sobrecarga de pacotes, é usar o mesmo nome de um método que tem a função parecida, mas utiliza parâmetros diferentes, ou trabalha com uma classe diferente
    //Para funcionar, é necessário fazer um import de pacotes
    //Método utilizando o parâmetro "Series"
    public void inclui(Series s) {
        tempoTotal += s.getDuracaoEmMinutos();
    }
}
