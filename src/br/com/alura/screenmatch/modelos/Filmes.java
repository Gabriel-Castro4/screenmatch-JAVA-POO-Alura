package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filmes extends Titulos implements Classificavel {

    //Atributos
    private String diretor;


     //Getters and Setters
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    //Métodos

    //Método Construtor
    public Filmes(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }



    //Para funcionar o implements de uma imterface, é necessário criar o método do atributo exigido da interface Mãe, que no caso é "int getClassificacao();"
    @Override
    public int getClassificacao() {
        //Transformando o método média "mediaDasAvaliacoes" que é um double em int
        return (int) mediaDasAvaliacoes() / 2;
    }


    /*O "toString()" em JAVA é um método especial usado para transformar um objeto em uma representação de texto (String)
    * estamos mudando-o para que quando chamarmos a "listaDeFilmes", ela aparecer na forma que está declarada neste método
    * Estamos herdando este método da classe pai de todas as classes, a "Object"*/
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "("+ this.getAnoDeLancamento() +")";
    }
}
