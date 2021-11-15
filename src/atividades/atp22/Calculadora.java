package atividades.atp22;

/**
 * Atividade Prática 22 - Sobrecarga, Sobrescrita e Construtores
 * 
 * 1. Crie uma classe Calculadora.
 * 2. Crie o método soma que recebe dois parâmetros inteiros e retorna um inteiro com o resultado.
 * 3. Crie o método soma que recebe dois parâmetros double e retorna um double com o resultado.
 * 4. Crie o método soma que recebe três parâmetros float e retorna um float com o resultado.
 * 5. Crie o método soma que recebe três parâmetros long e retorna um long com o resultado.
 */
public class Calculadora {
    public int soma(int valor1, int valor2) {
        int resultado = valor1 + valor2;
        return resultado;
    }

    public double soma(double valor1, double valor2) {
        double resultado = valor1 + valor2;
        return resultado;
    }

    public float soma(float valor1, float valor2, float valor3) {
        float resultado = valor1 + valor2 + valor3;
        return resultado;
    }

    public long soma(long valor1, long valor2, long valor3) {
        long resultado = valor1 + valor2 + valor3;
        return resultado;
    }

}
