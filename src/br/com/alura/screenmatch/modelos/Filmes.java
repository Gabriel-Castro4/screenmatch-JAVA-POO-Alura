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


    //Para funcionar o implements de uma imterface, é necessário criar o método do atributo exigido da interface Mãe, que no caso é "int getClassificacao();"
    @Override
    public int getClassificacao() {
        //Transformando o método média "mediaDasAvaliacoes" que é um double em int
        return (int) mediaDasAvaliacoes() / 2;
    }
}
