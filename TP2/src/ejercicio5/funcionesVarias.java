package ejercicio5;

import javax.sound.sampled.Line;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Nicolas on 11/05/2016.
 */
public class funcionesVarias {




    public void Separador(ArrayList<Integer> todosLosNumeros) {

        ArrayList<String> NumerosPrimos = new ArrayList<>();
        ArrayList<String> NumerosDivisores3000 = new ArrayList<>();
        ArrayList<Integer> SoloPares = new ArrayList<>();
        ArrayList<Integer> SoloImpares = new ArrayList<>();
        ArrayList<String> PromediosParesImares = new ArrayList<>();

        for (Integer i: todosLosNumeros) {
            if (esPrimo(i)){
                NumerosPrimos.add(i.toString());
            }
            if (esDivisor3000(i)){
                NumerosDivisores3000.add(i.toString());
            }
            if (esPar(i)){
                SoloPares.add(i);
            }else {
                SoloImpares.add(i);
            }
        }

        PromediosParesImares.add("Promedio de numeros Pares: " + calcularPromedio(SoloPares));
        PromediosParesImares.add("Promedio de numeros Impares: " + calcularPromedio(SoloImpares));

        File PathINfile1 = new File("resources/primos.txt");
        String PathINprimos = PathINfile1.getAbsolutePath();
        escribirArchivo(NumerosPrimos, PathINprimos);

        File PathINfile2 = new File("resources/Divisores3000.txt");
        String PathINdivisores3000 = PathINfile2.getAbsolutePath();
        escribirArchivo(NumerosDivisores3000, PathINdivisores3000);

        File PathINfile3 = new File("resources/Promedios.txt");
        String PathINPromedios = PathINfile3.getAbsolutePath();
        escribirArchivo(PromediosParesImares, PathINPromedios);

    }

    private void escribirArchivo(ArrayList<String> Lineas, String pathArchivo) {
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

    private boolean esPrimo(Integer n){
        boolean esPrimo = true;
        for (int i = n-1; i > 1; i--) {
            if (n%2==0){
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
    private boolean esDivisor3000(Integer n){
        return 3000%n==0;
    }
    private boolean esPar(Integer Numero){
        return Numero%2==0;
    }
    private Float calcularPromedio(ArrayList<Integer> lista){
        Float Promedio = 0f;
        Float suma = 0f;
        for (Integer i : lista) {
            suma += i;
        }
        Promedio = suma / lista.size();
        return Promedio;
    }

}
