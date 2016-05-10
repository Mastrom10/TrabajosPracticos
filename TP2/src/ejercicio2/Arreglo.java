package ejercicio2;

import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        int valor= 0;
        int[] arreglo= new int[10];
        int masPares = 0, numero, digito, digPares, aux, nMasPares=0;

        for (int i=0; i<arreglo.length; i++) {
            System.out.println("Agregar valor " + (i + 1));
            valor = t.nextInt();
            arreglo[i] = valor;
        }

        for (int i=0; i<arreglo.length; i++){
            numero= arreglo[i];
            digPares = 0;
            aux = numero;
            while (numero>0){
                digito=numero-(numero/10)*10;
                if (digito%2==0){
                    digPares++;
                }
                numero=numero/10;
            }
            if (digPares>masPares){
                masPares=digPares;
                nMasPares=aux;
            }
        }
        System.out.println("El numero con mas pares es " + nMasPares); //imprime el ultimo numero con mayores pares ingresado
    }
}