# Fila de Prioridade com Heap

Trabalho prático da disciplina de Estrutura de Dados.
Implementação de uma Fila de Prioridade utilizando a estrutura Heap Binário para simular a triagem de um hospital.

## Compilação

Na pasta raiz do projeto, execute:

```bash
mkdir -p bin
javac -d bin src/entidades/*.java src/estatica/*.java src/*.java
```

## Execução

Após compilar, execute a classe Main:

```bash
java -cp bin Main
```

## Gerar Javadoc localmente

```bash
javadoc -d doc -sourcepath src -subpackages estatica:entidades
```
