package Ejercicio1.DAO;

import Ejercicio1.Entidades.Ingrediente;
import Ejercicio1.Entidades.Plato;
import Ejercicio1.Entidades.Promocion;

import java.io.File;
import java.sql.*;

/**
 * Created by Nicolas on 11/05/2016.
 */
public class PromocionDAO {

    public static boolean AltaPromocion(Promocion p) {

        try {
            File PathINfile = new File("resources/db");
            String PathIN = PathINfile.getAbsolutePath();
            Connection con = DriverManager.getConnection("jdbc:h2:" + PathIN + ";AUTO_SERVER=TRUE");
            Statement stmt = con.createStatement();

            PlatoDAO.altaPlato(p.plato);
            String q2 = "SELECT * FROM PLATO WHERE NOMBRE = '" + p.plato.nombre + "' AND PRECIO = " + p.plato.precio + "";
            ResultSet rs2 = stmt.executeQuery(q2);
            if (rs2.next()) {
                p.plato.id = rs2.getInt("ID");
            } else {
                return false;
            }

            BebidaDAO.altaBebida(p.bebida);
            String q3 = "SELECT * FROM BEBIDA WHERE NOMBRE = '" + p.bebida.nombre + "' AND PRECIO = " + p.bebida.precio + " AND TAMANIO = '" + p.bebida.tamanio + "'";
            ResultSet rs3 = stmt.executeQuery(q3);
            if (rs3.next()) {
                p.bebida.id = rs3.getInt("ID");
            } else {
                return false;
            }

            String q4 = "INSERT INTO PROMOCION(NOMBRE, PRECIO, ID_PLATO, ID_BEBIDA) " +
                    "VALUES ('" + p.nombre + "'," + p.Precio + " , " + p.plato.id + " , " + p.bebida.id + ")";
            int rs4 = stmt.executeUpdate(q4);

            return rs4 == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
