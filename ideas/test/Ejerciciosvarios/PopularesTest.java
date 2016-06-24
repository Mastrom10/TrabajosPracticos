package Ejerciciosvarios;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 27/05/2016.
 */
public class PopularesTest {
    @Test
    public void numMasPopular() throws Exception {
        Populares p = new Populares();
        int[] fac = {2,7,5,6,9,33,55,44,22,44,66,22,9,22};
        p.NumMasPopular(fac, 5);

        Assert.assertEquals(22, p.NumMasPopular(fac, 5),0);
    }

}