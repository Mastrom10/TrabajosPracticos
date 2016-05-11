package ejercicio1;
//Recibir un array de enteros y devolver un array con los dos numeros mas altos de la secuencia
import java.util.ArrayList;

public class Arreglo {

    public ArrayList<Integer> dosMasAltos(ArrayList<Integer> listaNumeros) {
        ArrayList<Integer> resultado = new ArrayList<>();
        resultado.add(0);
        resultado.add(0);
        for (Integer num : listaNumeros
                ) {
            if (num > resultado.get(0)) {
                resultado.add(1, resultado.get(0));
                resultado.add(0, num);
            } else if (num > resultado.get(1)) {
                resultado.add(1, num);
            }
        }

        return resultado;
    }
}