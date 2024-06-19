package br.com.vbruno.exercicio2;

public class Fibonacci {
    private static int MAX_ELEMENTS = 100;
    private static long[] elementosFib = new long[MAX_ELEMENTS];

    public static long encontrarElementoPD(int n) {
        for(int i = 0; i < MAX_ELEMENTS; i++) {
            elementosFib[i] = -1;
        }

        return encontrarElemento(n);
    }

    private static long encontrarElemento(int n) {
        if(elementosFib[n] == -1) {
            if(n <= 1) {
                elementosFib[n] = n;
            } else {
                elementosFib[n] = encontrarElemento(n - 1) + encontrarElemento(n - 2);
            }
        }

        return elementosFib[n];
    }
}
