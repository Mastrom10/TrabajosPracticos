package Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by nmastromarino on 01/07/2016.
 */

public class GenomaHumano{
        private static GenomaHumano instance = null;

    public List<Gen> getModeloGenes() {
        return cloneList(modeloGenes);
    }

    public static List<Gen> cloneList(List<Gen> genList) {
        List<Gen> clonedList = new ArrayList<>(genList.size());
        for (Gen g : genList) {
            clonedList.add(new Gen(g));
        }
        return clonedList;
    }



    private List<Gen> modeloGenes = new ArrayList<>();


        private GenomaHumano() {
            // Exists only to defeat instantiation.
            modeloGenes = new ArrayList<>();
            for (int i = 0; i < 25000 ; i++) {
                Gen g = new Gen(randInt(5, 10), i);
                modeloGenes.add(g);
            }

        }
        public static GenomaHumano getInstance() {
            if(instance == null) {
                instance = new GenomaHumano();
            }
            return instance;
        }

        private int randInt(int min, int max) {
        Random rand = new Random();
            return rand.nextInt((max - min) + 1) + min;
        }



}

