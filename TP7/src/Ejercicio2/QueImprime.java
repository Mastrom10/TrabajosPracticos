package Ejercicio2;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class QueImprime {

    public void set() {
        TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(1);
        set.add(1);
        set.add(3);

        System.out.println(set.size());
        System.out.println(set);

        /*
        Estas lineas imprimen:
        2
        [1, 3]
        */


        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(3);

        System.out.println(arrayList.size());
        System.out.println(arrayList);

        /*
        Estas lineas Imprimen:
            3
            [1, 1, 3]
         */

        //PODEMOS INTUIR QUE UN TreeSet NO DUPLICA OBJETOS.


    }


}
