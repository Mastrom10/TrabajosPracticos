package Ejercicio2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 14/06/2016.
 */
public class PilaDeCaracteresTest {

    private PilaDeCaracteres unaPila;
    private PilaDeCaracteres unaPilaConLimite;

    @Before
    public void setUp() {
        unaPila = new PilaDeCaracteres();
        unaPilaConLimite = new PilaDeCaracteres(5);

    }

    @After
    public void tearDown() {
        unaPila = null;
        unaPilaConLimite = null;
    }

    @Test
    public void testPushLimit() {
        Assert.assertTrue(unaPilaConLimite.push('g'));
        Assert.assertTrue(unaPilaConLimite.push('g'));
        Assert.assertTrue(unaPilaConLimite.push('g'));
        Assert.assertTrue(unaPilaConLimite.push('g'));
        Assert.assertTrue(unaPilaConLimite.push('g'));

        Assert.assertFalse(unaPilaConLimite.push('g'));
    }

    @Test
    public void testPushPopCorrecto() {

        unaPila.push('A');
        unaPila.push('B');
        unaPila.push('C');

        Assert.assertEquals(new Character('C'), unaPila.pop());
        Assert.assertEquals(new Character('B'), unaPila.pop());
        Assert.assertEquals(new Character('A'), unaPila.pop());

    }

    @Test
    public void testisEmpty() {

        unaPila.push('A');
        unaPila.push('B');
        unaPila.push('C');

        unaPila.pop();
        unaPila.pop();
        unaPila.pop();

        Assert.assertTrue(unaPila.isEmpty());

    }

    @Test
    public void testLenght() {

        unaPila.push('A');
        unaPila.push('B');
        unaPila.push('C');
        Assert.assertEquals(unaPila.length(), Integer.valueOf(3));

    }
}