package ejercicio7;

/**
 * Created by Nicolas on 08/05/2016.
 */
public class CalculosRecursivos {

    public int calculoFactorial(int numero) {
        return numero <= 0 ? 1 : numero * calculoFactorial(numero - 1);
    }

    public int calculoFibonacci(int numero) {
        if (numero == 0)
            return 0;
        else if (numero == 1)
            return 1;
        else
            return calculoFibonacci(numero - 1) + calculoFibonacci(numero - 2);
    }

}
