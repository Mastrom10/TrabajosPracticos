package Ejercicio1.DAO;

import Ejercicio1.Entidades.Bebida;
import Ejercicio1.Entidades.Ingrediente;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Matias Malerba on 11/05/2016.
 */
public class BebidaDAOTest {
    @Test
    public void altaBebida() throws Exception {
        Bebida i = new Bebida("Stella Artois", "Litro", 80);
        boolean b = BebidaDAO.altaBebida(i);
        Assert.assertTrue(b);

    }

    @Test
    public void borrarBebida() throws Exception {
        altaBebida();
        Bebida i = new Bebida("Stella Artois", "Litro", 80);
        boolean b = BebidaDAO.borrarBebida(i);
        Assert.assertTrue(b);

    }

    @Test
    public void modificarBebida() throws Exception {
        Bebida i1 = new Bebida("Stella Artois", "Litro", 80);
        boolean b = BebidaDAO.altaBebida(i1);
        boolean c = BebidaDAO.modificarBebida(i1, "Corona", "750 cm3", "100");
        Assert.assertTrue(b);
        Assert.assertTrue(c);


    }

    @Test
    public void devolverBebidaTamanio() throws Exception {
        BebidaDAO.altaBebida(new Bebida("Heineken", "Litro", 80));
        BebidaDAO.altaBebida(new Bebida("Agua Saborizada", "600 cm3", 40));
        BebidaDAO.altaBebida(new Bebida("Rutini Malbec", "Litro", 450));

        ArrayList<Bebida> bebResult = BebidaDAO.devolverBebidaTamanio("Litro");

        String res = "";
        for (Bebida be :
                bebResult) {
            res += " " + be.toString();
        }

        boolean b = res.contains("200 cm3") || res.contains("150 cm3");
        Assert.assertFalse(b);

    }

    @Test
    public void devolverBebida() throws Exception {
        BebidaDAO.altaBebida(new Bebida("Heineken", "Litro", 80));
        BebidaDAO.altaBebida(new Bebida("Agua Saborizada", "600 cm3", 40));
        BebidaDAO.altaBebida(new Bebida("Rutini Malbec", "Litro", 450));

        ArrayList<Bebida> bebResult = BebidaDAO.devolverBebida();


        String res = "";
        for (Bebida be :
                bebResult) {
            res += " " + be.toString();
        }

        boolean b = res.contains("Brocoli") && res.contains("Huevos") && res.contains("Sal");
        Assert.assertTrue(b);

    }

    @Before
    public void setUp() throws Exception {
        BebidaDAO.altaBebida(new Bebida("Stella Artois", "Litro", 80));
        BebidaDAO.altaBebida(new Bebida("Stella Artois", "Porron", 40));
        BebidaDAO.altaBebida(new Bebida("Coca-Cola", "600 cm3", 40));
        BebidaDAO.altaBebida(new Bebida("Agua sin gas", "500 cm3",30));


    }

    @After
    public void tearDown() throws Exception {


    }

}