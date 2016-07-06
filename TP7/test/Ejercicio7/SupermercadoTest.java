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
public class SupermercadoTest {
    Caja caja1, caja2;
    Chango chango1, chango2;
    Supermercado sp;

    @Before
    public void setUp() throws Exception {
        caja1 = new Caja();
        caja2 = new Caja();
        chango1 = new Chango();
        chango2 = new Chango();
        sp = new Supermercado();
        chango1.agregarProductoAlChanguito(new Carne(121233, 100f));
        chango1.agregarProductoAlChanguito(new Lacteos(478956, 100f));
        chango1.agregarProductoAlChanguito(new Shampoo(787539, 50f));
        chango2.agregarProductoAlChanguito(new Indumentaria(6543, 500f, 42, "Levis"));
        chango2.agregarProductoAlChanguito(new Enlatados(32154, 150f));
        chango2.agregarProductoAlChanguito(new Desodorante(1515789, 450f));
        sp.agregarCaja(caja1);
        sp.agregarCaja(caja2);
    }

    @After
    public void tearDown() throws Exception {
        caja1 = null;
        caja2 = null;
        chango1 = null;
        chango2 = null;
        sp = null;
    }

    @Test
    public void liquidacionDelDia() throws Exception {

        caja1.Facturar(chango1);
        caja2.Facturar(chango2);

        Float liquidacion = sp.LiquidacionDelDia();
        Assert.assertEquals(Float.valueOf(1320), liquidacion);

    }

}