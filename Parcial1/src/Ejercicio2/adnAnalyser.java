package Ejercicio2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nicolas on 18/05/2016.
 */
public class adnAnalyser {

    public String analizarADN(String cadena, int largoPatron) {

        if (largoPatron > cadena.length()) {
            return null;
        }

        HashMap<String, Integer> secuencias = new HashMap<>();
        for (int i = 0; i < cadena.length() - largoPatron; i++) {
            String sec = cadena.substring(i, i + largoPatron);
            if (secuencias.containsKey(sec)) {
                secuencias.put(sec, secuencias.get(sec) + 1);
            } else {
                secuencias.put(sec, 1);
            }
        }
        String respuesta = "";
        Integer CantidadRepe = 0;
        Integer ValorRespuesta = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : secuencias.entrySet()) {
            if (entry.getValue() >= CantidadRepe) {
                CantidadRepe = entry.getValue();
                Integer temVal = CalcularValor(entry.getKey());
                if (entry.getValue() > CantidadRepe) {
                    respuesta = entry.getKey();
                    ValorRespuesta = temVal;
                } else if (temVal < ValorRespuesta) {
                    respuesta = entry.getKey();
                    ValorRespuesta = temVal;
                }

            }
        }
        return respuesta;
    }


    public int CalcularValor(String palabra) {
        int Respuesta = 0;
        for (Character c : palabra.toCharArray()) {
            switch (c) {
                case 'A':
                    Respuesta += 1;
                    break;
                case 'C':
                    Respuesta += 2;
                    break;
                case 'G':
                    Respuesta += 3;
                    break;
                case 'T':
                    Respuesta += 4;
                    break;
                default:
                    break;
            }
        }
        return Respuesta;
    }
}


