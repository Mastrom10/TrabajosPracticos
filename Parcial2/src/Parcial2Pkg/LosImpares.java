package Parcial2Pkg;

/**
 * Created by Nicolas on 13/07/2016.
 */
public class LosImpares extends Juego {
    public LosImpares(Player player1, Player player2) {
        super(player1, player2);
    }

    @Override
    Integer obtenerPuntaje() {
        Integer resultado = 0;
        for (int i = 0; i < 10; i++) {
            int numeroTemp = randInt(1, 10);
            if (numeroTemp % 2 != 0) {
                resultado += numeroTemp;
            }
        }
        return resultado;
    }
}
