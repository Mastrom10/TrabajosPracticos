package Ejercicio7;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by nmastromarino on 04/07/2016.
 */
public class JuegoSillas {

    List<Silla> sillas;
    List<Jugadores> jugadores;

    public JuegoSillas(List<Jugadores> jugadores, Integer cantidadJugadores) {
        this.sillas = new ArrayList<>(jugadores.size());
        for (int i = 0; i < jugadores.size(); i++) {
            this.sillas.add(new Silla());
        }
    }


    public void Jugar(){


    }

    public void nuevaVuelta(){

        this.sillas.remove(this.sillas.size()-1);
        EsperarTiempoRandom();



    }

    Boolean EsperarTiempoRandom(){
        System.out.println("Se esperaron: " + Integer.valueOf(randInt(1, 10)).toString()+ " Segundos");
        return true;
    }

    private int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

}
