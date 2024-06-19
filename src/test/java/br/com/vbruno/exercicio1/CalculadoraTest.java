package br.com.vbruno.exercicio1;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testAdicionar_HappyPath() {
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 5;

        int resultadoRetornado = calculadora.adicionar(2, 3);

        Assert.assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testSubtrair_HappyPath() {
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 1;

        int resultadoRetornado = calculadora.subtrair(3, 2);

        Assert.assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testMultiplicar_HappyPath() {
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 6;

        int resultadoRetornado = calculadora.multiplicar(3, 2);

        Assert.assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testDividir_HappyPath() {
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 2;

        int resultadoRetornado = calculadora.dividir(6, 3);

        Assert.assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividir_ErroDivisaoPorZero() {
        Calculadora calculadora = new Calculadora();

        calculadora.dividir(3, 0);
    }
}
