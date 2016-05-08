package Ejercicio8;

import java.util.ArrayList;

/**
 * Created by Nicolas on 08/05/2016.
 */
public class CadenasRecursivas {

    ArrayList<String> Respuesta;

    public ArrayList<String> CadenasRecursivas(int tam) {
        ArrayList<String> Respuesta = new ArrayList<>();
        if (tam == 1) {
            Respuesta.add("B");
            Respuesta.add("N");
        }
        if (tam > 0) {
            for (String a : CadenasRecursivas(tam - 1)) {
                Respuesta.add(a + "B");
                Respuesta.add(a + "N");
            }
        }
        return Respuesta;

    }

}
