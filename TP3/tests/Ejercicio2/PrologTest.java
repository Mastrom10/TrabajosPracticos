package Ejercicio2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 06/05/2016.
 */
public class PrologTest {
    @Test
    public void esHermano() throws Exception {
        Prolog prolog = new Prolog();

        Assert.assertTrue(prolog.esHermano("Mariano", "Matías"));
    }

    @Test
    public void esAbuelo() throws Exception {
        Prolog prolog = new Prolog();

        Assert.assertTrue(prolog.esAbuelo("Ana", "Juan"));
    }

}