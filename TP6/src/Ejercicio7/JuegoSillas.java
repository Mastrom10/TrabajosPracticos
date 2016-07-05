package Ejercicio7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by nmastromarino on 04/07/2016.
 */
public class JuegoSillas {

    private List<Silla> sillas;
    private List<Jugador> jugadores;

    public Jugador Jugar(List<Jugador> jugadores) {
        this.sillas = null;
        this.jugadores = null;
        this.sillas = new ArrayList<>();
        this.jugadores = jugadores;

        for (int i = 0; i < this.jugadores.size(); i++) {
            this.sillas.add(new Silla());
        }

        while (this.sillas.size() > 1) {
            nuevaVuelta();
        }
        System.out.println("Al terminar el juego, ganó " + this.sillas.get(0).getJugador().getNombre());
        return this.sillas.get(0).getJugador();

    }

    private void nuevaVuelta() {

        this.sillas.remove(this.sillas.size()-1);
        EsperarTiempoRandom();
        Collections.shuffle(jugadores);

        for (int i = 0; i < this.sillas.size(); i++) {
            this.sillas.get(i).setJugador(jugadores.get(i));
        }

        System.out.println("y cuando paró la musica perdío " + jugadores.get(this.sillas.size()).getNombre() + "\n");
        jugadores.remove(this.sillas.size());


    }

    private Boolean EsperarTiempoRandom() {
        System.out.println("Se La musica sonó: " + Integer.valueOf(randInt(1, 10)).toString() + " Segundos");
        return true;
    }

    private int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

}
