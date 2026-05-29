/* OBS: Dos Commits 1 até o 11 todo o aprendizado foi centrado no curso da Alura:  Formação Aprenda a programar em Java com Orientação a Objetos; A partir dos commits 12 até o 16, ele está centrado no curso: Java trabalhando com lista e coleções de dados; A partir do commit 17 ele está centrado no curso: Java consumindo API, gravando arquivos e lidando com erros. */

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

Décimo quinto (15°) commit, nós descobrimos como printar os itens de uma lista em ordem alfabética utilizando o método estático "sort()" da classe "Collections", e quisemos aplicar este método na nossa "lista" de "Titulos". Para isso tivemos que descobrir como uma lista do tipo String é funcional com esse método, ela herda o método "compareTo" da interface "Comparable", então impletamos a interface na classe "Titulos" e herdamos o método "compareTo()", passamos os parâmetros do tipo "Titulos" e de nome "outroTitulo" e pedimos para que ele retorne um ".getNome()", use a função ".compareTo()" e dentro dessa função ele use o "outroTitulo.getNome()".

Décimo sexto (16°) commit, na classe "MainComListas" utilizamos o ".sort()" novamente, mas agora passando critérios, que no caso é: "Comparator.comparing()" e queremos comparar o método "getAnoDeLancamento" dentro da classe "Filmes";

Décimo sétimo (17°) commit, criamos a classse "MainComBuscas", e demos os primeiros passos no consumo de API's, que no caso foi de um site chamado: OMDB API, que nos trás informações de filmes. Criamos um objeto "client", criamos um objeto "request" que exige o link da API e criamos uma lista "response" da interface "HttpResponse<String>" que irá printar as informações do link;

Décimo oitavo (18°) commit, criamos 2 variáveis dentro da classe "MainComListas", uma chamada "busca", que guarda a informação do usuário, e a "endereco" que transforma a informação da "busca" em um link, e onde tinha o endereço do link na requisição, agora ela recebe apenas a variável transformada "endereco";
Baixamos no mvn reposiory o Gson, que é uma biblioteca do Google para Java que trasnforma informações em formato JSON, ou JSON em outros formatos; criamos um objeto da biblioteca de nome "gson", e ele recebe os parâmetros (json, Titulos.class). Nesse momento o filme que tem as informações recebidas pela API, se torna um novo título, com isso, convergimos que por exemplo, uma "title" da API, é a mesma coisa do atributo "nome" da classe "Titulos" e um "year", é a mesma coisa do atributo "anoDeLancamento" ;
Modificamos o "toString()" da classe "Titulos", para que as informações apareça da forma que nos designamos na "toString";

Décimo nono (19°) commit, criamos uma record, que é uma classe imutável dentro da Package "modelos", chamada "TitulosOmdb", que possui os parâmetros: (String title, String year, String runtime). *OBS: as informações estavam dando "null" porque nos parâmetros da "TitulosOmdb" estavam começando em letras minúsculas, então fomos na documentação da biblioteca Gson no GitHub e pegamos a seguinte função: "new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();" e isso faz com o que independente do formato das letras, a informação será entendida.*
Depois ainda na classe: "MainComBuscas" dizemos que a "meuTituloOmdb" também faz parte da classe "Títulos" e na classe "Títulos" criamos um construtor para ela. No construtor percebemos que o tipo dos parâmetros da record não batiam com os tipo do atributos da classe "Títulos", então transformamos os tipos dos parâmetros nos tipos dos atributos utilizando o seguinte método: Integer.valueOf(meuTituloOmdb.year()); //Tipo.funcao(nomeDaRecord.nomeDoParametro()); e dentro do "nomeDoParametro", eu determinei a quantidade de casas que a as informações dos minutos devem ser printadas "(0,3)".

Vigésimo (20°) commit, colocamos um "try catch" no "MainComBuscas" caso alguma informação venha errada da API;

Vigésimo primeiro (21°) commit, na "MainComBuscas" nós fizemos um "busca.replace", porque se o nome do filme for composto, os espaços em branco são transformados em "+" e evita erros de busca; E também modificamos para "scan.nextLine()", pq o "next()" só estava lendo o primeiro nome, já o "nextLine" ele lê tudo que foi escrito na linha;
Já na "Titulos", fizemos uma pequena modificação no método construtor pq quando o "runtime" vinha tinha 2 digitos, ao invés de 3 que é oq foi designado para ele ler no código, isso gerava um erro, por isso fizemos uma "var" que recebia o valor de "meuTituloOmdb.runtime()", depois fizemos uma "var" chamada "posicaoEspaco" que recebia "runtime.indexOf(" ")", que guarda a posição de onde existem espaços preenchidos, depois criamos outra "var" que lê da posição 0 até a "posicaoEspaco" e depois no "this.duracaoEmMinutos = Integer.valueOf(apenasNumeros)" que ele converte os textos para números e consegue ler a informão da API sem erros;
Criamos uma nova package chamada "excecao" que extende da interface "RuntimeException" e dentro dela criamos uma classe de exception chamada "ErroDeConversaoDeAnoException", nessa classe nós criamos nossa própria exceção que, se a informação da API, o ano tiver mais de 4 caracteres, essa exceção é lançada;

Vigésimo segundo (22°) commit, na "MainComBuscas" nós fizemos um objeto "FileWriter" de nome "escrita" que cria arquivos dentro do projeto, nesse caso pedimos pra ela criar um arquivo chamado "filmes.txt" e ele passava dentro do arquivo as informações do filme buscado pela api, e já convertido pela "toString()"; 
também dentro da "MainComBuscas" colocamos uma estrutura de repetição "while" junto com um "if" que enquanto o usuário não digitar sair, o programa continuará rodando e fazendo as perguntas;
Estamos guardando as informações dos filmes numa list do tipo Titulos chamada "novosFilmes", e ela está guardando as informações os titulos digiatdos pelo user;
Depois reescremos o chamado da biblioteca externa gson e FileWriter, para que ele crie um arquivo q no caso foi o "filmes.json" já convertido em JSON;
