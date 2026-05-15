public class Filmes {

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


    //Métodos
    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        /*Coloquei este print (sem o "ln")
        * para que a media global ficasse na mesma linha
        * do "Média Global: "*/
        System.out.print("Média Global: ");mediaGlobal();
    }

    void avalia(double nota){

        /*Antes eu estava usando apenas o "if", mas eu estava achando
        * fora dos padrões aparecer um aviso em forma de sout na tela de resposta
        * por isso decidi usar o Exception*/
        if (nota > 10 || nota < 0)
        {
            throw new RuntimeException("Valor de nota inválido, Insira um valor entre 0 e 10");
        }
        else
        {
            try
            {
                somaDasAvaliacoes += nota;
                totalDeAvaliacoes++;
            }
            catch (Exception e)
            {
                System.out.println("Erro ao adicionar nota: " + e.getMessage());
            }

        }
    }

    double mediaDasAvaliacoes(){
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }

    void mediaGlobal(){
        System.out.printf("%.1f", mediaDasAvaliacoes());
    }
}
