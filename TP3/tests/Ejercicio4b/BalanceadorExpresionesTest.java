package Ejercicio4b;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 08/05/2016.
 */
public class BalanceadorExpresionesTest {

    BalanceadorExpresiones balanceador;

    @After
    public void tearDown() throws Exception {
        balanceador = null;

    }

    @Before
    public void setUp() throws Exception {
        balanceador = new BalanceadorExpresiones();

    }

    @Test
    public void verificarExpresionOK() throws Exception {
        String expresion = "123456789";
        Assert.assertTrue(balanceador.verificarExpresion(expresion));
        expresion = "(987)";
        Assert.assertTrue(balanceador.verificarExpresion(expresion));
        expresion = "[987]";
        Assert.assertTrue(balanceador.verificarExpresion(expresion));
        expresion = "{987}";
        Assert.assertTrue(balanceador.verificarExpresion(expresion));
        expresion = "([{987}])";
        Assert.assertTrue(balanceador.verificarExpresion(expresion));
        expresion = "(987)(asd)";
        Assert.assertTrue(balanceador.verificarExpresion(expresion));
        expresion = "[(987)(asd)]";
        Assert.assertTrue(balanceador.verificarExpresion(expresion));
    }

    @Test
    public void verificarExpresionMAL() throws Exception {
        String expresion = "(asdasd";
        Assert.assertFalse(balanceador.verificarExpresion(expresion));
        expresion = "987)";
        Assert.assertFalse(balanceador.verificarExpresion(expresion));
        expresion = "987]";
        Assert.assertFalse(balanceador.verificarExpresion(expresion));
        expresion = "[987";
        Assert.assertFalse(balanceador.verificarExpresion(expresion));
        expresion = "{987";
        Assert.assertFalse(balanceador.verificarExpresion(expresion));
        expresion = "987}";
        Assert.assertFalse(balanceador.verificarExpresion(expresion));
        expresion = "([{987})";
        Assert.assertFalse(balanceador.verificarExpresion(expresion));
        expresion = "(987(asd)";
        Assert.assertFalse(balanceador.verificarExpresion(expresion));
        expresion = "[987)asd)]";
        Assert.assertFalse(balanceador.verificarExpresion(expresion));
    }

}