# Projeto iPhone - Desafio POO

Este é um projeto desenvolvido como parte de um desafio de Programação Orientada a Objetos (POO). O desafio consiste em modelar e diagramar um componente de iPhone com funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet, utilizando a linguagem de programação Java.

## Funcionalidades

O iPhone neste projeto é modelado com três funcionalidades principais:

- *Reprodutor Musical*: Permite tocar, pausar e selecionar uma música.
- *Aparelho Telefônico*: Permite realizar ligações, atender chamadas e iniciar o correio de voz.
- *Navegador na Internet*: Permite exibir páginas, adicionar novas abas e atualizar páginas.

## Diagrama UML

A modelagem das funcionalidades foi feita utilizando o diagrama UML. A estrutura foi dividida em três interfaces (uma para cada funcionalidade) e a classe iPhone, que implementa todas elas.

![UML Mermaid](https://github.com/DanniNascimento/dio_desafioPOO/blob/main/UML.jpeg)

*Interfaces:*
- ReprodutorMusical
- AparelhoTelefonico
- NavegadorInternet

*Classe principal:*
- iPhone

## Estrutura do Projeto

O projeto contém as seguintes classes e interfaces:

### Interfaces
- *ReprodutorMusical*: Define métodos para controlar a reprodução de músicas.
- *AparelhoTelefonico*: Define métodos para realizar e atender chamadas, e acessar o correio de voz.
- *NavegadorInternet*: Define métodos para exibir e interagir com páginas da internet.

### Classe iPhone
- A classe iPhone implementa todas as interfaces mencionadas, simulando as funcionalidades de um iPhone real.

## Como Rodar o Projeto

### Pré-requisitos

- Java 8 ou superior instalado em seu computador.
- IDE (como IntelliJ IDEA, Eclipse ou NetBeans) ou um editor de código de sua preferência (Visual Studio Code, por exemplo).

### Passos

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/projeto-iphone.git
  ##

2. Navegue até o diretório do projeto:
   ```bash
   cd projeto-iphone
  ##

3. Compile o código:
   ```bash
    javac iPhone.java Main.java
  ##

4. Execute o código:
   ```bash
   java Main
##
Após a execução, você verá no console a simulação das funcionalidades do iPhone.

### Exemplo de Execução

 ```bash
 Selecionando música: A Cera
Tocando música...
Música pausada.
Ligando para: X XXXX-XXXX
Atendendo a chamada...
Iniciando correio de voz...
Exibindo página: www.google.com
Abrindo nova aba no navegador...
Atualizando página...

   
