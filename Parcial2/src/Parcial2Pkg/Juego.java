package Parcial2Pkg;

import java.util.Random;

/**
 * Created by Nicolas on 13/07/2016.
 */
public abstract class Juego {

    private Player player1;
    private Player player2;

    public Juego(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }


    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }


    public void jugar() {

        Integer puntajePlayer1 = obtenerPuntaje();
        Integer puntajePlayer2 = obtenerPuntaje();
        acumularPuntaje(this.getPlayer1(), puntajePlayer1);
        acumularPuntaje(this.getPlayer2(), puntajePlayer2);

        Player playerGanador = puntajePlayer2 > puntajePlayer1 ? this.getPlayer2() : this.getPlayer1();

        otorgarDiamante(playerGanador);

        imprimirResultado(playerGanador);
    }

    abstract Integer obtenerPuntaje();

    private void acumularPuntaje(Player player, Integer puntos) {
        player.setPuntosAcumulados(player.getPuntosAcumulados() + puntos);
    }

    private void otorgarDiamante(Player player) {
        player.setDiamantes(player.getDiamantes() + 1);
    }

    private void imprimirResultado(Player playerGanador) {
        System.out.println("Jugó " + this.getPlayer1().getNombre() + " contra " + this.getPlayer2().getNombre() + "." +
                " Ganó " + playerGanador.getNombre() + " y la cantidad de diamantes que tiene ahora es " + playerGanador.getDiamantes().toString());
    }


    int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

}
