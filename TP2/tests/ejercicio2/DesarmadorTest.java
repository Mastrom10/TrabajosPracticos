package ejercicio2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Matias Malerba on 09/05/2016.
 */
public class DesarmadorTest {
    @Test
    public void obtenerNumeroConMasPares() throws Exception {
        ArrayList<Integer> arrayPrueba = new ArrayList<>();
        arrayPrueba.add(8888888);
        arrayPrueba.add(2222);
        arrayPrueba.add(123456);
        arrayPrueba.add(10);
        arrayPrueba.add(868686);
        Desarmador unArray = new Desarmador();
        int obtenerNumeroConMasPares = unArray.obtenerNumeroConMasPares(arrayPrueba);
        Assert.assertEquals(obtenerNumeroConMasPares, 8888888); //Assert para un solo resultado
    }
}