package Ejercicio1.DAO;

import Ejercicio1.Entidades.Ingrediente;
import Ejercicio1.Entidades.Plato;
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
 * Created by nmastromarino on 11/05/2016.
 */
public class PlatoDAOTest {
    @Test
    public void traerUnPlato() throws Exception {
        cargarMilanga();
        Plato unPlato = PlatoDAO.traerUnPlato("Milanesa con Papas Fritas");
        Assert.assertNotNull("El objeto no existe", unPlato);
    }

    @Before
    public void SetUp() throws Exception {
        try{

            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();

            Connection con = DriverManager.getConnection("jdbc:h2:"+PathIN+";AUTO_SERVER=TRUE");

            Statement stmt = con.createStatement();

            String q3 = "DELETE FROM PLATO_INGREDIENTE";
            int rs3 = stmt.executeUpdate(q3);
            String q4 = "DELETE FROM PROMOCION";
            int rs4 = stmt.executeUpdate(q4);
            String q = "DELETE FROM INGREDIENTE";
            int rs = stmt.executeUpdate(q);
            String q2 = "DELETE FROM PLATO";
            int rs2 = stmt.executeUpdate(q2);
            String q5 = "DELETE FROM BEBIDA";
            int rs5 = stmt.executeUpdate(q5);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void cargarMilanga() throws Exception {
        Ingrediente ing1 = new Ingrediente("Carne Para Milanesa", "Carne");
        Ingrediente ing2 = new Ingrediente("Papas", "Verdura");
        Ingrediente ing3 = new Ingrediente("Pan Rallado", "Otro");
        ArrayList<Ingrediente> ingS = new ArrayList<>();
        ingS.add(ing1);
        ingS.add(ing2);
        ingS.add(ing3);
        Plato p = new Plato("Milanesa con Papas Fritas", ingS, 70f);

        boolean b = PlatoDAO.altaPlato(p);
        Assert.assertTrue(b);
    }

    @Test
    public void cargareNSALADAmIXTA() throws Exception {
        Ingrediente ing1 = new Ingrediente("Lechuga", "Verdura");
        Ingrediente ing2 = new Ingrediente("Tomate", "Verdura");
        Ingrediente ing3 = new Ingrediente("Cebolla", "Verdura");
        ArrayList<Ingrediente> ingS = new ArrayList<>();
        ingS.add(ing1);
        ingS.add(ing2);
        ingS.add(ing3);
        Plato p = new Plato("Ensalada Mixta", ingS, 50f);

        boolean b = PlatoDAO.altaPlato(p);
        Assert.assertTrue(b);
    }

    @Test
    public void cargarFidosConSalsa() throws Exception {
        Ingrediente ing1 = new Ingrediente("Fideos", "Pasta");
        Ingrediente ing2 = new Ingrediente("Salsa", "Otros");
        Ingrediente ing3 = new Ingrediente("Queso Rallado", "Otros");
        ArrayList<Ingrediente> ingS = new ArrayList<>();
        ingS.add(ing1);
        ingS.add(ing2);
        ingS.add(ing3);
        Plato p = new Plato("Fideos con Salsa", ingS, 70f);

        boolean b = PlatoDAO.altaPlato(p);
        Assert.assertTrue(b);
    }


}