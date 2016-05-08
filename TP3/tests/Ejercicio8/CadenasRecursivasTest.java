package Ejercicio8;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 08/05/2016.
 */
public class CadenasRecursivasTest {
    @Test
    public void cadenasRecursivas() throws Exception {
        CadenasRecursivas cad = new CadenasRecursivas();
        ArrayList<String> combinaciones = cad.CadenasRecursivas(3);

        ArrayList<String> verificacion = new ArrayList<>();
        verificacion.add("BBB");
        verificacion.add("BBN");
        verificacion.add("BNB");
        verificacion.add("BNN");
        verificacion.add("NBB");
        verificacion.add("NBN");
        verificacion.add("NNB");
        verificacion.add("NNN");

        Assert.assertEquals(combinaciones, verificacion);

    }

}