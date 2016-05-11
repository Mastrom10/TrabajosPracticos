package ejercicio8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 11/05/2016.
 */
public class CaracolTest {
    @Test
    public void diasParaSalir() throws Exception {
        Caracol c = new Caracol();
        Float aFloat = c.DiasParaSalir(10f, 3f, 1f);
        Assert.assertEquals(new Float(5), aFloat);
    }

}