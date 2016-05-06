package Ejercicio2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
* Created by nmastromarino on 06/05/2016.
        */
public class UnaPruebitaMasTest {
    @Test
    public void devuelveunNumeroBien() throws Exception {
        UnaPruebitaMas test = new UnaPruebitaMas();

        assertEquals(Integer.valueOf(3), test.devuelveunNumero(3));
    }

    @Test
    public void devuelveunNumeroMal() throws Exception {
        UnaPruebitaMas test = new UnaPruebitaMas();

        assertNotEquals(Integer.valueOf(3), test.devuelveunNumero(6));
    }

}