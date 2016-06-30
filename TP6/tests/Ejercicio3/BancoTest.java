package Ejercicio3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 30/06/2016.
 */
public class BancoTest {

    Banco elBanco;
    Cuenta unaCuentaComun;
    Cuenta unaCuentaVipDelInterior;
    Cuenta unaCuentaVipDeCapital;
    @Before
    public void setUp() throws Exception {
        elBanco = new Banco();
        unaCuentaComun = new Cuenta(100f, 1234, 1, true);
        unaCuentaVipDelInterior = new CuentaVip(100f, 1234, 2, false);
        unaCuentaVipDeCapital = new CuentaVip(100f, 1234, 3, true);
        elBanco.agregarCuenta(unaCuentaComun);
        elBanco.agregarCuenta(unaCuentaVipDelInterior);
        elBanco.agregarCuenta(unaCuentaVipDeCapital);

    }

    @After
    public void tearDown() throws Exception {
        elBanco = null;
        unaCuentaComun = null;
        unaCuentaVipDelInterior = null;
        unaCuentaVipDeCapital = null;
    }

    @Test
    public void obtenerCuenta() throws Exception {

        Cuenta unaCuenta = elBanco.ObtenerCuenta(1);
        Assert.assertEquals(unaCuentaComun, unaCuenta);

    }

    @Test
    public void informeDeSaldo() throws Exception {

        Assert.assertEquals(Float.valueOf(300), elBanco.InformeDeSaldo());

    }

}