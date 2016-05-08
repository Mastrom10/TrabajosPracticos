package Ejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Nicolas on 07/05/2016.
 */
public class Palabra {

    public String laPalabra = "";
    public String laPalabraGuiones = "";
    int caracteres = 0;

    public Palabra(String unaPalabra) {
        this.laPalabra = unaPalabra;

        //Establecemos los guiones.
        this.caracteres = laPalabra.length();
        laPalabraGuiones = laPalabra.replaceAll("(?s).", "-");
    }

    public Palabra() {

        //Acá nos traemos todas las palabras del archivo
        ArrayList<String> lasPalabras = new ArrayList<>();
        try {
        BufferedReader bf = new BufferedReader(new FileReader(new File(this.getClass().getClassLoader().getResource("PalabrasAhorcado.txt").getPath())));
        bf.lines().forEach(line -> {
            lasPalabras.add(line);
        });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Generamos elegimos una palabra al azar de la lista.
        Random r = new Random();
        int Low = 1;
        int High = lasPalabras.size() + 1;
        int Result = r.nextInt(High-Low) + Low;
        laPalabra = lasPalabras.get(Result - 1);

        //Establecemos los guiones.
        this.caracteres = laPalabra.length();
        laPalabraGuiones = laPalabra.replaceAll("(?s).", "-");
    }

    public boolean verificarLetra(char unaLetra){
        boolean respuesta = false;
        unaLetra = Character.toUpperCase(unaLetra);
        for (int i = 0; i < caracteres; i++) {
            if (laPalabra.charAt(i) == unaLetra) {
                respuesta = true;

                //reemplazamos los guiones por la letra correcta
                StringBuilder palabra = new StringBuilder(laPalabraGuiones);
                palabra.setCharAt(i, unaLetra);
                laPalabraGuiones = palabra.toString();
            }
        }
        return respuesta;
    }

    public boolean verificarPalabra(){
        boolean respuesta = false;
        respuesta = laPalabraGuiones.contains("-");
        return !respuesta;
    }


}
