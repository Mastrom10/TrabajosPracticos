//SE REALIZA CON MAIN
package ejercicio3;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    private final static int PIEDRA = 0;
    private final static int PAPEL = 1;
    private final static int TIJERA = 2;
    private enum Estado { GANO, EMPATO, PERDIO }


    public static void main(String[] args) {
        String opcion = new String();
        Scanner t= new Scanner(System.in);
        Random aleatorio = new Random();
        int aleatorio2;
        int jugada;
        Estado estadojuego = null;

        System.out.println("Ingrese PIEDRA, PAPEL o TIJERA: ");
        opcion=t.next();
        if (opcion.equals("PIEDRA")){
            jugada=PIEDRA;
        }
        else if (opcion.equals("PAPEL")){
            jugada=PAPEL;
        }
        else
            jugada=TIJERA;
        
        aleatorio2=aleatorio.nextInt(3);

        switch (aleatorio2){
            case PIEDRA:
                if (jugada==PIEDRA){
                    estadojuego= Estado.EMPATO;
                }
                else if (jugada==PAPEL){
                    estadojuego= Estado.GANO;
                }
                else estadojuego= Estado.PERDIO;
                break;
            case PAPEL:
                if (jugada==PIEDRA){
                    estadojuego= Estado.PERDIO;
                }
                else if (jugada==PAPEL){
                    estadojuego= Estado.EMPATO;
                }
                else estadojuego= Estado.GANO;
                break;
            case TIJERA:
                if (jugada==PIEDRA){
                    estadojuego= Estado.GANO;
                }
                else if (jugada==PAPEL){
                    estadojuego= Estado.PERDIO;
                }
                else estadojuego= Estado.EMPATO;
                break;
        }
        if (estadojuego== Estado.GANO){
            System.out.println("Has ganado");
            System.out.println(aleatorio2);
        }
        else if (estadojuego== Estado.EMPATO){
            System.out.println("Empate");
            System.out.println(aleatorio2);
        }
        else {
            System.out.println("Has perdido PT");
            System.out.println(aleatorio2);
        }
    }
}