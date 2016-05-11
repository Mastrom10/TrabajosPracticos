package Ejercicio1.DAO;

import Ejercicio1.Entidades.Ingrediente;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 10/05/2016.
 */
public class IngredientesDAOTest {
    @Test
    public void devolverIngredientesDelTipo() throws Exception {
        IngredientesDAO.altaIngrediente(new Ingrediente("Brocoli", "Verduras"));
        IngredientesDAO.altaIngrediente(new Ingrediente("Huevos", "Carnes"));
        IngredientesDAO.altaIngrediente(new Ingrediente("Sal", "Condimentos"));

        ArrayList<Ingrediente> aliResult = IngredientesDAO.devolverIngredientesDelTipo("Verduras");

        String res = "";
        for (Ingrediente in :
                aliResult) {
            res += " " + in.toString();
        }

        boolean b = res.contains("Carnes") || res.contains("Condimentos");
        Assert.assertFalse(b);
    }

    @Test
    public void devolverIngredientes() throws Exception {
        IngredientesDAO.altaIngrediente(new Ingrediente("Brocoli", "Verduras"));
        IngredientesDAO.altaIngrediente(new Ingrediente("Huevos", "Carnes"));
        IngredientesDAO.altaIngrediente(new Ingrediente("Sal", "Condimentos"));

        ArrayList<Ingrediente> aliResult = IngredientesDAO.devolverIngredientes();


        String res = "";
        for (Ingrediente in :
                aliResult) {
            res += " " + in.toString();
        }

        boolean b = res.contains("Brocoli") && res.contains("Huevos") && res.contains("Sal");
        Assert.assertTrue(b);
    }

    @Test
    public void modificarIngrediente() throws Exception {
        Ingrediente i1 = new Ingrediente("Brocoli", "Verduras");
        boolean b = IngredientesDAO.altaIngrediente(i1);
        boolean c = IngredientesDAO.modificarIngrediente(i1, "Espinaca", "Verduras");
        Assert.assertTrue(b);
        Assert.assertTrue(c);
    }

    @Test
    public void altaIngrediente() throws Exception {
        Ingrediente i = new Ingrediente("Papa", "Verduras");
        boolean b = IngredientesDAO.altaIngrediente(i);
        Assert.assertTrue(b);

    }

    @Test
    public void borrarIngrediente() throws Exception {
        altaIngrediente();
        Ingrediente i = new Ingrediente("Papa", "Verduras");
        boolean b = IngredientesDAO.borrarIngrediente(i);
        Assert.assertTrue(b);
    }


    @Before
    public void setUp() throws Exception {
        IngredientesDAO.altaIngrediente(new Ingrediente("Papa", "Verdura"));
        IngredientesDAO.altaIngrediente(new Ingrediente("Carne Para Milanesa", "Carne"));
        IngredientesDAO.altaIngrediente(new Ingrediente("Pan Rallado", "Otro"));
        IngredientesDAO.altaIngrediente(new Ingrediente("Huevo", "Otro"));
        IngredientesDAO.altaIngrediente(new Ingrediente("Lechuga", "Verdura"));
        IngredientesDAO.altaIngrediente(new Ingrediente("Tomate", "Verdura"));
        IngredientesDAO.altaIngrediente(new Ingrediente("Fideos", "Pasta"));
        IngredientesDAO.altaIngrediente(new Ingrediente("Salsa", "Otro"));
        IngredientesDAO.altaIngrediente(new Ingrediente("Cebolla", "Verdura"));
    }

    @After
    public void tearDown() throws Exception {


    }
}