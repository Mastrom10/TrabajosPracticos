package ejercicio8;

import java.util.Scanner;

/**
 * Created by Matias Malerba on 08/05/2016.
 */
public class Caracol {
    /*public boolean subio(int i) {
        boolean subio = i <= 0;
        return subio;
    }
    public int calcular(int p, int s, int b) {
        int i = 0, prom = 0, d;
        if (s > b) {
            prom = s - b;
            i = p / prom;
        }
        return i;
    }
}*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pozo, mtsSubidos, mtsBajados, promDia, dias;

        System.out.print("Metros del pozo: ");
        pozo = entrada.nextInt();
        System.out.print("Cantidad de metros que subio el caracol en el dia: ");
        mtsSubidos = entrada.nextInt();
        System.out.print("Cantidad de metros que bajo el caracol durante la noche: ");
        mtsBajados = entrada.nextInt();

        if (mtsSubidos > mtsBajados) {
            promDia = mtsSubidos - mtsBajados;
            dias = pozo / promDia;
            System.out.println("El caracol lograra salir durante el dia " + (dias));
        }
        else
            System.out.println("El caracol no podra salir");

    }
}