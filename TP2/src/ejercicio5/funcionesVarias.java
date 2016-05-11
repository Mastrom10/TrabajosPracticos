package ejercicio5;

import javax.sound.sampled.Line;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Nicolas on 11/05/2016.
 */
public class funcionesVarias {

    public void escribirArchivo(ArrayList<String> Lineas, String pathArchivo) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathArchivo));
            for (String l :
                    Lineas) {
                bufferedWriter.write(l + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<Integer> Primos(ArrayList<Integer> todosLosNumeros) {
//TODO Hay que hacer esto!!!!
        return null;
    }


}
