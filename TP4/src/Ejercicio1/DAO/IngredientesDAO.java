package Ejercicio1.DAO;

import Ejercicio1.Entidades.Ingrediente;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;

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

    public static boolean modificarIngrediente(Ingrediente IngredienteViejo, String nombreNuevo, String tipoNuevo){

        try{

            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();

            Connection con = DriverManager.getConnection("jdbc:h2:"+PathIN+";AUTO_SERVER=TRUE");

            Statement stmt = con.createStatement();

            String q = "UPDATE INGREDIENTE " +
                    "SET NOMBRE = '"+nombreNuevo+"', tipo = '"+tipoNuevo+"' " +
                    "WHERE NOMBRE = '"+IngredienteViejo.nombre+"' AND TIPO = '"+IngredienteViejo.tipo+"'";

            int rs = stmt.executeUpdate(q);

            return rs>0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


    public static ArrayList<Ingrediente> devolverIngredientesDelTipo(String tipo){
        try{
            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();
            Connection con = DriverManager.getConnection("jdbc:h2:"+PathIN+";AUTO_SERVER=TRUE");
            Statement stmt = con.createStatement();

            if (tipo != null) {
                tipo = " WHERE TIPO = '"+tipo+"'";
            } else {
                tipo = "";
            }



            String q = "SELECT * FROM INGREDIENTE" + tipo;

            ResultSet rs = stmt.executeQuery(q);

            ArrayList<Ingrediente> ali = new ArrayList<>();
            while (rs.next()){
                String n = rs.getString("NOMBRE");
                String t = rs.getString("TIPO");
                Ingrediente i = new Ingrediente(n,t);
                ali.add(i);

            }

            return ali;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Ingrediente> devolverIngredientes(){
        return devolverIngredientesDelTipo(null);
    }

    public static Ingrediente DevolverIngrediente(Ingrediente ing){
        try{
            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();
            Connection con = DriverManager.getConnection("jdbc:h2:"+PathIN+";AUTO_SERVER=TRUE");
            Statement stmt = con.createStatement();


            String q = "SELECT * FROM INGREDIENTE WHERE NOMBRE = '"+ing.nombre+"' AND TIPO = '"+ing.tipo+"'";

            ResultSet rs = stmt.executeQuery(q);
            Ingrediente ingred;
            if (rs.next()){
               ingred = new Ingrediente(rs.getString("NOMBRE"), rs.getString("TIPO"), rs.getInt("ID"));
            } else {return null;}

            return ingred;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Ingrediente DevolverIngrediente(int ID) {
        try {
            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();
            Connection con = DriverManager.getConnection("jdbc:h2:" + PathIN + ";AUTO_SERVER=TRUE");
            Statement stmt = con.createStatement();


            String q = "SELECT * FROM INGREDIENTE WHERE ID = " + ID + "";

            ResultSet rs = stmt.executeQuery(q);
            Ingrediente ingred;
            if (rs.next()) {
                ingred = new Ingrediente(rs.getString("NOMBRE"), rs.getString("TIPO"), rs.getInt("ID"));
            } else {
                return null;
            }

            return ingred;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}