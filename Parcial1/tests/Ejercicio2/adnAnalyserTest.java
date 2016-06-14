package Ejercicio2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 18/05/2016.
 */
public class adnAnalyserTest {
    @Test
    public void analizarADN() throws Exception {

        adnAnalyser adnA = new adnAnalyser();
        String cadenaADN = "ACCGTACCGTACCGTAAAAAAAAAAAA";
        int Largo = 3;

        String CadenaMasRepetida = adnA.analizarADN(cadenaADN, Largo);
        //Assert.assertEquals(CadenaMasRepetida, "ACC");
        System.out.println("La cadena Mas repetida y mas pequeña es: " + CadenaMasRepetida);
    }

}