package Ejercicio6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 04/07/2016.
 */
public class AsistenteTest {

    @Test
    public void CrearAsistente(){
        Alumno asAlu1 = new Alumno("Homero", "Simpson", "UAI", 2);
        Presentador  asPres = new Presentador("Bojack", "Horseman", "Netflix");
        Particular asPart1 = new Particular("Pepe", "Argento", "Telefe", true);

        Assert.assertTrue(asAlu1.getNombre().equals("Homero"));
        Assert.assertTrue(asPres.getNombre().equals("Homero"));
        Assert.assertTrue(asPart1.getNombre().equals("Homero"));

    }

}