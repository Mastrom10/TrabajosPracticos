package Ejerciciosvarios;

/**
 * Created by nmastromarino on 27/05/2016.
 */
public class Palindromo {

    public Boolean isCasiPalindromo (String palabra){
        boolean reemplazoDisponible = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            Character ch1 = palabra.charAt(i);
            Character ch2 = palabra.charAt(palabra.length()-i-1);
            if (!ch1.equals(ch2)){
                if (reemplazoDisponible){
                    reemplazoDisponible = false;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
