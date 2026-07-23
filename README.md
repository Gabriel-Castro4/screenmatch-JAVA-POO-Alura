# Screenmatch - Java com POO, Listas, Coleções e Consumo de API

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://adoptium.net/)
[![POO](https://img.shields.io/badge/POO-Avançado-green.svg)](https://www.alura.com.br/)
[![Gson](https://img.shields.io/badge/Gson-2.10-lightgrey.svg)](https://github.com/google/gson)

## Sobre o Projeto

Este repositório documenta meu aprendizado em múltiplos cursos da Alura, abrangendo desde os fundamentos da Programação Orientada a Objetos (POO) em Java até tópicos mais avançados como listas, coleções de dados e consumo de APIs. O projeto "Screenmatch" foi desenvolvido como uma aplicação prática para consolidar esses conhecimentos.

O objetivo principal é construir uma aplicação Java que simula um sistema de cadastro e busca de títulos (filmes e séries), aplicando conceitos de orientação a objetos, manipulação de coleções, ordenação de dados e integração com APIs externas para obter informações reais.

## Tecnologias Utilizadas

- **Java** - Linguagem de programação utilizada no projeto.
- **Paradigma POO** - Programação Orientada a Objetos (classes, herança, polimorfismo, encapsulamento, abstração).
- **Coleções Java** - Uso de Listas (ArrayList), ordenação com Collections e Comparator.
- **API Externa (OMDB)** - Consumo de uma API REST para buscar informações de filmes.
- **Biblioteca Gson** - Biblioteca do Google para conversão de dados JSON em objetos Java.
- **Manipulação de Arquivos** - Criação e gravação de arquivos de texto (.txt) e JSON (.json).
- **Tratamento de Exceções** - Criação e lançamento de exceções personalizadas.

## Estrutura do Projeto e Evolução (Histórico de Commits)

O projeto foi desenvolvido em etapas, cada uma representada por commits que documentam a evolução do aprendizado.

### Fase 1: Fundamentos de Programação Orientada a Objetos (Commits 1 a 11)
- **Commit 1:** Criação do projeto, da classe `Main` e da classe `Filmes`, com atributos e métodos básicos.
- **Commit 2:** Refatoração de métodos extensos (`mediaDasAvaliacoes`, `exibeFichaTecnica`) e adição de tratamento de exceção no método `avalia`.
- **Commit 3:** Simplificação do método `avalia` e remoção de verbosidades.
- **Commit 4:** Organização do código em pacotes (`br.com.alura.screenmatch.modelos.Filmes`) e ajuste nas permissões dos métodos.
- **Commit 5:** Remoção de getters e setters que não deveriam ser acessíveis ao usuário.
- **Commit 6:** Criação da classe abstrata `Titulo`, que se torna a classe mãe de `Filmes` e `Series`, aplicando o conceito de herança.
- **Commit 7:** Aplicação do conceito de polimorfismo nos métodos `duracaoEmMinutos` e `exibeFichaTecnica`.
- **Commit 8:** Criação de um pacote para calcular o tempo de duração de títulos, utilizando sobrecarga de métodos em `inclui`.
- **Commit 9:** Refatoração do método `inclui` para receber parâmetros da classe mãe `Titulos`, melhorando o design do código.
- **Commit 10:** Criação da classe `Episodios` e da interface `Classificavel`. Implementação da interface na classe `Filmes`.
- **Commit 11:** Implementação da interface `Classificavel` em `Episodios`, criação da classe `FiltroRecomendacao` para recomendar títulos baseados em views.

### Fase 2: Listas, Coleções e Ordenação (Commits 12 a 16)
- **Commit 12:** Introdução ao uso de `ArrayList` para criar uma `listaDeFilmes`. Sobrescrita do método `toString()` para exibir os filmes de forma personalizada.
- **Commit 13:** Criação de métodos construtores para as classes `Titulos`, `Filmes` e `Series`.
- **Commit 14:** Criação do pacote `Principal` e da classe `MainComListas`. Uso de um loop `for` avançado para iterar sobre a lista e exibir a classificação de filmes.
- **Commit 15:** Ordenação da lista de `Titulos` em ordem alfabética, implementando a interface `Comparable` na classe `Titulos` e sobrescrevendo o método `compareTo`.
- **Commit 16:** Ordenação da lista utilizando `Comparator.comparing()` para ordenar por `anoDeLancamento`.

### Fase 3: Consumo de API, Manipulação de Arquivos e Tratamento de Erros (Commits 17 a 22)
- **Commit 17:** Criação da classe `MainComBuscas`. Primeiros passos no consumo da API OMDB para buscar informações de filmes.
- **Commit 18:** Implementação de uma busca interativa com o usuário. Integração da biblioteca Gson para converter a resposta JSON da API em objetos Java. Mapeamento de atributos da API para a classe `Titulos`.
- **Commit 19:** Criação de uma `Record` chamada `TitulosOmdb` para mapear a resposta da API. Ajustes na conversão de tipos de dados (String para Integer). Utilização de `GsonBuilder` para configurar a política de nomenclatura dos campos.
- **Commit 20:** Adição de um bloco `try-catch` na `MainComBuscas` para tratar possíveis erros na requisição à API.
- **Commit 21:** Tratamento de entradas do usuário com `busca.replace()` para substituir espaços por "+". Ajuste no construtor de `Titulos` para tratar a duração (`runtime`) vinda da API. Criação de uma exceção personalizada (`ErroDeConversaoDeAnoException`) para tratar anos com mais de 4 caracteres.
- **Commit 22:** Utilização de `FileWriter` para criar e gravar um arquivo de texto (`filmes.txt`) com os dados do filme buscado. Implementação de um loop `while` para permitir múltiplas buscas. Criação de uma lista (`novosFilmes`) para armazenar os títulos buscados. Escrita da lista em um arquivo JSON (`filmes.json`) utilizando o Gson.

## Como Utilizar este Repositório

1.  **Clone o repositório** para sua máquina local.
2.  Importe o projeto para sua IDE de preferência.
3.  Explore as classes nos pacotes para entender a estrutura e a evolução do código.
4.  Execute a classe `Main` para testar as funcionalidades básicas.
5.  Execute a classe `MainComListas` para ver a manipulação de listas e ordenação.
6.  Execute a classe `MainComBuscas` para consumir a API OMDB (é necessário ter uma chave de API, que pode ser obtida gratuitamente no site da OMDB).
7.  Acompanhe os commits para ver a progressão do aprendizado passo a passo.

## Principais Aprendizados

Este projeto proporcionou a aplicação prática de uma ampla gama de conceitos fundamentais e avançados em Java, incluindo:

- **Programação Orientada a Objetos:** Herança, polimorfismo, encapsulamento, abstração, interfaces e classes abstratas.
- **Estruturas de Dados:** Uso de Listas (ArrayList), ordenação com `Collections` e `Comparator`.
- **Consumo de APIs:** Realização de requisições HTTP e tratamento de respostas JSON.
- **Bibliotecas Externas:** Integração e uso da biblioteca Gson para parsing de JSON.
- **Manipulação de Arquivos:** Criação e escrita em arquivos de texto e JSON.
- **Tratamento de Exceções:** Criação e lançamento de exceções personalizadas para um código mais robusto.
- **Boas Práticas:** Organização de código em pacotes, refatoração e evolução incremental do projeto.

## Referências

- [Documentação Oficial do Java](https://docs.oracle.com/en/java/)
- [Alura - Formação Aprenda a programar em Java com Orientação a Objetos](https://www.alura.com.br/)
- [Alura - Java: trabalhando com listas e coleções de dados](https://www.alura.com.br/)
- [Alura - Java: consumindo API, gravando arquivos e lidando com erros](https://www.alura.com.br/)
- [OMDB API](https://www.omdbapi.com/)
- [Biblioteca Gson](https://github.com/google/gson)

## Autor

**Gabriel Castro**
- GitHub: [@Gabriel-Castro4](https://github.com/Gabriel-Castro4)
