package br.com.vbruno.exercicio2;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    @Test
    public void testFibonacci_HappyPathPrimeiroElemento() {
        Fibonacci fibonacci = new Fibonacci();
        long resultadoEsperado = 0;

        long resultadoRetornado = fibonacci.encontrarElementoPD(0);

        Assert.assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testFibonacci_HappyPathSegundoElemento() {
        Fibonacci fibonacci = new Fibonacci();
        long resultadoEsperado = 1;

        long resultadoRetornado = fibonacci.encontrarElementoPD(1);

        Assert.assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testFibonacci_HappyPathOitavoElemento() {
        Fibonacci fibonacci = new Fibonacci();
        long resultadoEsperado = 21;

        long resultadoRetornado = fibonacci.encontrarElementoPD(8);

        Assert.assertEquals(resultadoEsperado, resultadoRetornado);
    }
}
