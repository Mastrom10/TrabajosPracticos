package Ejercicio1;

import org.junit.Assert;
import org.junit.Test;
import sun.rmi.runtime.Log;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 18/05/2016.
 */
public class CombinadorTest {
    @Test
    public void combinar() throws Exception {

        Combinador c = new Combinador();
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        //chars.add('D');

        ArrayList<String> resultado = c.combinar(2, chars);
        //Assert.assertEquals(resultado.size(), 12);
        System.out.println("Combinaciones 2: " + resultado);

        resultado = c.combinar(3, chars);
        //Assert.assertEquals(resultado.size(), 24);
        System.out.println("Combinaciones 3: " + resultado);

    }

}