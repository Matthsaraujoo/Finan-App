package calculadora;

/**
 * Classe utilizada para validar o funcionamento da Calculadora.
 */
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
