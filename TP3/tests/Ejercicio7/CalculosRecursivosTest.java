package Ejercicio7;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Nicolas on 11/05/2016.
 */
public class CalculosRecursivosTest {
    CalculosRecursivos calculador;

    @Before
    public void setUp() throws Exception {
        calculador = new CalculosRecursivos();
    }

    @After
    public void tearDown() throws Exception {
        calculador = null;
    }

    @Test
    public void calculoFactorial() throws Exception {
        Assert.assertEquals(120, calculador.calculoFactorial(5));
    }

    @Test
    public void calculoFibonacci() throws Exception {
        Assert.assertEquals(0, calculador.calculoFibonacci(0));
        Assert.assertEquals(1, calculador.calculoFibonacci(1));
        Assert.assertEquals(1, calculador.calculoFibonacci(2));
        Assert.assertEquals(2, calculador.calculoFibonacci(3));
        Assert.assertEquals(3, calculador.calculoFibonacci(4));
        Assert.assertEquals(5, calculador.calculoFibonacci(5));
        Assert.assertEquals(8, calculador.calculoFibonacci(6));
    }

}