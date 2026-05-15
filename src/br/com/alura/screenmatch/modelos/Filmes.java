package br.com.alura.screenmatch.modelos;

public class Filmes {

    //COMMIT 4
    /*Como agora foi criado um package para guardar a classse filmes, é necessário deixar explicito que os atributos são públicos*/

    //Atributos
     public String nome;
     public int anoDeLancamento;
     public boolean incluidoNoPlano;
     public double somaDasAvaliacoes;
     public int totalDeAvaliacoes;
     public int duracaoEmMinutos;


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

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    //COMMIT 4
    /*Isso também que acontecer nos métodos*/

    //Métodos
   public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        //COMMIT 2
        System.out.printf("Média Global: %.1f", mediaDasAvaliacoes());
    }

    public void avalia(double nota) {

        /*Antes eu estava usando apenas o "if", mas eu estava achando
         * fora dos padrões aparecer um aviso em forma de sout na tela de runtime,
         * por isso decidi usar o Exception*/
        //COMMIT 3
        /*Novamente uma remoção de verbosidade, dessa vez no try catch dentro do else, que não precisva, era apenas fechar a condição e dizer oque ela deveria ser feita caso fosse falsa*/
        if (nota > 10 || nota < 0) {
            throw new RuntimeException("Valor de nota inválido, Insira um valor entre 0 e 10");
        }
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    //COMMIT 2
    /*Para diminuir a quantidade de linhas, percebi q o métedo mediaGlobal era redundante e então decidi descobrir outra forma de trabalhar esse método e veja como ficou mais simples e menos verboso:
        * double mediaDasAvaliacoes(){
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }

    void mediaGlobal(){
        System.out.printf("%.1f", mediaDasAvaliacoes());
    }
}
*   Para: */
    public double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;

    }

}
