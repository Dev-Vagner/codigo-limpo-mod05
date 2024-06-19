package br.com.vbruno.exercicio1;

public class Calculadora {
    public int adicionar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if(a == 0 || b == 0) {
            throw new IllegalArgumentException("ERROR: Não existe divisão por zero!!");
        }

        return a / b;
    }
}
