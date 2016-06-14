package Ejercicio1;

import java.util.ArrayList;

/**
 * Created by Nicolas on 18/05/2016.
 */
public class Combinador {


    public Combinador() {
    }

    public ArrayList<String> combinar(int k, ArrayList<Character> caracteres) {

        ArrayList<String> Respuesta = new ArrayList<>();


        //Caso Base
        if (k == 1) {
            for (Character a : caracteres) {
                Respuesta.add(String.valueOf(a));
            }
        }

        //Caso Recursivo
        if (k > 0) {
            for (Character a : caracteres) {
                for (String b : combinar(k - 1, caracteres)) {
                    if (!b.contains(String.valueOf(a)))
                        Respuesta.add(b + a);
                }
            }
        }
        return Respuesta;
    }
}
