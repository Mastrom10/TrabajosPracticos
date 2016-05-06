package Ejercicio1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 06/05/2016.
 */
public class expresionAritmeticaTest {
    @Test
    public void calcularString() throws Exception {
        String exp = "9 + 3";
        expresionAritmetica calculadora = new expresionAritmetica();

        double resultado = calculadora.CalcularString(exp);
        Assert.assertEquals(12d, resultado, 0);

        exp = "9 - 3";
        resultado = calculadora.CalcularString(exp);
        Assert.assertEquals(6d, resultado, 0);

        exp = "9 * 3";
        resultado = calculadora.CalcularString(exp);
        Assert.assertEquals(27d, resultado, 0);

        exp = "9 / 3";
        resultado = calculadora.CalcularString(exp);
        Assert.assertEquals(3d, resultado, 0);
    }


}