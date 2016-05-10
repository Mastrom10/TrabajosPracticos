package Ejercicio1.DAO;

import Ejercicio1.Entidades.Ingrediente;

import java.io.File;
import java.sql.*;

/**
 * Created by nmastromarino on 10/05/2016.
 */
public class IngredientesDAO {


    public static boolean altaIngrediente(Ingrediente ingrediente){
        try{

            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();

            Connection con = DriverManager.getConnection("jdbc:h2:"+PathIN+";AUTO_SERVER=TRUE");

            Statement stmt = con.createStatement();

            String q = "INSERT INTO INGREDIENTE (NOMBRE, TIPO) VALUES ('"+ingrediente.nombre+"', '"+ingrediente.tipo+"')";

            int rs = stmt.executeUpdate(q);

            return rs==1;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static boolean borrarIngrediente(Ingrediente ingrediente){
        try{

            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();

            Connection con = DriverManager.getConnection("jdbc:h2:"+PathIN+";AUTO_SERVER=TRUE");

            Statement stmt = con.createStatement();

            String q = "DELETE FROM INGREDIENTE WHERE NOMBRE = '"+ingrediente.nombre+"' AND TIPO ='"+ingrediente.tipo+"'";

            int rs = stmt.executeUpdate(q);

            return rs>0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
