package Ejercicio7;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.FloatHolder;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class CajaTest {
    Caja caja1;
    Chango chango1;

    @Before
    public void setUp() throws Exception {
        caja1 = new Caja();
        chango1 = new Chango();
        chango1.agregarProductoAlChanguito(new Enlatados(123, 100f));
        chango1.agregarProductoAlChanguito(new Lacteos(456, 100f));
        chango1.agregarProductoAlChanguito(new Shampoo(789, 50f));
    }

    @After
    public void tearDown() throws Exception {
        caja1 = null;
        chango1 = null;
    }

    @Test
    public void facturar() throws Exception {

        Assert.assertEquals(Float.valueOf(230f), caja1.Facturar(chango1));

    }

    @Test
    public void promoSi2IgualesSegundoAl70() throws Exception {

        chango1.agregarProductoAlChanguito(new Enlatados(123, 100f));
        Assert.assertEquals(Float.valueOf(300f), caja1.Facturar(chango1));
    }

}