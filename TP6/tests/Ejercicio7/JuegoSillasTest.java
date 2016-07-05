package Ejercicio7;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class JuegoSillasTest {

    List<Jugador> jugadores;

    @Before
    public void setUp() throws Exception {
        jugadores = new ArrayList<>();

        jugadores.add(new Jugador("Juancito"));
        jugadores.add(new Jugador("Pepito"));
        jugadores.add(new Jugador("Mona"));
        jugadores.add(new Jugador("Raulcito"));
        jugadores.add(new Jugador("Pipita"));
        jugadores.add(new Jugador("el Mesi"));
        jugadores.add(new Jugador("Bill Gates"));
    }

    @After
    public void tearDown() throws Exception {
        jugadores = null;
    }

    @Test
    public void jugar() throws Exception {
        JuegoSillas JS = new JuegoSillas();

        Assert.assertTrue(jugadores.contains(JS.Jugar(jugadores)));

    }

    @Test
    public void ValidarGanadorRandom() throws Exception {
        JuegoSillas JS = new JuegoSillas();
        Jugador Ganador = JS.Jugar(jugadores);

        Boolean funcionaOK = false;
        for (int i = 0; i < 1000; i++) {
            tearDown();
            setUp();
            Jugador GanadorTest = JS.Jugar(jugadores);
            if (!Ganador.equals(GanadorTest)) {
                funcionaOK = true;
                break;
            }

        }

        Assert.assertTrue(funcionaOK);

    }

}