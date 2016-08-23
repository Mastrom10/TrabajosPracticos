package Parcial2Pkg;

/**
 * Created by Nicolas on 13/07/2016.
 */
public class NoPlayerException extends Exception {
    @Override
    public String getMessage() {
        return "No Existen player con diamantes/puntos en la sala.";
    }
}
