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
}
