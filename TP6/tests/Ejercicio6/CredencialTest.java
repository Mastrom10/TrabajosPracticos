package Ejercicio6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 04/07/2016.
 */
public class CredencialTest {

    @Test
    public void CreacionCredencial(){
        Alumno asAlu1 = new Alumno("Homero", "Simpson", "UAI", 2);

        Credencial cred = new Credencial(asAlu1);

        Assert.assertEquals(cred.getNombre(), "Homero");
    }

}