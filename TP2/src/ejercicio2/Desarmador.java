package ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matias Malerba on 09/05/2016.
 */
public class Desarmador {

    public boolean esPar(int i){

        boolean esPar = i%2==0;
        return esPar;

    }

    public List<Integer> separarDigitos (int cifra){
        List <Integer> cifrasDesarmados = new ArrayList<>();
        cifrasDesarmados.add(cifra);
        while (cifra > 0) {
            cifra = cifra/10;
            cifrasDesarmados.add(cifra);
        }
        return cifrasDesarmados;
    }

     public int contarPares(List<Integer> numeros) {
        int cantidadPares = 0;
        for (int i: numeros) {
            if (esPar(i)) cantidadPares++;
        }
            return cantidadPares;
    }
    public int obtenerNumeroConMasPares(List<Integer> numeros) {
        int numeroConMasPares =0;
        int mayorCantDePares = 0;
        for (int i: numeros) {
            int paresEnI = contarPares(separarDigitos(i));
            if (paresEnI > mayorCantDePares){
                numeroConMasPares = i;
                mayorCantDePares = paresEnI;
            }
        }
        return numeroConMasPares;
    }
}

