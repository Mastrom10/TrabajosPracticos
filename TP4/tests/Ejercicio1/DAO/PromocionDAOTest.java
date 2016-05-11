package Ejercicio1.DAO;

import Ejercicio1.Entidades.Bebida;
import Ejercicio1.Entidades.Ingrediente;
import Ejercicio1.Entidades.Plato;
import Ejercicio1.Entidades.Promocion;
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
 * Created by Nicolas on 11/05/2016.
 */
public class PromocionDAOTest {
    @Before
    public void SetUp() throws Exception {
        try {

            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();

            Connection con = DriverManager.getConnection("jdbc:h2:" + PathIN + ";AUTO_SERVER=TRUE");

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
    public void altaPromocion() throws Exception {
        Bebida b = new Bebida("Coca cola", "600ml", 23f);
        Ingrediente ing1 = new Ingrediente("Fideos", "Pasta");
        Ingrediente ing2 = new Ingrediente("Salsa", "Otros");
        Ingrediente ing3 = new Ingrediente("Queso", "Otros");

        ArrayList<Ingrediente> ings = new ArrayList<>();
        ings.add(ing1);
        ings.add(ing2);
        ings.add(ing3);

        Plato p = new Plato("Fideos Con Salsa", ings, 100f);

        Promocion promo = new Promocion("Pasta con cocucha", p, b, 110f);

        boolean b1 = PromocionDAO.AltaPromocion(promo);

        Assert.assertTrue(b1);

    }

}