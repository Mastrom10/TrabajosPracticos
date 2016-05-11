package ejercicio1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Matias Malerba on 08/05/2016.
 */
public class ArregloTest {
    @Test
    public void dosMasAltos() throws Exception {
        ArrayList<Integer> arrayPrueba = new ArrayList<>();
        arrayPrueba.add(5);
        arrayPrueba.add(500);
        arrayPrueba.add(8);
        arrayPrueba.add(10);
        arrayPrueba.add(109);
        arrayPrueba.add(225);
        Arreglo unArreglo = new Arreglo();
        ArrayList<Integer> resultado = unArreglo.dosMasAltos(arrayPrueba);
        Assert.assertEquals(new Integer(500), resultado.get(0));
        Assert.assertEquals(new Integer(225), resultado.get(1));
    }

}