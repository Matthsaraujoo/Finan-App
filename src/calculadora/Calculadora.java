package calculadora;

/**
 * Classe responsável por executar operações matemáticas básicas.
 *
 * @author ...
 * @version 1.0
 */
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
