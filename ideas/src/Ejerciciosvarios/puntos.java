package Ejerciciosvarios;

import java.util.function.DoubleConsumer;

/**
 * Created by nmastromarino on 27/05/2016.
 */
public class puntos {

    public Double distanciaPromedioTresPuntos (Double x1, Double y1, Double x2, Double y2, Double x3, Double y3){
        Double P, D12, D23, D31;
        D12 = DistanciaEntre2Puntos(x1, y1, x2, y2);
        D23 = DistanciaEntre2Puntos(x2, y2, x3, y3);
        D31 = DistanciaEntre2Puntos(x3, y3, x1, y1);
        P = (D12 + D23 + D31) / 3;
        return P;
    }



    public Double DistanciaEntre2Puntos(Double x1, Double y1, Double x2,Double y2){
        return Math.hypot(x2-x1, y2-y1);
    }
}
