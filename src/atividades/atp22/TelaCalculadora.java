package atividades.atp22;

/**
 * Atividade Prática 22 - Sobrecarga, Sobrescrita e Construtores
 * 
 * 1. Crie uma classe Tela com um método main
 * 2. Crie um objeto da classe Calculadora
 * 3. Chame cada método criado
 * 4. Imprima os resultados.
 */
public class TelaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultadoInt = calculadora.soma(25, 35);
        double resultadoDouble = calculadora.soma(23.3333, 11.1111);
        float resultadoFloat = calculadora.soma(23.3333f, 11.1111f, 45.5555f);
        long resultadoLong = calculadora.soma(12345, 20000, 10000);

        System.out.printf("Resultado soma int: %d\n", resultadoInt);
        System.out.printf("Resultado soma double: %.4f\n", resultadoDouble);
        System.out.printf("Resultado soma float: %.4f\n", resultadoFloat);
        System.out.printf("Resultado soma long: %d\n", resultadoLong);
    }   
}
