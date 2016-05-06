package Ejercicio1;

/**
 * Created by nmastromarino on 06/05/2016.
 * Ejercicio 1 - Expresión aritmética
 */
public class expresionAritmetica {

    public double CalcularString(String exp){

        double resultado = 0d;

        String[] parts = exp.split("\\s");

        switch (parts[1]){
            case "+":
                resultado = Double.parseDouble(parts[0]) + Double.parseDouble(parts[2]);
                break;
            case "-":
                resultado = Double.parseDouble(parts[0]) - Double.parseDouble(parts[2]);
                break;
            case "*":
                resultado = Double.parseDouble(parts[0]) * Double.parseDouble(parts[2]);
                break;
            case "/":
                resultado = Double.parseDouble(parts[0]) / Double.parseDouble(parts[2]);
                break;
            default:
                break;

        }


        return resultado;
    }
}
