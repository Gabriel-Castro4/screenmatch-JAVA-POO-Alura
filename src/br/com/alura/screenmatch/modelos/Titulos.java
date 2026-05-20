package br.com.alura.screenmatch.modelos;

public class Titulos {

    //Atributos
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

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

}
