📘 Projeto Calculadora – FinançApp

Este projeto foi desenvolvido para a disciplina de Testes de Software, abordando:

Programação Java

Refatoração

Testes unitários

Geração de documentação JavaDoc

Uso de branches no Git

Organização de projeto

A aplicação simula o núcleo de cálculos do aplicativo FinançApp.

✔ Objetivos da Atividade

Criar uma classe Calculadora

Implementar a classe TesteCalculadora

Realizar testes unitários

Refatorar o código original

Documentar com JavaDoc

Gerar saída do console

Criar branch Refatoracao

Subir tudo para o repositório remoto no GitHub

Estrutura do Projeto
projeto_calculadora/
 └── src/
     └── calculadora/
         ├── Calculadora.java
         └── TesteCalculadora.java
 └── doc/   (gerado pelo Javadoc)
 └── prints/
         └── console.png  (captura da saída)

Calculadora.java (Refatorada)
package calculadora;

public class Calculadora {

    private int resultado;

    public int calc(int a, int b, String op) {

        switch (op) {
            case "+":
                resultado = somar(a, b);
                break;
            case "-":
                resultado = subtrair(a, b);
                break;
            case "*":
                resultado = multiplicar(a, b);
                break;
            case "/":
                resultado = dividir(a, b);
                break;
            default:
                System.out.println("Operação inválida!");
                resultado = 0;
        }

        System.out.println("Resultado = " + resultado);
        return resultado;
    }

    private int somar(int a, int b) { return a + b; }
    private int subtrair(int a, int b) { return a - b; }
    private int multiplicar(int a, int b) { return a * b; }

    private int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }
}

TesteCalculadora.java (Refatorado)
package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("---- Testes da Calculadora ----");

        System.out.println("SOMA: " + calc.calc(2, 3, "+"));
        System.out.println("SUBTRAÇÃO: " + calc.calc(10, 4, "-"));
        System.out.println("MULTIPLICAÇÃO: " + calc.calc(3, 5, "*"));
        System.out.println("DIVISÃO: " + calc.calc(8, 2, "/"));
        System.out.println("DIVISÃO POR ZERO: " + calc.calc(8, 0, "/"));
        System.out.println("OPERAÇÃO INVÁLIDA: " + calc.calc(5, 5, "x"));
    }
}

<img width="623" height="244" alt="console_print" src="https://github.com/user-attachments/assets/a4be691d-0173-40bc-b6eb-861181647ff1" />

