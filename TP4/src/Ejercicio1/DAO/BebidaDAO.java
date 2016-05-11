package Ejercicio1.DAO;

import Ejercicio1.Entidades.Bebida;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Matias Malerba on 11/05/2016.
 */
public class BebidaDAO {

    public static boolean altaBebida(Bebida bebida){
        try{

            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();

            Connection con = DriverManager.getConnection("jdbc:h2:"+PathIN+";AUTO_SERVER=TRUE");

            Statement stmt = con.createStatement();

            String q = "INSERT INTO BEBIDA (NOMBRE, TAMANIO, PRECIO) VALUES ('"+bebida.nombre+"', '"+bebida.tamanio+"','"+bebida.precio+")";

            int rs = stmt.executeUpdate(q);

            return rs==1;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static boolean borrarBebida(Bebida bebida){
        try{

            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();

            Connection con = DriverManager.getConnection("jdbc:h2:"+PathIN+";AUTO_SERVER=TRUE");

            Statement stmt = con.createStatement();

            String q = "DELETE FROM BEBIDA WHERE NOMBRE = '"+bebida.nombre+"' AND TAMANIO ='"+bebida.tamanio+"'AND PRECIO = '"+bebida.precio+"";

            int rs = stmt.executeUpdate(q);

            return rs>0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static boolean modificarBebida(Bebida BebidaViejo, String nombreNuevo, String tamanioNuevo, String precioNuevo){

        try{

            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();

            Connection con = DriverManager.getConnection("jdbc:h2:"+PathIN+";AUTO_SERVER=TRUE");

            Statement stmt = con.createStatement();

            String q = "UPDATE BEBIDA " +
                    "SET NOMBRE = '"+nombreNuevo+"', TAMANIO = '"+tamanioNuevo+"', PRECIO = '"+precioNuevo+"' " +
                    "WHERE NOMBRE = '"+BebidaViejo.nombre+"' AND TAMANIO = '"+BebidaViejo.tamanio+"' AND PRECIO = '"+BebidaViejo.precio+"'";

            int rs = stmt.executeUpdate(q);

            return rs>0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


    public static ArrayList<Bebida> devolverBebidaTamanio(String tamanio){
        try{
            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();
            Connection con = DriverManager.getConnection("jdbc:h2:"+PathIN+";AUTO_SERVER=TRUE");
            Statement stmt = con.createStatement();

            if (tamanio != null) {
                tamanio = " WHERE TAMANIO = '"+tamanio+"'";
            } else {
                tamanio = "";
            }

            String q = "SELECT * FROM BEBIDA" + tamanio;

            ResultSet rs = stmt.executeQuery(q);

            ArrayList<Bebida> beb = new ArrayList<>();
            while (rs.next()){
                String n = rs.getString("NOMBRE");
                String t = rs.getString("TAMANIO");
                Float p = rs.getFloat("PRECIO");

                Bebida i = new Bebida(n, t, p);
                beb.add(i);

            }

            return beb;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Bebida> devolverBebida(){
        return devolverBebidaTamanio(null);
    }

    public static Bebida DevolverBebida(Bebida beb){
        try{
            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();
            Connection con = DriverManager.getConnection("jdbc:h2:"+PathIN+";AUTO_SERVER=TRUE");
            Statement stmt = con.createStatement();


            String q = "SELECT * FROM BEBIDA WHERE NOMBRE = '"+beb.nombre+"' AND TAMANIO = '"+beb.tamanio+"'AND PRECIO = '"+beb.precio+"'";

            ResultSet rs = stmt.executeQuery(q);
            Bebida bebid;
            if (rs.next()){
                bebid = new Bebida(rs.getString("NOMBRE"), rs.getString("TAMANIO"), rs.getFloat("PRECIO"), rs.getInt("ID"));
            } else {return null;}

            return bebid;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}