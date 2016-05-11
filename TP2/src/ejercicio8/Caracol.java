package ejercicio8;

import java.util.Scanner;

/**
 * Created by Matias Malerba on 08/05/2016.
 */
public class Caracol {

    public Float DiasParaSalir(Float profundidad, Float subePorDia, Float seResbalaPorDia){
        if (subePorDia <= seResbalaPorDia){
            return -1f;
        }
        Float Respuesta =  profundidad / (subePorDia - seResbalaPorDia);
        return Respuesta;
    }
}