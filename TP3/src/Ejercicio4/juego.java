package Ejercicio4;

import java.util.Scanner;

/**
 * Created by Nicolas on 07/05/2016.
 * Ejecutar el main, este ejercicio no tiene clases de prueba.
 */
public class Juego {

    public static void main(String[] args) {

        System.out.println("Bienvenido al HORCADO, presione la tecla ENTER para continuar:");
        Scanner sc = new Scanner(System.in);
        String _ = sc.nextLine();
        IniciarJuego();
        //ok
    }

    private static void IniciarJuego() {
        Palabra unapalabra = new Palabra();

        for (int i = 1; i < 6; i++) {
            String PalabraConGuiones = "";
            for (char letra : unapalabra.laPalabraGuiones.toCharArray()) {
                PalabraConGuiones += " " + letra;
            }
            System.out.println("Ahora La palabra es: " + PalabraConGuiones);
            System.out.println("Turno Numero " + String.valueOf(i) + " de 5");

            System.out.println("Por favor ingresa una letra: ");
            Scanner sc = new Scanner(System.in);
            String Letra = sc.nextLine();

            if (unapalabra.verificarLetra(Letra.charAt(0))) {
                System.out.println("Muy bien! La Palabra tiene la letra " + Letra.charAt(0));
                if (unapalabra.verificarPalabra()) {
                    System.out.println("GANASTE! Adivinaste la palabra " + unapalabra.laPalabra + " y tan solo cometiste " + String.valueOf(i) + " errores.");
                    return;
                }

                i -= 1;
            } else {
                System.out.println("MAL, la letra \"" + Letra.charAt(0) + "\" no se encuentra.");
            }

        }
        System.out.println("PERDISTE. La palabra era " + unapalabra.laPalabra + " y vos solo adivinaste hasta " + unapalabra.laPalabraGuiones);


    }
}

