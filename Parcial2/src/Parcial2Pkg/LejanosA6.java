package Parcial2Pkg;

/**
 * Created by Nicolas on 13/07/2016.
 */
public class LejanosA6 extends Juego {

    public LejanosA6(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    Integer obtenerPuntaje() {
        Integer puntajeTemp = 0;
        for (int i = 0; i < 10; i++) {
            Integer valorRandom = randInt(1, 10);
            puntajeTemp += Math.abs(6 - valorRandom);
        }
        return puntajeTemp;
    }
}
