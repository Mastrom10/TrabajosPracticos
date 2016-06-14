package Ejercicio1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 14/06/2016.
 */
public class NumeroComplejoTest {


    @Test
    public void TestCrearUnNumeroImaginario() {
        NumeroComplejo nc = new NumeroComplejo("44 + i23");
        NumeroComplejo nc2 = new NumeroComplejo(44f, 23f);

        Assert.assertEquals(nc, nc2);

    }

    @Test
    public void testSumarNumerosComplejos() {
        NumeroComplejo nc1 = new NumeroComplejo("50 + i20");
        NumeroComplejo nc2 = new NumeroComplejo("25 + i15");

        NumeroComplejo Resultado = nc1.Sumar(nc2);

        Assert.assertEquals(Resultado, new NumeroComplejo("75 + i35"));
    }

    @Test
    public void testRestarNumerosComplejos() {
        NumeroComplejo nc1 = new NumeroComplejo("50 + i20");
        NumeroComplejo nc2 = new NumeroComplejo("25 + i15");

        NumeroComplejo Resultado = nc1.Restar(nc2);

        Assert.assertEquals(Resultado, new NumeroComplejo("25 + i5"));
    }

}