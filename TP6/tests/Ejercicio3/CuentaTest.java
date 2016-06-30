package Ejercicio3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 30/06/2016.
 */
public class CuentaTest {

    Cuenta unaCuentaComun;
    Cuenta unaCuentaVipDelInterior;
    Cuenta unaCuentaVipDeCapital;

    @Before
    public void setUp() throws Exception {
        unaCuentaComun = new Cuenta(100f, 1234, 1, true);
        unaCuentaVipDelInterior = new CuentaVip(100f, 1234, 2, false);
        unaCuentaVipDeCapital = new CuentaVip(100f, 1234, 3, true);
    }

    @After
    public void tearDown() throws Exception {
        unaCuentaComun = null;
        unaCuentaVipDelInterior = null;
        unaCuentaVipDeCapital = null;
    }

    @Test
    public void depositar() throws Exception {
        unaCuentaComun.depositar(100f);
        unaCuentaVipDelInterior.depositar(100f);
        unaCuentaVipDeCapital.depositar(100f);

        Assert.assertEquals(Float.valueOf(194), unaCuentaComun.getSaldo());
        Assert.assertEquals(Float.valueOf(200), unaCuentaVipDelInterior.getSaldo());
        Assert.assertEquals(Float.valueOf(198), unaCuentaVipDeCapital.getSaldo());
    }

    @Test
    public void extraer() throws Exception {
        unaCuentaComun.extraer(50f);
        unaCuentaVipDelInterior.extraer(50f);
        unaCuentaVipDeCapital.extraer(50f);

        Assert.assertEquals(Float.valueOf(44), unaCuentaComun.getSaldo());
        Assert.assertEquals(Float.valueOf(50), unaCuentaVipDelInterior.getSaldo());
        Assert.assertEquals(Float.valueOf(48), unaCuentaVipDeCapital.getSaldo());
    }

    @Test
    public void consultarSaldo() throws Exception {
        Assert.assertEquals(Float.valueOf(94), unaCuentaComun.consultarSaldo());
        Assert.assertEquals(Float.valueOf(100), unaCuentaVipDelInterior.consultarSaldo());
        Assert.assertEquals(Float.valueOf(98), unaCuentaVipDeCapital.consultarSaldo());
    }

    @Test
    public void cambiarPin() throws Exception {
        unaCuentaComun.cambiarPin(789);
        unaCuentaVipDelInterior.cambiarPin(789);
        unaCuentaVipDeCapital.cambiarPin(789);

        Assert.assertEquals(Float.valueOf(94), unaCuentaComun.getSaldo());
        Assert.assertEquals(Float.valueOf(100), unaCuentaVipDelInterior.getSaldo());
        Assert.assertEquals(Float.valueOf(98), unaCuentaVipDeCapital.getSaldo());

        Assert.assertEquals(Integer.valueOf(789), unaCuentaComun.getPin());
        Assert.assertEquals(Integer.valueOf(789), unaCuentaVipDelInterior.getPin());
        Assert.assertEquals(Integer.valueOf(789), unaCuentaVipDeCapital.getPin());

    }

}