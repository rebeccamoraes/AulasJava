package atividades.atp30;

/**
 * Realiza as 4 operações: soma, subtração, multiplicação e divisão
 */
public class Calculadora {

    /**
     * Some dois números
     * 
     * @param num1 inteiro a ser somado
     * @param num2 inteiro a ser somado
     * @return resultado inteiro da soma
     */
    public int soma(int num1, int num2) {
        return num1 + num2;
    }
    
    /**
     * Subtrai o segundo número do primeiro
     * 
     * @param num1 inteiro a ser subtraido
     * @param num2 inteiro a subtrair
     * @return retultado inteiro da subtração
     */
    public int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Multiplica dois números inteiros
     * 
     * @param num1 inteiro a ser multiplicado
     * @param num2 inteiro a ser multiplicado
     * @return resultado inteiro da multiplicação
     */
    public int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Divide dois números inteiros
     * 
     * @param dividendo inteiro a ser dividido
     * @param divisor inteiro divisor
     * @return resultado real da divisão
     */
    public double divisao(int dividendo, int divisor) {
        if(divisor == 0) {
            throw new ArithmeticException("Divisão por 0 não é permitida.");
        }
        return (double)dividendo / (double)divisor;
    }   
}
