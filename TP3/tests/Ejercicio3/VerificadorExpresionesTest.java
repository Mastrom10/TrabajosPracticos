package Ejercicio3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 06/05/2016.
 */
public class VerificadorExpresionesTest {


    VerificadorExpresiones verif;
    @Before
    public void setUp() throws Exception {
       verif = new VerificadorExpresiones();
    }

    @After
    public void tearDown() throws Exception {
        verif = null;
    }

    @Test
    public void telefonoOK() throws Exception {
        String unTelefono = "12345678";
        Assert.assertTrue(verif.telefonoOK(unTelefono));

        unTelefono = "1234-5678";
        Assert.assertTrue(verif.telefonoOK(unTelefono));
        unTelefono = "1234.5678";
        Assert.assertTrue(verif.telefonoOK(unTelefono));
        unTelefono = "1234 5678";
        Assert.assertTrue(verif.telefonoOK(unTelefono));
        unTelefono = "011 1234 5678";
        Assert.assertTrue(verif.telefonoOK(unTelefono));
        unTelefono = "011-1234 5678";
        Assert.assertTrue(verif.telefonoOK(unTelefono));
        unTelefono = "54-011-1234-5678";
        Assert.assertTrue(verif.telefonoOK(unTelefono));
    }

    @Test
    public void telefonoMAL() throws Exception {
        String unTelefono = "1234awd5678";
        Assert.assertFalse(verif.telefonoOK(unTelefono));
        unTelefono = "1234567";
        Assert.assertFalse(verif.telefonoOK(unTelefono));
        unTelefono = "123456789";
        Assert.assertFalse(verif.telefonoOK(unTelefono));
        unTelefono = "1234*5678";
        Assert.assertFalse(verif.telefonoOK(unTelefono));
        unTelefono = "0223-123-4567";
        Assert.assertFalse(verif.telefonoOK(unTelefono));
        unTelefono = "12345678912345";
        Assert.assertFalse(verif.telefonoOK(unTelefono));
    }

    @Test
    public void mailOK() throws Exception {
        String unMail = "very.common@example.com";
        Assert.assertTrue(verif.mailOK(unMail));
        unMail = "abcdefghixyz@example1.com";
        Assert.assertTrue(verif.mailOK(unMail));
        unMail = "abc.defghi.xyz@example-1.com";
        Assert.assertTrue(verif.mailOK(unMail));
        unMail = "niceandsimple@example.com";
        Assert.assertTrue(verif.mailOK(unMail));
        unMail = "#!$%&'*+-/=?^_`{}|~@example.org";
        Assert.assertTrue(verif.mailOK(unMail));
        unMail = "a.little.lengthy.but.fine@dept.example.com";
        Assert.assertTrue(verif.mailOK(unMail));
    }

    @Test
    public void mailMAL() throws Exception {
        String unMail = "A@b@c@example.com";
        Assert.assertFalse(verif.mailOK(unMail));
        unMail = "just\"not\"right@example.com";
        Assert.assertFalse(verif.mailOK(unMail));
        unMail = "john..doe@example.com";
        Assert.assertFalse(verif.mailOK(unMail));
        unMail = "john.doe@example..com";
        Assert.assertFalse(verif.mailOK(unMail));
    }

    @Test
    public void fechaOK() throws Exception {
        String unafecha = "02/02/2015";
        Assert.assertTrue(verif.fechaOK(unafecha));
    }
    @Test
    public void fechaMAL1() throws Exception {
        String unafecha = "02-02-2015";
        Assert.assertFalse(verif.fechaOK(unafecha));
    }
    @Test
    public void fechaMAL2() throws Exception {
        String unafecha = "02-02-2015";
        Assert.assertFalse(verif.fechaOK(unafecha));
    }
    @Test
    public void fechaMAL3() throws Exception {
        String unafecha = "02/02/123";
        Assert.assertFalse(verif.fechaOK(unafecha));
    }
    @Test
    public void fechaMAL4() throws Exception {
        String unafecha = "31/55/2015";
        Assert.assertFalse(verif.fechaOK(unafecha));
    }

}