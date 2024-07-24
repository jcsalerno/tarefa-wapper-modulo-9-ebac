# Projeto de Conversão Numérica em Java

Este projeto em Java lê um valor numérico do console, armazena esse valor em uma variável primitiva, converte o valor para um tipo wrapper e imprime ambos os valores no console.

## Estrutura do Projeto

- `NumericConversion.java`: Arquivo principal contendo a lógica do programa.

## Pré-requisitos

- Java Development Kit (JDK) 8 ou superior
- Um editor de código ou IDE de sua preferência (por exemplo, VS Code, IntelliJ IDEA, Eclipse)

## Como Executar o Projeto

1. Clone o repositório (ou copie o código) para sua máquina local.
2. Abra o projeto em seu editor de código ou IDE.
3. Compile o arquivo `NumericConversion.java`.
4. Execute o arquivo compilado.

### Passos para Compilar e Executar

1. **Compilação**:
    ```sh
    javac NumericConversion.java
    ```

2. **Execução**:
    ```sh
    java NumericConversion
    ```

## Funcionamento do Programa

1. O programa solicita ao usuário que insira um valor numérico.
2. O valor inserido é lido e armazenado em uma variável primitiva do tipo `int`.
3. O valor primitivo é convertido para o tipo wrapper `Integer`.
4. O programa imprime tanto o valor primitivo quanto o valor wrapper no console.

## Exemplo de Uso

```sh
Por favor, insira um valor numérico:
123
Valor primitivo: 123
Valor wrapper: 123
