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
}
