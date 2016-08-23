package Parcial2Pkg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolas on 13/07/2016.
 */
public class SalaDeJuegos {

    private List<Juego> juegos;
    private List<Player> players;

    public SalaDeJuegos() {
        this.juegos = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    private List<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(List<Juego> juegos) {
        this.juegos = juegos;
    }

    public void agregarJuego(Juego juego) {
        juegos.add(juego);
        if (!this.players.contains(juego.getPlayer1())) {
            this.players.add(juego.getPlayer1());
        }
        if (!this.players.contains(juego.getPlayer2())) {
            this.players.add(juego.getPlayer2());
        }
    }

    public Player jugadorConMasDiamantes() throws NoPlayerException {

        Player tempJugadorConMasDiamantes = new Player(".");
        for (Player p : this.getPlayers()) {
            if (p.getDiamantes() > tempJugadorConMasDiamantes.getDiamantes()) {
                tempJugadorConMasDiamantes = p;
            }
        }
        if (tempJugadorConMasDiamantes.equals(new Player("."))) {
            throw new NoPlayerException();
        }
        return tempJugadorConMasDiamantes;
    }

    public Player jugadorConMenosPuntos() throws NoPlayerException {

        Player jugadorConMenosPuntos = new Player(".");
        jugadorConMenosPuntos.setPuntosAcumulados(Integer.MAX_VALUE);
        for (Player p : this.getPlayers()) {
            if (p.getPuntosAcumulados() < jugadorConMenosPuntos.getPuntosAcumulados()) {
                jugadorConMenosPuntos = p;
            }

        }
        if (jugadorConMenosPuntos.equals(new Player("."))) {
            throw new NoPlayerException();
        }
        return jugadorConMenosPuntos;
    }

}
