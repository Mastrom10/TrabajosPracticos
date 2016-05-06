package Ejercicio1;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by nmastromarino on 06/05/2016.
 */
public class ClasePrueba1Test {

    @Test
    public void metodoDePrueba() throws Exception {
        Assert.assertFalse(new ClasePrueba1().metodoDePrueba());
    }

}