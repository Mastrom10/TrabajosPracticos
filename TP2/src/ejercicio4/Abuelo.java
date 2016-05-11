package ejercicio4;

public class Abuelo {


    public int desapercibidor() {

        int numeroDesapercibidor = 0;
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                for (int z = 0; z < 10; z++) {
                    for (int w = 0; w < 10; w++) {
                        int potencialNumero = (x * 1000) + (y * 100) + (z * 10) + w;
                        if (potencialNumero == Math.pow(x, y) * Math.pow(z, w)) {
                            numeroDesapercibidor = potencialNumero;
                            x = 10;
                        }
                    }
                }
            }
        }

        return numeroDesapercibidor;
    }
}