package Parcial2Pkg;

/**
 * Created by Nicolas on 13/07/2016.
 */
public class ElMenor extends Juego {
    public ElMenor(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    Integer obtenerPuntaje() {
        Integer resultado = 10;

        for (int i = 0; i < 10; i++) {
            Integer numeroTemp = randInt(1, 10);
            if (numeroTemp < resultado) {
                resultado = numeroTemp;
            }
        }
        return resultado;
    }
}
