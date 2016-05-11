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
    @Before
    public void setUp() throws Exception {
        try{

            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();

            Connection con = DriverManager.getConnection("jdbc:h2:"+PathIN+";AUTO_SERVER=TRUE");

            Statement stmt = con.createStatement();

            String q3 = "DELETE FROM PLATO_INGREDIENTE";
            int rs3 = stmt.executeUpdate(q3);
            String q = "DELETE FROM INGREDIENTE";
            int rs = stmt.executeUpdate(q);
            String q2 = "DELETE FROM PLATO";
            int rs2 = stmt.executeUpdate(q2);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() throws Exception {

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
        Plato p = new Plato("Milanesa con Papas Fritas", ingS, 10f);

        boolean b = PlatoDAO.altaPlato(p);
        Assert.assertTrue(b);
    }

}