package ejercicio9;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nmastromarino on 11/05/2016.
 */
public class FileMerger {

    public void mergeArchivosXClaves(String pathIN1, String pathIN2, String PathOut){

        ArrayList<String> Archivo1 = new ArrayList<>();
        ArrayList<String> Archivo2 = new ArrayList<>();
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(pathIN1).getPath()));
            bf.lines().forEach(Archivo1::add);
            bf = new BufferedReader(new FileReader(new File(pathIN2).getPath()));
            bf.lines().forEach(Archivo2::add);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        HashMap<Integer, String> archivo1Map = new HashMap<>();
        HashMap<Integer, String> archivo2Map = new HashMap<>();

        for (String l :
                Archivo1) {
            String[] split = l.split(",");
            archivo1Map.put(Integer.valueOf(split[0]), split[1]);
        }
        for (String j :
                Archivo2) {
            String[] split = j.split(",");
            archivo2Map.put(Integer.valueOf(split[0]), split[1]);
        }
        
        ArrayList<String> Resultado = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : archivo1Map.entrySet()) {
            if (archivo2Map.get(entry.getKey()) != null){
                Resultado.add(entry.getKey()+", "+ entry.getValue().trim() + ", " + archivo2Map.get(entry.getKey()).trim());
            }
        }

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PathOut));
            for (String w: Resultado) {
                bufferedWriter.write(w.trim() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
