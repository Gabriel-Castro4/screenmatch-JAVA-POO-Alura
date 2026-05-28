package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulos implements Comparable<Titulos>{

    //Atributos

    //Com esse "@SerializedName()" estamos ensinando ao JSON como é o nome dessa informação quando ele for puxar ela. Se está escrito "Title", ela é um nome, se está escrito "Year", ela é o ano de lançamento.
    //@SerializedName("Title")
    private String nome;
    //@SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    //Método construtor para a "TitulosOmdb" dizendo que ela também faz parte da classe "Títulos".
    public Titulos(TitulosOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano porque possui mais de 4 caracteres");
        }
        //Aqui ele está tranformando o tipo da "meuTituloOmdb.year()" em inteiro, para convergir com o "anoDeLancamento"
                                //Tipo.funcao(nomeDaRecord.nomeDoParametro());
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        //Mesma lógica da de cima

        //Nesse caso, as pesquisas que o runtime era menor que 3 digitos, por exemplo "95 min", ele estava considerando como erro, então para consertar isso, eu fiz a seguinte coisa:

        /*criei uma var chamada runtime que recebe meuTituloOmdb.runtime()*/
        String runtime = meuTituloOmdb.runtime();
        //aqui ele procura onde existe espaço em branco na informação vinda da API, e guarda a posição de onde existem espaços preenchidos
        int posicaoEspaco = runtime.indexOf(" ");
        /*Aqui ele pega só os números e lê da posição 0, até a posição onde possui espaços,
        guarda só as partes dos números*/
        String apenasNumeros = runtime.substring(0, posicaoEspaco);
        //e aqui ele está convertendo os textos para os números
        this.duracaoEmMinutos = Integer.valueOf(apenasNumeros);
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    //Não quero que o usuário tenha acesso a soma das avaliações

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    //Não quero que o usuário tenha acesso ao set do total avaliações

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    //Métodos

    //Método Construtor


    public Titulos(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.printf("Média Global: %.1f", mediaDasAvaliacoes());
        //Apenas para dar um espaçamento
        System.out.println("");
    }

    public void avalia(double nota) {

        if (nota > 10 || nota < 0) {
            throw new RuntimeException("Valor de nota inválido, Insira um valor entre 0 e 10");
        }
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    public double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;

    }

    //Método exigido pela interface Comparable
    @Override
    public int compareTo(Titulos outroTitulo) {
                    //nomeDoTítlo       //nomeDoOutroTitlo
        return this.getNome().compareTo(outroTitulo.getNome());
        /*Compare o nome de um título com o nome de outro titulo*/
    }

    @Override
    public String toString() {
        return "Título: " + nome + '\'' +
                ", Ano de lançamento: " + anoDeLancamento +
                ", "+ "Duração em minutos: " + duracaoEmMinutos;
    }
}
