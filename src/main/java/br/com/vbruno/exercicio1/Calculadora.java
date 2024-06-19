package br.com.vbruno.exercicio1;

/**
 * Classe utilizada para simular uma calculadora
 */
public class Calculadora {

    /**
     * Calcula a adição entre dois números
     *
     * @param a O primeiro número a ser usado no cálculo de adição
     * @param b O segundo número a ser usado no cálculo de adição
     * @return o número inteiro gerado pela adição dos dois números
     */
    public int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Calcula a subtração entre dois números
     *
     * @param a O primeiro número a ser usado no cálculo de subtração
     * @param b O segundo número a ser usado no cálculo de subtração
     * @return o número inteiro gerado pela subtração dos dois números
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Calcula a multiplicação entre dois números
     *
     * @param a O primeiro número a ser usado no cálculo de multiplicação
     * @param b O segundo número a ser usado no cálculo de multiplicação
     * @return o número inteiro gerado pela multiplicação dos dois números
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Calcula a divisão entre dois números
     *
     * dividir(0, b), dividir(a, 0) ou dividir(0, 0) gera um erro, pois não existe divisão por 0
     *
     * @param a O primeiro número a ser usado no cálculo de divisão
     * @param b O segundo número a ser usado no cálculo de divisão
     * @return o número inteiro gerado pela divisão dos dois números
     */
    public int dividir(int a, int b) {
        if(a == 0 || b == 0) {
            throw new IllegalArgumentException("ERROR: Não existe divisão por zero!!");
        }

        return a / b;
    }
}
