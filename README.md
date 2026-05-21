/* OBS: Dos Commits 1 até o 11 todo o aprendizado foi centrado no curso da Alura:  Formação Aprenda a programar em Java com Orientação a Objetos. A partir dos commits 12 , ele está centrado no curso: Java trabalhando com lista e coleções de dados. */

Neste projeto estou acompanhando as aulas da Alura do curso: Formação Aprenda a programar em Java com Orientação a Objetos.
No primeiro (1°) commit foi a criação do projeto em si, criação da classe Main e Flmes, criação de métodos e atributos;

O segundo (2°)  commit foram as primeiras modificações de métodos muito extensos como: a modificação do "mediaDasAvaliacoes" e algumas modificações "exibeFichaTecnica" e um exception no método "avalia";

o terceiro (3°) commit foi a simplificação do método avalia e remoção de verbosidades do mesmo;

O quarto commit (4°) foi a criação do Package "br.com.alura.screenmatch.modelos.Filmes" e adição da classe Filmes na mesma e modificações nas permissões dos métodos;

O quinto (5°) remoção de alguns Getters e Setters que eu não quero que o usuário tenha acesso;

O Sexto (6°) foi a criação de uma classe abstrata chamada Titulo e passando toda a paternidade da classe filmes para ela e passando a herança dela para as classes Filmes e Series e criando as exclusividades de ambas;

Nesse Sétimo (7°) commit estamos aplicando o conceito de polimorfismo nos métodos "duracaoEmMinutos" e "exibeFichaTecnica";

No Oitavo (8°) Commit nós criamos uma nova package para calcular o tempo de duração dos títulos (Filmes/Séries) que desejamos. Utilizamos a sobrecarga de pacotes no método "inclui";

No Nono (9°) commit achamos que essa sobrecarga de pacotes não é bom para o design do código, por isso comentamos os antigos métodos e refizemos ele com o parâmetros da classe Mãe "Titulos" que já engloba Filmes e Series;

Décimo (10°) commit, criamos a classe "Episódios", criamos uma interface chamada "classificavel" na package "calculos". Criamos o atributo necessário nas classes que vão implementar a interface, que no caso é a classe "Filmes";

Décimo primeiro (11°) commit: implementação da classificavel na classe episodios e regrinha no getClassificacao da mesma. Criação da classe FiltroRecomendacao na package calculos e criamos um método nele que diz se a série vai bem dependendo da quantidade de Views;

Décimo segundo (12°) commit, início no aprendizado sobre lists,ArrayLists e criação da lista "listaDeFilmes". Estamos herdando o método "toString()" da classe mãe de todas as classes "Object" e modificamos para que quandos chamássemos a listaDeFilmes, ela fosse apresentada da seguinte forma: "Filme: Avatar(2023)"; 

Décimo terceiro (13°)  commit, estamos criando os métodos construtores para as classes:"Titulos","Filmes" e "Séries";

Décimo quarto (14°) commit, criamos uma nova package chamada "Principal" e passamos a classe "Main" para ela; E também dentro da package fizemos a classe "MainComListas", adição de um "for-avançado" dentro do "MainComListas" para printar todos os filmes registrados, se caso algum "item" da lista for do tipo "Filmes" que herda da classe "Títulos" ele apareça a classificação do filme. (Lembrando que o método "getClassificacao()" é um método herdado da interface "Classíficável" e que apenas a classe "Filmes" herda dela). "OBS: O ERRO DE EXCEPTION QUANDO EXECUTADO UM "ITEM" DO TIPO "SERIES" SERÁ CONSERTADO NO PRÓXIMO COMMIT"
