package Ejercicio1;

import java.util.ArrayList;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class VerificacionCodigo {

    ArrayList arrayListNoTipado = new ArrayList();
    ArrayList<String> arrayListTipado = new ArrayList<>();


    void verificacion1() {
        //OK COMPILA
        arrayListNoTipado.add("unElemento");
        //OK COMPILA
        arrayListTipado.add("UnElemento");

        //NO COMPILA, se espera un string y se obtiene un Object.
        // String unElemento = arrayListNoTipado.get(0);

        //OK COMPILA
        String otroElemento = arrayListTipado.get(0);

        //OK COMPILA
        arrayListNoTipado.add(3);

        //NO COMPILA, TIPOS INCOMPATIBLES.
        //arrayListTipado.add(3);


    }
}
