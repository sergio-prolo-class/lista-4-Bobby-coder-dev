# Lista 4 - Aplicativo de Desenho Vetorial

## Descrição

Esta aplicação permite ao usuário desenhar diversas formas geométricas na tela do computador utilizando mouse e teclado. O objetivo é exercitar o uso de polimorfismo para manipular e processar diferentes figuras geométricas.

## Funcionalidades

- Desenho de figuras (Círculo, Quadrado, Pentágono, Hexágono) com clique do mouse.
- Seleção de figura (F1-F4) e cor (F5-F8) pelo teclado.
- Alternância entre modo preenchido e vazado (tecla `F`).
- Ajuste do tamanho das figuras (`Q` diminui, `W` aumenta).
- Movimento de todas as figuras com as setas do teclado.
- Limpeza da tela (`C`).
- Exibição de informações no terminal (`P`): número de figuras, soma dos perímetros e área média.
- Encerramento do programa (`Z` ou fechando a janela).

## Controles

| Tecla         | Função                                 |
|---------------|----------------------------------------|
| F1            | Seleciona Círculo                      |
| F2            | Seleciona Quadrado                     |
| F3            | Seleciona Pentágono                    |
| F4            | Seleciona Hexágono                     |
| F5-F8         | Seleciona cor                          |
| F             | Alterna preenchimento                  |
| Q/W           | Diminui/Aumenta tamanho                |
| Setas         | Move todas as figuras                  |
| C             | Limpa a tela                           |
| P             | Mostra informações das figuras         |
| Z             | Sai do programa                        |

## Como executar

1. **Pré-requisitos:**  
   - Java 8 ou superior  
   - Gradle

2. **Clone o repositório:**
   ```sh
   git clone <url-do-repositorio>
   cd lista-4-Bobby-coder-dev
   ```

3. **Execute o projeto:**
   ```sh
   ./gradlew run
   ```

4. **Use o mouse e o teclado conforme os controles acima.**

## Estrutura do Projeto

- `src/main/java/ifsc/poo/` - Código fonte principal
- `Poligonos/` - Classes das figuras geométricas
- `interfaces/` - Interfaces auxiliares
- `Desenhar.java` - Classe responsável pelo desenho na tela
- `Comandos.java` - Lógica de controle e manipulação das figuras
- `App.java` - Classe principal

## Observações

- O terminal é usado apenas para exibir informações ao usuário.
- O programa utiliza polimorfismo para manipular diferentes tipos de figuras de forma genérica.

---

## Diagrama UML


classDiagram
    direction TB


    class Comandos {
        -figuras : List~Forma~
        -TAMANHO_MAXIMO : int
        -TAMANHO_MINIMO : int
        -formaSelecionada : int
        -indiceCor : int
        -preenchida : boolean
        -tamanho : int
        -desenhar : Desenhar

        +Comandos(Desenhar)
        +setFormaSelecionada(int)
        +setCor(int)
        +alterarPreenchida()
        +aumentarTamanho()
        +diminuirTamanho()
        +limparTela()
        +moverFiguras(int, int)
        +desenharForma(int, int)
        +mostarInformacoes()
    }

    class Desenhar {
        -draw : Draw
        -cores : Color[]
        +Desenhar()
        +getDraw() : Draw
        +desenharForma(Forma)
        +limparTela()
    }

    class Forma {
        <<abstract>>
        +x : int
        +y : int
        +tamanho : int
        +indiceCor : int
        +preenchida : boolean
        +getTamanho() : int
        +getIndiceCor() : int
        +isPreenchida() : boolean
    }
    class Circulo
    class Quadrado {
        lado : double
        numLados : int
    }
    class Pentagono {
        lado : double
        numLados : int
    }
    class Hexagono {
        lado : double
        numLados : int
    }
    class Informacoes {
        <<interface>>
        +calcularArea() : double
        +calcularPerimetro() : double
    }
    class Propriedades {
        <<interface>>
        +getLado() : double
        +setLado(double) : void
        +getNumLados() : int
    }

    App ..> Comandos
    Comandos "1" o-- "1" Desenhar
    Comandos "1" o-- "*" Forma
    Forma <|-- Circulo
    Forma <|-- Quadrado
    Forma <|-- Pentagono
    Forma <|-- Hexagono
    Circulo ..|> Informacoes
    Quadrado ..|> Informacoes
    Pentagono ..|> Informacoes
    Hexagono ..|> Informacoes
    Quadrado ..|> Propriedades
    Pentagono ..|> Propriedades
    Hexagono ..|> Propriedades
```

![Diagrama UML](docs/uml.png)

Desenvolvido para a disciplina de Programação Orientada a Objetos - IFSC São José.