package Ejercicio5;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Nicolas on 08/05/2016.
 */
public class Trasposer {
    ArrayList<String> matriz = new ArrayList<>();

    public void transponerMatriz(String pathIN, String pathOUT) {

        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(pathIN).getPath()));
            bf.lines().forEach(line -> {
                matriz.add(line);
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int largoX = matriz.get(0).length();
        int largoY = matriz.size();

        char[][] matrizTranspuesta = new char[largoY][largoX];

        for (int i = 0; i < largoY; i++) {
            for (int j = 0; j < largoX; j++) {
                matrizTranspuesta[j][i] = matriz.get(i).charAt(j);
            }
        }

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathOUT));
            for (int i = 0; i < largoX; i++) {
                String linea = "";
                for (int j = 0; j < largoY; j++) {
                    linea += matrizTranspuesta[i][j];
                }
                bufferedWriter.write(linea + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
