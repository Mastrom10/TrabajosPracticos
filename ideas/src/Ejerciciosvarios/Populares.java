package Ejerciciosvarios;

import java.util.ArrayList;

/**
 * Created by nmastromarino on 27/05/2016.
 */
public class Populares {


    public Integer NumMasPopular (int[] arrayEnteros, int longitud){

        int[] arrayCuenta = new int[5000];
        int NumeroMasRepetido = 5000;
        int Repeticiones = 0;

        for (int i:arrayEnteros) {
            arrayCuenta[i] += 1;
        }

        for (int i = 4999; i > 0; i--) {
            if (arrayCuenta[i] >= Repeticiones){
                Repeticiones = arrayCuenta[i];
                NumeroMasRepetido = i;
            }
        }

        return NumeroMasRepetido;
    }

}
