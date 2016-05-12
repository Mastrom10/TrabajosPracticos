package Ejercicio1.DAO;

import Ejercicio1.Entidades.Ingrediente;
import Ejercicio1.Entidades.Plato;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by nmastromarino on 11/05/2016.
 */
public class PlatoDAO {

    public static boolean altaPlato(Plato p){

        try{
            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();

            Connection con = DriverManager.getConnection("jdbc:h2:"+PathIN+";AUTO_SERVER=TRUE");

            Statement stmt = con.createStatement();

            String q = "INSERT INTO PLATO (NOMBRE, PRECIO) VALUES ('"+p.nombre+"',"+p.precio+")";

            int rs = stmt.executeUpdate(q);

            String q2 = "SELECT * FROM PLATO WHERE NOMBRE = '"+p.nombre+"' AND PRECIO = "+p.precio+"";

            ResultSet rs2 = stmt.executeQuery(q2);
            if (rs2.next()){
                p.id = rs2.getInt("ID");
            } else {return false;}

            for (Ingrediente i: p.ingredientes) {
                IngredientesDAO.altaIngrediente(i);
                i = IngredientesDAO.DevolverIngrediente(i);

                String q3 = "INSERT INTO PLATO_INGREDIENTE (ID_PLATO, ID_INGREDIENTE) VALUES ("+p.id+","+i.id+")";
                int rs3 = stmt.executeUpdate(q3);
            }

            return rs==1;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static Plato traerUnPlato(String nombre) {

        try {
            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();

            Connection con = DriverManager.getConnection("jdbc:h2:" + PathIN + ";AUTO_SERVER=TRUE");

            Statement stmt = con.createStatement();

            String q2 = "SELECT * FROM PLATO INNER JOIN PLATO_INGREDIENTE ON PLATO.ID = PLATO_INGREDIENTE.ID_PLATO WHERE PLATO.NOMBRE = '" + nombre + "'";
            ResultSet rs2 = stmt.executeQuery(q2);

            ArrayList<Ingrediente> ings = new ArrayList<>();
            while (rs2.next()) {
                Ingrediente ing = IngredientesDAO.DevolverIngrediente(rs2.getInt("ID_INGREDIENTE"));
                ings.add(ing);
            }

            String q3 = "SELECT * FROM PLATO WHERE NOMBRE = '" + nombre + "'";
            ResultSet rs3 = stmt.executeQuery(q3);
            Plato unplato;
            if (rs3.next()) {
                unplato = new Plato(rs3.getString("NOMBRE"), ings, rs3.getFloat("PRECIO"), rs3.getInt("ID"));
            } else {
                unplato = null;
            }
            return unplato;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
