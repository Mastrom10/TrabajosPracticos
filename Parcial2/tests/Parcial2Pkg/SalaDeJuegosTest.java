package Parcial2Pkg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 13/07/2016.
 */
public class SalaDeJuegosTest {


    @Test
    public void testJuego1() throws Exception {

        SalaDeJuegos sdj = new SalaDeJuegos();

        System.out.println("\n\nJUEGO 1:");
        Juego j1 = new LejanosA6(new Player("Adrián"), new Player("Andrés"));
        sdj.agregarJuego(j1);
        for (int i = 0; i < 5; i++) {
            j1.jugar();
        }

        System.out.println("\n\nJUEGO 2:");
        Juego j2 = new LejanosA6(new Player("Adriana"), new Player("Ana"));
        sdj.agregarJuego(j2);
        for (int i = 0; i < 6; i++) {
            j2.jugar();
        }

        System.out.println("\n\nJUEGO 3:");
        Juego j3 = new ElMenor(new Player("Carlos"), new Player("Cesar"));
        sdj.agregarJuego(j3);
        for (int i = 0; i < 3; i++) {
            j3.jugar();
        }

        System.out.println("\n\nJUEGO 4:");
        Juego j4 = new ElMenor(new Player("Damian"), new Player("Demian"));
        sdj.agregarJuego(j4);
        for (int i = 0; i < 3; i++) {
            j4.jugar();
        }

        System.out.println("\n\nJUEGO 5:");
        Juego j5 = new LosImpares(new Player("Gustavo"), new Player("Gerardo"));
        sdj.agregarJuego(j5);
        for (int i = 0; i < 10; i++) {
            j5.jugar();
        }

        System.out.println("\n\nJUEGO 6:");
        Juego j6 = new LosImpares(new Player("Marian"), new Player("Maria"));
        sdj.agregarJuego(j6);
        for (int i = 0; i < 15; i++) {
            j6.jugar();
        }

        System.out.println("\n\nJUEGO 7:");
        Juego j7 = new LosImpares(new Player("Norma"), new Player("Nancy"));
        sdj.agregarJuego(j7);
        for (int i = 0; i < 15; i++) {
            j7.jugar();
        }

        System.out.println("Jugador con Más Diamantes: " + sdj.jugadorConMasDiamantes().toString());

    }

}